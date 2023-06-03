package com.tencent.wxcloudrun.controller;

import com.alibaba.fastjson.JSONObject;
import com.tencent.wxcloudrun.util.PropertiesUtil;
import com.tencent.wxcloudrun.util.WeixinUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;

@Controller
@RequestMapping("weixin")
public class LoginController {

    @Autowired
    private PropertiesUtil propertiesUtil;

    Logger logger = LoggerFactory.getLogger(LoginController.class);

    /**
     * 微信访问时授权登录
     * @return
     */
    @RequestMapping("login")
    public String login(String accountId){
        System.out.println("login");
        //第一步：引导用户进入授权页面同意授权，获取code

        //回调地址
        String backUrl = propertiesUtil.getLoginBackUrl()+"?accountId="+accountId;
        System.out.println(backUrl);
        logger.info("==========================backUrl"+backUrl);

        //授权页面地址
        String url = "https://open.weixin.qq.com/connect/oauth2/authorize?"
                + "appid="+ propertiesUtil.getLoginAppId()
                + "&redirect_uri="+ URLEncoder.encode(backUrl)
                + "&response_type=code"
                + "&scope=snsapi_userinfo"
                + "&state=STATE#wechat_redirect";

        //重定向到授权页面
        return "redirect:"+url;
    }

    @RequestMapping("callBack")
    public String callBack(HttpServletRequest request, HttpServletResponse response) throws Exception{
        //微信服务器回调传回
        String accountId = request.getParameter("accountId");
        System.out.println(accountId);
        logger.info("==========================backUrl"+accountId);

        //第二步：通过code换取网页授权access_token
        //从request里面获取code参数(当微信服务器访问回调地址的时候，会把code参数传递过来)
        String code = request.getParameter("code");
        logger.info("code:"+code);

        //获取code后，请求以下链接获取access_token
        String url = "https://api.weixin.qq.com/sns/oauth2/access_token?appid=" + propertiesUtil.getLoginAppId()
                + "&secret=" + propertiesUtil.getLoginAppSecret()
                + "&code=" + code
                + "&grant_type=authorization_code";

        //通过网络请求方法来请求上面这个接口
        JSONObject jsonObject = WeixinUtil.doGetJson(url);

        System.out.println("==========================jsonObject"+jsonObject);
        logger.info("==========================jsonObject"+jsonObject);

        //从返回的JSON数据中取出access_token和openid，拉取用户信息时用
        String token =  jsonObject.getString("access_token");
        String openid = jsonObject.getString("openid");

        // 第三步：刷新access_token（如果需要）

        // 第四步：拉取用户信息(需scope为 snsapi_userinfo)
        String infoUrl ="https://api.weixin.qq.com/sns/userinfo?access_token=" + token
                + "&openid=" + openid
                + "&lang=zh_CN";
        //通过网络请求方法来请求上面这个接口
        JSONObject userInfo = WeixinUtil.doGetJson(infoUrl);
        String nickname = userInfo.getString("nickname");
        String headimgurl = userInfo.getString("headimgurl");

        System.out.println(userInfo);
        logger.info("==========================userInfo"+userInfo);

        //openid已经存在，用openid获取用户信息，实现登陆
        return "redirect:/phone/index?openId="+openid;
    }

}
