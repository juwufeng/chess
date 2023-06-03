package com.tencent.wxcloudrun.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 微信配置类
 * @author lujunjie
 * @date   2020/12/31
 */
@Component
public class WxConfig {

    /**
     * 开发者ID
     */
    public static String appId;
    @Value("${yypay.weixin.login.appId}")
    public void setAppId(String appId) {
        WxConfig.appId = appId;
    }

    /**
     * 开发者密码
     */
    public static String appSecret;
    @Value("${yypay.weixin.login.appSecret}")
    public void setAppSecret(String appSecret) {
        WxConfig.appSecret = appSecret;
    }

    /**
     * 商户号
     */
    public static String mchId;
    @Value("${wx.mchId}")
    public void setMchId(String mchId) {
        WxConfig.mchId = mchId;
    }


    /**
     * API密钥
     */
    public static String key;
    @Value("${wx.key}")
    public void setKey(String key) {
        WxConfig.key = key;
    }

    /**
     * 统一下单-通知链接
     */
    public static String unifiedorderNotifyUrl;
    @Value("${wx.unifiedorder.notifyUrl}")
    public void setUnifiedorderNotifyUrl(String unifiedorderNotifyUrl) {
        WxConfig.unifiedorderNotifyUrl = unifiedorderNotifyUrl;
    }

    /**
     * 连接超时时间
     */
    public static Integer connectionTimeout;
    @Value("${https.connectionTimeout}")
    public void setConnectionTimeout(Integer connectionTimeout) {
        WxConfig.connectionTimeout = connectionTimeout;
    }

    /**
     * 连接超时时间
     */
    public static Integer readTimeout;
    @Value("${https.readTimeout}")
    public void setReadTimeout(Integer readTimeout) {
        WxConfig.readTimeout = readTimeout;
    }

}
