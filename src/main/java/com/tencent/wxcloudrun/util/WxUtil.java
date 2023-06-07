package com.tencent.wxcloudrun.util;

import com.tencent.wxcloudrun.config.WxConfig;
import com.tencent.wxcloudrun.domain.constants.WxConstants;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;
import org.springframework.util.StringUtils;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.SSLContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 微信工具类
 * @author lujunjie
 * @date   2020/12/31
 */
public class WxUtil {

	/**
	 * 输入流转化为字符串
	 * @param inputStream 流
	 * @return String 字符串
	 * @throws Exception
	 */
	public static String getStreamString(InputStream inputStream) throws Exception{
		StringBuffer buffer=new StringBuffer();
		InputStreamReader inputStreamReader = null;
		BufferedReader bufferedReader = null;
		try{
			inputStreamReader=new InputStreamReader(inputStream, WxConstants.DEFAULT_CHARSET);
			bufferedReader=new BufferedReader(inputStreamReader);
			String line;
			while((line=bufferedReader.readLine())!=null){
				buffer.append(line);
			}
		}catch(Exception e){
			throw new Exception();
		}finally {
			if(bufferedReader != null){
				bufferedReader.close();
			}
			if(inputStreamReader != null){
				inputStreamReader.close();
			}
			if(inputStream != null){
				inputStream.close();
			}
		}
		return buffer.toString();
	}

