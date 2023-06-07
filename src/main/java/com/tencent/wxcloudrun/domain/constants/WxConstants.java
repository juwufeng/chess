package com.tencent.wxcloudrun.domain.constants;

/**
 * 微信常量类
 * @author lujunjie
 * @date   2020/12/31
 */
public class WxConstants {

    /**
     * 默认编码
     */
    public static final String DEFAULT_CHARSET = "UTF-8";

    /**
     * 统一下单-扫描支付
     */
    public static String PAY_UNIFIEDORDER = "https://api.mch.weixin.qq.com/pay/unifiedorder";

    /**
     * 微信退款接口
     */
    public static String PAY_REFUND = "https://api.mch.weixin.qq.com/secapi/pay/refund";

    /**
     * 查询订单
     */
    public static String QUERY_ORDER = "https://api.mch.weixin.qq.com/pay/orderquery";

    /**
     * 企业转账给个人接口
     */
    public static String TRANSFERS_URL="https://api.mch.weixin.qq.com/mmpaymkttransfers/promotion/transfers";
    
    /**
     * 请求成功返回码
     */
    public final static String ERRCODE_OK_CODE = "0";
    /**
     * 错误的返回码的Key
     */
    public final static String ERRCODE = "errcode";

    /**
     * 返回状态码
     */
    public final static String RETURN_CODE= "return_code";

    /**
     * access_token 字符串
     */
    public final static String ACCESS_TOKEN = "access_token";

    /**
     * 签名类型 MD5
     */
    public final static String SING_MD5 = "MD5";

    /**
     * 签名类型 HMAC-SHA256
     */
    public final static String SING_HMACSHA256 = "HMAC-SHA256";

}
