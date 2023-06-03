package com.tencent.wxcloudrun.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("propertiesUtil")
public class PropertiesUtil {

	@Value("${yypay.title}")
	private String title;
	@Value("${yypay.hospitalName}")
	private String hospitalName;
	@Value("${yypay.pwd}")
	private String pwd;

	@Value("${yypay.apiUrl}")
	private String apiUrl;
	@Value("${yypay.sopAction}")
	private String sopAction;
	@Value("${yypay.inspectionSopAction}")
	private String inspectionSopAction;

	@Value("${yypay.weixin.login.backUrl}")
	private String loginBackUrl;
	@Value("${yypay.weixin.login.appId}")
	private String loginAppId;
	@Value("${yypay.weixin.login.appSecret}")
	private String loginAppSecret;

	@Value("${yypay.dhccAPIURl}")
	private String dhccAPIURl;
	@Value("${yypay.inspectionAPI}")
	private String inspectionAPI;
	@Value("${yypay.apiclientCert}")
	private String apiclientCert;
	@Value("${yypay.pdfCache}")
	private String pdfCache;
	@Value("${yypay.apiBase}")
	private String apiBase;
	@Value("${yypay.checkPdfBase}")
	private String checkPdfBase;

	public String getCheckPdfBase() {
		return checkPdfBase;
	}

	public void setCheckPdfBase(String checkPdfBase) {
		this.checkPdfBase = checkPdfBase;
	}

	public String getApiBase() {
		return apiBase;
	}

	public void setApiBase(String apiBase) {
		this.apiBase = apiBase;
	}

	public String getPdfCache() {
		return pdfCache;
	}

	public void setPdfCache(String pdfCache) {
		this.pdfCache = pdfCache;
	}

	public String getDhccAPIURl() {
		return dhccAPIURl;
	}

	public void setDhccAPIURl(String dhccAPIURl) {
		this.dhccAPIURl = dhccAPIURl;
	}

	public String getInspectionAPI() {
		return inspectionAPI;
	}

	public void setInspectionAPI(String inspectionAPI) {
		this.inspectionAPI = inspectionAPI;
	}

	public String getApiclientCert() {
		return apiclientCert;
	}

	public void setApiclientCert(String apiclientCert) {
		this.apiclientCert = apiclientCert;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLoginAppId() {
		return loginAppId;
	}

	public void setLoginAppId(String loginAppId) {
		this.loginAppId = loginAppId;
	}

	public String getLoginAppSecret() {
		return loginAppSecret;
	}

	public void setLoginAppSecret(String loginAppSecret) {
		this.loginAppSecret = loginAppSecret;
	}

	public String getLoginBackUrl() {
		return loginBackUrl;
	}

	public void setLoginBackUrl(String loginBackUrl) {
		this.loginBackUrl = loginBackUrl;
	}

	public String getInspectionSopAction() {
		return inspectionSopAction;
	}

	public void setInspectionSopAction(String inspectionSopAction) {
		this.inspectionSopAction = inspectionSopAction;
	}

	public String getSopAction() {
		return sopAction;
	}

	public void setSopAction(String sopAction) {
		this.sopAction = sopAction;
	}

	public String getApiUrl() {
		return apiUrl;
	}

	public void setApiUrl(String apiUrl) {
		this.apiUrl = apiUrl;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
