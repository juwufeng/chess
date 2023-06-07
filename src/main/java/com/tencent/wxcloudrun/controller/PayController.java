package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.config.WxConfig;
import com.tencent.wxcloudrun.domain.constants.WxConstants;
import com.tencent.wxcloudrun.domain.enums.WxStatusEnum;
import com.tencent.wxcloudrun.http.HttpsClient;
import com.tencent.wxcloudrun.util.PropertiesUtil;
import com.tencent.wxcloudrun.util.WxUtil;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContexts;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.net.ssl.SSLContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.security.KeyStore;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("wxPay")
public class PayController {

    @Autowired
    private PropertiesUtil propertiesUtil;

    Logger logger = LoggerFactory.getLogger(PayController.class);

    /**
     * 微信JSAPI方式支付
     * @return
     */
    @RequestMapping("wxPayUrl")
    @ResponseBody
    public Map wxPayUrl(String openId,String outTradeNo,String body,String totalFee){
        try {
            HashMap<String, String> orderMap = new HashMap<String, String>();
            //公众账号ID
            orderMap.put("appid", WxConfig.appId);
            //商户号
            orderMap.put("mch_id",WxConfig.mchId);
            //随机字符串
            orderMap.put("nonce_str", WxUtil.getNonceStr());
            //商品描述
            orderMap.put("body",body);
            //商户订单号
            orderMap.put("out_trade_no",outTradeNo);
            //标价币种
            orderMap.put("fee_type","CNY");
            //标价金额
            orderMap.put("total_fee",totalFee);
            //用户的IP
            orderMap.put("spbill_create_ip","123.12.12.123");
            //通知地址
            orderMap.put("notify_url", WxConfig.unifiedorderNotifyUrl);
            long currentTime = System.currentTimeMillis();
            //当前时间
            Date startDate = new Date(currentTime);
            //当前时间 + 30分钟
            Date expireDate = new Date(currentTime + 30 * 60 * 1000);
            SimpleDateFormat yyyyMMddHHmmssFormat = new SimpleDateFormat("yyyyMMddHHmmss");
            //交易起始时间
            orderMap.put("time_start",yyyyMMddHHmmssFormat.format(startDate));
            //交易结束时间 -- 当前时间+30 分钟
            orderMap.put("time_expire",yyyyMMddHHmmssFormat.format(expireDate));
            //交易类型
            orderMap.put("trade_type","JSAPI");
            //openid
            orderMap.put("openid", openId);
            //签名类型
            orderMap.put("sign_type", WxConstants.SING_MD5);
            //签名
            orderMap.put("sign",WxUtil.getSignature(orderMap, WxConfig.key,WxConstants.SING_MD5));


            String orderXML = WxUtil.mapToXml(orderMap);
            String reponseString = HttpsClient.httpsRequestReturnString(WxConstants.PAY_UNIFIEDORDER,HttpsClient.METHOD_POST,orderXML);
            Map<String,String> reponseMap = WxUtil.processResponseXml(reponseString,WxConstants.SING_MD5);

            String returnCode = reponseMap.get("return_code");
            String errorMessage = null;
            if (WxStatusEnum.SUCCESS.getCode().equals(returnCode)) {
                String resultCode = reponseMap.get("result_code");
                if (WxStatusEnum.SUCCESS.getCode().equals(resultCode)) {
                    String prepay_id = reponseMap.get("prepay_id");
                    logger.info("#################"+prepay_id+"#################");

                    Map<String, String> payMap = new HashMap<String, String>();
                    payMap.put("appId", WxConfig.appId);
                    payMap.put("timeStamp", System.currentTimeMillis()+"");
                    payMap.put("nonceStr", WxUtil.getNonceStr());
                    payMap.put("package", "prepay_id=" + prepay_id);
                    payMap.put("signType",WxConstants.SING_MD5);
                    String paySign = WxUtil.getSignature(payMap, WxConfig.key,WxConstants.SING_MD5);
                    payMap.put("paySign", paySign);
                    return payMap;
                } else {
                    errorMessage = reponseMap.get("err_code_des");
                }
            } else {
                errorMessage = reponseMap.get("return_msg");
            }
            if(StringUtils.hasLength(errorMessage)){
                logger.info("下单错误 错误原因："+errorMessage);
            }
        } catch (Exception e) {
            logger.info(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 微信退款
     * @return
     */
    @RequestMapping("returnFee")
    @ResponseBody
    public Map returnFee(String outTradeNo,String totalFee){
        HashMap<String, String> orderMap = new HashMap<String, String>();
        Map<String, String> payMap = new HashMap<String, String>();
        try {
            //公众账号ID
            orderMap.put("appid", WxConfig.appId);
            //商户号
            orderMap.put("mch_id",WxConfig.mchId);
            //随机字符串
            orderMap.put("nonce_str", WxUtil.getNonceStr());
            //签名类型
            orderMap.put("sign_type",WxConstants.SING_MD5);
            //商户订单号
            orderMap.put("out_trade_no",outTradeNo);
            //商户退款单号
            orderMap.put("out_refund_no", WxUtil.mchOrderNo());
            //标价金额
            orderMap.put("total_fee",totalFee);
            //退款总金额,订单总金额,单位为分,只能为整数
            orderMap.put("refund_fee",totalFee);
            //签名
            orderMap.put("sign",WxUtil.getSignature(orderMap, WxConfig.key,WxConstants.SING_MD5));
            String orderXML = WxUtil.mapToXml(orderMap);

            //设置密钥
            KeyStore keyStore = KeyStore.getInstance("PKCS12");
            FileInputStream instream = new FileInputStream(new File(propertiesUtil.getApiclientCert()));
            try {
                keyStore.load(instream,WxConfig.mchId.toCharArray());
            }finally {
                instream.close();
            }

            //发起带有安全密钥的http请求
            SSLContext sslcontext = SSLContexts.custom().loadKeyMaterial(keyStore,
                    WxConfig.mchId.toCharArray()).build();
            SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(
                    sslcontext, new String[] { "TLSv1" }, null,
                    SSLConnectionSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER);
            CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(sslsf).build();
            HttpPost httpPost = new HttpPost(WxConstants.PAY_REFUND);
            StringEntity stringEntity = new StringEntity(orderXML,"UTF-8");
            httpPost.addHeader("Content-Type", "text/xml");
            httpPost.setEntity(stringEntity);
            HttpResponse responseEntry = httpClient.execute(httpPost);
            HttpEntity entity = responseEntry.getEntity();
            String reponseString = EntityUtils.toString(entity, "UTF-8");
            Map<String,String> reponseMap = WxUtil.processResponseXml(reponseString,WxConstants.SING_MD5);

            String returnCode = reponseMap.get("return_code");
            payMap.put("returnCode",returnCode);
            String errorMessage = null;
            if (WxStatusEnum.SUCCESS.getCode().equals(returnCode)) {
                String resultCode = reponseMap.get("result_code");
                payMap.put("resultCode",resultCode);
                if (WxStatusEnum.SUCCESS.getCode().equals(resultCode)) {
                    payMap.put("msg","退款成功");
                } else {
                    errorMessage = reponseMap.get("err_code_des");
                }
            } else {
                errorMessage = reponseMap.get("return_msg");
            }
            if(StringUtils.hasLength(errorMessage)){
                logger.info("退款错误 错误原因："+errorMessage);
                payMap.put("errorMessage",errorMessage);
            }
        } catch (Exception e) {
            logger.info(e.getMessage());
            e.printStackTrace();
            payMap.put("errorMessage","系统错误:"+e.getMessage());
        }
        return payMap;
    }

    final private String signType = WxConstants.SING_MD5;
    /**
     *
     */
    @RequestMapping("/wxPayShow")
    public String wxPayShow(){
        System.out.println("???");
       return "hhht-yy-client/html/wxPayShow";
    }

    /**
     * 统一下单-微信支付平台回调链接
     */
    @RequestMapping("/unifiedorderNotify")
    public void unifiedorderNotify(HttpServletRequest request, HttpServletResponse response) throws Exception{

        //商户订单号
        String outTradeNo = null;
        String xmlContent = "<xml>" +
                "<return_code><![CDATA[FAIL]]></return_code>" +
                "<return_msg><![CDATA[签名失败]]></return_msg>" +
                "</xml>";
        try{
            String requstXml = WxUtil.getStreamString(request.getInputStream());
            Map<String,String> map = WxUtil.xmlToMap(requstXml);
            String returnCode= map.get(WxConstants.RETURN_CODE);
            //校验一下 ，判断是否已经支付成功
            if(StringUtils.hasLength(returnCode) && returnCode.equals("SUCCESS")  &&  WxUtil.isSignatureValid(map, WxConfig.key,signType)){
                System.out.println("------------"+"微信支付平台通知：支付成功"+"------------");
                System.out.println("微信支付平台通知："+"requstXml : " + requstXml);
                logger.info("------------"+"微信支付平台通知：支付成功"+"------------");
                logger.info("微信支付平台通知："+"requstXml : " + requstXml);
                //微信订单号
                outTradeNo = map.get("out_trade_no");
                //微信支付订单号
                String transactionId = map.get("transaction_id");
                //支付完成时间
                SimpleDateFormat payFormat= new SimpleDateFormat("yyyyMMddHHmmss");
                Date payDate = payFormat.parse(map.get("time_end"));
                SimpleDateFormat systemFormat= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String payDateStr = systemFormat.format(payDate);

                HashMap<String,Object> returnMap = new HashMap<>();
                returnMap.put("outTradeNo",outTradeNo);
                returnMap.put("transactionId",transactionId);
                returnMap.put("payDateStr",payDateStr);

                xmlContent = "<xml>" +
                        "<return_code><![CDATA[SUCCESS]]></return_code>" +
                        "<return_msg><![CDATA[OK]]></return_msg>" +
                        "</xml>";
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.info("异常信息为："+e.getMessage());
        }
        //返回信息给微信
        WxUtil.responsePrint(response,xmlContent);
    }

}
