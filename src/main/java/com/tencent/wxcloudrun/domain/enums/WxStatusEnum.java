package com.tencent.wxcloudrun.domain.enums;

/**
 * 微信状态枚举
 * @author lujunjie
 * @date   2020/12/31
 */
public enum WxStatusEnum {

    FAIL("FAIL","失败"),SUCCESS("SUCCESS","成功");

    private String code;
    private String name;

    WxStatusEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