	/**
	 * 获取随机字符串 Nonce Str
	 * @return String 随机字符串
	 */
	public static String getNonceStr() {
		return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 32);
	}

	/**
	 * 生成签名. 注意，若含有sign_type字段，必须和signType参数保持一致。
	 * @param data 待签名数据
	 * @param key API密钥
	 * @return 签名
	 */
	public static String getSignature(final Map<String, String> data, String key,String signType) throws Exception {
		Set<String> keySet = data.keySet();
		String[] keyArray = keySet.toArray(new String[keySet.size()]);
		Arrays.sort(keyArray);
		StringBuilder sb = new StringBuilder();
		for (String k : keyArray) {
			if (k.equals("sign")) {
				continue;
			}
			//参数值为空，则不参与签名
			if (data.get(k).trim().length() > 0) {
				sb.append(k).append("=").append(data.get(k).trim()).append("&");
			}
		}
		sb.append("key=").append(key);
		if (signType.equals(WxConstants.SING_MD5)) {
			return MD5(sb.toString()).toUpperCase();
		}
		else if (signType.equals(WxConstants.SING_HMACSHA256)) {
			return HMACSHA256(sb.toString(), key);
		}
		else {
			throw new Exception(String.format("Invalid sign_type: %s", signType));
		}
	}

	/**
	 * 生成 MD5
	 * @param data 待处理数据
	 * @return MD5结果
	 */
	public static String MD5(String data) throws Exception {
		MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] array = md.digest(data.getBytes("UTF-8"));
		StringBuilder sb = new StringBuilder();
		for (byte item : array) {
			sb.append(Integer.toHexString((item & 0xFF) | 0x100).substring(1, 3));
		}
		return sb.toString().toUpperCase();
	}

	/**
	 * 生成 HMACSHA256
	 * @param data 待处理数据
	 * @param key 密钥
	 * @return 加密结果
	 * @throws Exception
	 */
	public static String HMACSHA256(String data, String key) throws Exception {
		Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
		SecretKeySpec secret_key = new SecretKeySpec(key.getBytes("UTF-8"), "HmacSHA256");
		sha256_HMAC.init(secret_key);
		byte[] array = sha256_HMAC.doFinal(data.getBytes("UTF-8"));
		StringBuilder sb = new StringBuilder();
		for (byte item : array) {
			sb.append(Integer.toHexString((item & 0xFF) | 0x100).substring(1, 3));
		}
		return sb.toString().toUpperCase();
	}

	/**
	 * @param data Map类型数据
	 * @return XML格式的字符串
	 * @throws Exception
	 */
	public static String mapToXml(Map<String, String> data) throws Exception {
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder= documentBuilderFactory.newDocumentBuilder();
		org.w3c.dom.Document document = documentBuilder.newDocument();
		org.w3c.dom.Element root = document.createElement("xml");
		document.appendChild(root);
		for (String key: data.keySet()) {
			String value = data.get(key);
			if (value == null) {
				value = "";
			}
			value = value.trim();
			org.w3c.dom.Element filed = document.createElement(key);
			filed.appendChild(document.createTextNode(value));
			root.appendChild(filed);
		}
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer transformer = tf.newTransformer();
		DOMSource source = new DOMSource(document);
		transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		StringWriter writer = new StringWriter();
		StreamResult result = new StreamResult(writer);
		transformer.transform(source, result);
		String output = writer.getBuffer().toString(); //.replaceAll("\n|\r", "");
		try {
			writer.close();
		}
		catch (Exception ex) {
		}
		return output;
	}

	/**
	 * 处理 HTTPS API返回数据，转换成Map对象。return_code为SUCCESS时，验证签名。
	 * @param xmlStr API返回的XML格式数据
	 * @return Map类型数据
	 * @throws Exception
	 */
	public static Map<String, String> processResponseXml(String xmlStr,String signType) throws Exception {
		String RETURN_CODE = WxConstants.RETURN_CODE;
		String return_code;
		Map<String, String> respData = xmlToMap(xmlStr);
		if (respData.containsKey(RETURN_CODE)) {
			return_code = respData.get(RETURN_CODE);
		}
		else {
			throw new Exception(String.format("No `return_code` in XML: %s", xmlStr));
		}

		if (return_code.equals("FAIL")) {
			return respData;
		}
		else if (return_code.equals("SUCCESS")) {
			if (isResponseSignatureValid(respData,signType)) {
				return respData;
			}
			else {
				throw new Exception(String.format("Invalid sign value in XML: %s", xmlStr));
			}
		}
		else {
			throw new Exception(String.format("return_code value %s is invalid in XML: %s", return_code, xmlStr));
		}
	}


	/**
	 * XML格式字符串转换为Map
	 * @param strXML XML字符串
	 * @return XML数据转换后的Map
	 * @throws Exception
	 */
	public static Map<String, String> xmlToMap(String strXML) throws Exception {
		try {
			Map<String, String> data = new HashMap<String, String>();
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

			String FEATURE = "http://apache.org/xml/features/disallow-doctype-decl";
			documentBuilderFactory.setFeature(FEATURE, true);

			FEATURE = "http://xml.org/sax/features/external-general-entities";
			documentBuilderFactory.setFeature(FEATURE, false);

			FEATURE = "http://xml.org/sax/features/external-parameter-entities";
			documentBuilderFactory.setFeature(FEATURE, false);

			FEATURE = "http://apache.org/xml/features/nonvalidating/load-external-dtd";
			documentBuilderFactory.setFeature(FEATURE, false);

			documentBuilderFactory.setXIncludeAware(false);
			documentBuilderFactory.setExpandEntityReferences(false);
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			InputStream stream = new ByteArrayInputStream(strXML.getBytes("UTF-8"));
			org.w3c.dom.Document doc = documentBuilder.parse(stream);
			doc.getDocumentElement().normalize();
			NodeList nodeList = doc.getDocumentElement().getChildNodes();
			for (int idx = 0; idx < nodeList.getLength(); ++idx) {
				Node node = nodeList.item(idx);
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					org.w3c.dom.Element element = (org.w3c.dom.Element) node;
					data.put(element.getNodeName(), element.getTextContent());
				}
			}
			try {
				stream.close();
			} catch (Exception ex) {
				// do nothing
			}
			return data;
		} catch (Exception ex) {
			throw ex;
		}
	}

	/**
	 * 判断xml数据的sign是否有效，必须包含sign字段，否则返回false。
	 * @param reqData 向wxpay post的请求数据
	 * @return 签名是否有效
	 * @throws Exception
	 */
	private static boolean isResponseSignatureValid(final Map<String, String> reqData,String signType) throws Exception {
		// 返回数据的签名方式和请求中给定的签名方式是一致的
		return isSignatureValid(reqData, WxConfig.key,signType);
	}

	/**
	 * 判断签名是否正确，必须包含sign字段，否则返回false。
	 * @param data Map类型数据
	 * @param key API密钥
	 * @param signType 签名方式
	 * @return 签名是否正确
	 * @throws Exception
	 */
	public static boolean isSignatureValid(Map<String, String> data, String key, String signType) throws Exception {
		if (!data.containsKey("sign")) {
			return false;
		}
		String sign = data.get("sign");
		return getSignature(data, key, signType).equals(sign);
	}

	/**
	 * 生成商户订单号
	 * @return String
	 */
	public static String mchOrderNo(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		String date = sdf.format(new Date());

		Random random = new Random();
		String fourRandom = String.valueOf(random.nextInt(10000));
		int randLength = fourRandom.length();
		//不足4位继续补充
		if(randLength<4){
			for(int remain = 1; remain <= 4 - randLength; remain ++ ){
				fourRandom += random.nextInt(10)  ;
			}
		}
		return date+fourRandom;
	}

	/**
	 * 返回信息给微信
	 * @param response
	 * @param content 内容
	 * @throws Exception
	 */
	public static void responsePrint(HttpServletResponse response, String content) throws Exception{
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/xml");
		response.getWriter().print(content);
		response.getWriter().flush();
		response.getWriter().close();
	}
	
	/*************************微信企业转账相关接口****************************
	
	/**
     * 元转换为分
     * @param amount
     */
    public static String changeY2F(Double amount){    
        String currency =  amount.toString();  
        int index = currency.indexOf(".");    
        int length = currency.length();    
        Long amLong = 0l;    
        if(index == -1){    
            amLong = Long.valueOf(currency+"00");    
        }else if(length - index >= 3){    
            amLong = Long.valueOf((currency.substring(0, index+3)).replace(".", ""));    
        }else if(length - index == 2){    
            amLong = Long.valueOf((currency.substring(0, index+2)).replace(".", "")+0);    
        }else{    
            amLong = Long.valueOf((currency.substring(0, index+1)).replace(".", "")+"00");    
        }    
        return amLong.toString();    
    }
    
    /**
     * 微信企业转账支付签名sign
     * @param param
     * @param key
     * @return
     */
     public static String createSign(Map<String, String> param,String key){
         //签名步骤一：按字典排序参数
         List list=new ArrayList(param.keySet());
         Object[] ary =list.toArray();
         Arrays.sort(ary);
         list=Arrays.asList(ary);
         String str="";
         for(int i=0;i<list.size();i++){
             str+=list.get(i)+"="+param.get(list.get(i)+"")+"&";
         }
         //签名步骤二：加上key
         str+="key="+key;
         //步骤三：加密并大写
         str=WxUtil.MD5Encode(str,"utf-8").toUpperCase();
         return str;
     }
     public static String MD5Encode(String origin,String charsetName){
         String resultString=null;
         try{
             resultString=new String(origin);
             MessageDigest md=MessageDigest.getInstance("MD5");
             if(StringUtils.hasLength(charsetName)){
                 resultString=byteArrayToHexString(md.digest(resultString.getBytes()));
             }else{
                 resultString=byteArrayToHexString(md.digest(resultString.getBytes(charsetName)));
             }
         }catch(Exception e){
         
         }
         return resultString;
     }
     public static String byteArrayToHexString(byte b[]){
         StringBuffer resultSb=new StringBuffer();
         for(int i=0;i<b.length;i++){
             resultSb.append(WxUtil.byteToHexString(b[i]));
         }
         return resultSb.toString();
     }
     public static String byteToHexString(byte b){
         int n=b;
         if(n<0){
             n+=256;
         }
         int d1=n/16;
         int d2=n%16;
         return WxUtil.hexDigits[d1]+WxUtil.hexDigits[d2];
     }
     public static final String hexDigits[]={ "0", "1", "2", "3", "4", "5",  
    		    "6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };
    
     /**
      * 调用微信企业转账支付接口
      * @param url
      * @param storeId
      * @param params
      * @param contentType
      * @return
      * @throws Exception
      */
     public static String getInSsl(String url,InputStream inputStream,String storeId, 
             String params,String contentType) 
             throws Exception {
         String text = "";
         // 指定读取证书格式为PKCS12
         KeyStore keyStore = KeyStore.getInstance("PKCS12");
        
         try {
             // 指定PKCS12的密码(商户ID)
             keyStore.load(inputStream, storeId.toCharArray());
         } finally {
        	 inputStream.close();
         }

         // Trust own CA and all self-signed certs
         SSLContext sslcontext = SSLContexts.custom().loadKeyMaterial(keyStore, storeId.toCharArray()).build();
         // Allow TLSv1 protocol only
         // 指定TLS版本 
         SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(sslcontext, new String[] { "TLSv1" }, null,
                 SSLConnectionSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
         // 设置httpclient的SSLSocketFactory
         CloseableHttpClient httpclient = HttpClients.custom().setSSLSocketFactory(sslsf).build();
         try {
             HttpPost post = new HttpPost(url);
             StringEntity s = new StringEntity(params,"utf-8");
             if(StringUtils.hasLength(contentType)){
                s.setContentType("application/xml");
             }
             s.setContentType(contentType);
             post.setEntity(s);
             HttpResponse res = httpclient.execute(post);
             HttpEntity entity = res.getEntity();
             text= EntityUtils.toString(entity, "utf-8");
         } finally {
             httpclient.close();
         }
         return text;
     }


}
