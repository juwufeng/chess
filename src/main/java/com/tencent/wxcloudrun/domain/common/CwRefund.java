package com.tencent.wxcloudrun.domain.common;

import java.math.BigDecimal;
import java.util.Date;

public class CwRefund {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_refund.id
     *
     * @mbg.generated
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_refund.is_deleted
     *
     * @mbg.generated
     */
    private Integer isDeleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_refund.creator_id
     *
     * @mbg.generated
     */
    private String creatorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_refund.creator_name
     *
     * @mbg.generated
     */
    private String creatorName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_refund.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_refund.modifier_id
     *
     * @mbg.generated
     */
    private String modifierId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_refund.modifier_name
     *
     * @mbg.generated
     */
    private String modifierName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_refund.gmt_modified
     *
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_refund.openid
     *
     * @mbg.generated
     */
    private String openid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_refund.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_refund.order_id
     *
     * @mbg.generated
     */
    private Integer orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_refund.refund_time
     *
     * @mbg.generated
     */
    private Date refundTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_refund.refund_success_time
     *
     * @mbg.generated
     */
    private Date refundSuccessTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_refund.refund_order_code
     *
     * @mbg.generated
     */
    private String refundOrderCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_refund.wx_refund_code
     *
     * @mbg.generated
     */
    private String wxRefundCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_refund.refund_amount
     *
     * @mbg.generated
     */
    private BigDecimal refundAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_refund.refund_status
     *
     * @mbg.generated
     */
    private Integer refundStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_refund.id
     *
     * @return the value of cw_refund.id
     *
     * @mbg.generated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_refund.id
     *
     * @param id the value for cw_refund.id
     *
     * @mbg.generated
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_refund.is_deleted
     *
     * @return the value of cw_refund.is_deleted
     *
     * @mbg.generated
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_refund.is_deleted
     *
     * @param isDeleted the value for cw_refund.is_deleted
     *
     * @mbg.generated
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_refund.creator_id
     *
     * @return the value of cw_refund.creator_id
     *
     * @mbg.generated
     */
    public String getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_refund.creator_id
     *
     * @param creatorId the value for cw_refund.creator_id
     *
     * @mbg.generated
     */
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_refund.creator_name
     *
     * @return the value of cw_refund.creator_name
     *
     * @mbg.generated
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_refund.creator_name
     *
     * @param creatorName the value for cw_refund.creator_name
     *
     * @mbg.generated
     */
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_refund.gmt_create
     *
     * @return the value of cw_refund.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_refund.gmt_create
     *
     * @param gmtCreate the value for cw_refund.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_refund.modifier_id
     *
     * @return the value of cw_refund.modifier_id
     *
     * @mbg.generated
     */
    public String getModifierId() {
        return modifierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_refund.modifier_id
     *
     * @param modifierId the value for cw_refund.modifier_id
     *
     * @mbg.generated
     */
    public void setModifierId(String modifierId) {
        this.modifierId = modifierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_refund.modifier_name
     *
     * @return the value of cw_refund.modifier_name
     *
     * @mbg.generated
     */
    public String getModifierName() {
        return modifierName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_refund.modifier_name
     *
     * @param modifierName the value for cw_refund.modifier_name
     *
     * @mbg.generated
     */
    public void setModifierName(String modifierName) {
        this.modifierName = modifierName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_refund.gmt_modified
     *
     * @return the value of cw_refund.gmt_modified
     *
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_refund.gmt_modified
     *
     * @param gmtModified the value for cw_refund.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_refund.openid
     *
     * @return the value of cw_refund.openid
     *
     * @mbg.generated
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_refund.openid
     *
     * @param openid the value for cw_refund.openid
     *
     * @mbg.generated
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_refund.user_id
     *
     * @return the value of cw_refund.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_refund.user_id
     *
     * @param userId the value for cw_refund.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_refund.order_id
     *
     * @return the value of cw_refund.order_id
     *
     * @mbg.generated
     */
    public Integer getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_refund.order_id
     *
     * @param orderId the value for cw_refund.order_id
     *
     * @mbg.generated
     */
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_refund.refund_time
     *
     * @return the value of cw_refund.refund_time
     *
     * @mbg.generated
     */
    public Date getRefundTime() {
        return refundTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_refund.refund_time
     *
     * @param refundTime the value for cw_refund.refund_time
     *
     * @mbg.generated
     */
    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_refund.refund_success_time
     *
     * @return the value of cw_refund.refund_success_time
     *
     * @mbg.generated
     */
    public Date getRefundSuccessTime() {
        return refundSuccessTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_refund.refund_success_time
     *
     * @param refundSuccessTime the value for cw_refund.refund_success_time
     *
     * @mbg.generated
     */
    public void setRefundSuccessTime(Date refundSuccessTime) {
        this.refundSuccessTime = refundSuccessTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_refund.refund_order_code
     *
     * @return the value of cw_refund.refund_order_code
     *
     * @mbg.generated
     */
    public String getRefundOrderCode() {
        return refundOrderCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_refund.refund_order_code
     *
     * @param refundOrderCode the value for cw_refund.refund_order_code
     *
     * @mbg.generated
     */
    public void setRefundOrderCode(String refundOrderCode) {
        this.refundOrderCode = refundOrderCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_refund.wx_refund_code
     *
     * @return the value of cw_refund.wx_refund_code
     *
     * @mbg.generated
     */
    public String getWxRefundCode() {
        return wxRefundCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_refund.wx_refund_code
     *
     * @param wxRefundCode the value for cw_refund.wx_refund_code
     *
     * @mbg.generated
     */
    public void setWxRefundCode(String wxRefundCode) {
        this.wxRefundCode = wxRefundCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_refund.refund_amount
     *
     * @return the value of cw_refund.refund_amount
     *
     * @mbg.generated
     */
    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_refund.refund_amount
     *
     * @param refundAmount the value for cw_refund.refund_amount
     *
     * @mbg.generated
     */
    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_refund.refund_status
     *
     * @return the value of cw_refund.refund_status
     *
     * @mbg.generated
     */
    public Integer getRefundStatus() {
        return refundStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_refund.refund_status
     *
     * @param refundStatus the value for cw_refund.refund_status
     *
     * @mbg.generated
     */
    public void setRefundStatus(Integer refundStatus) {
        this.refundStatus = refundStatus;
    }
}