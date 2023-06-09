package com.tencent.wxcloudrun.domain.common;

import java.math.BigDecimal;
import java.util.Date;

public class CwOrder {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_order.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_order.is_deleted
     *
     * @mbg.generated
     */
    private Integer isDeleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_order.creator_id
     *
     * @mbg.generated
     */
    private String creatorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_order.creator_name
     *
     * @mbg.generated
     */
    private String creatorName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_order.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_order.modifier_id
     *
     * @mbg.generated
     */
    private String modifierId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_order.modifier_name
     *
     * @mbg.generated
     */
    private String modifierName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_order.gmt_modified
     *
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_order.openid
     *
     * @mbg.generated
     */
    private String openid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_order.user_id
     *
     * @mbg.generated
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_order.order_code
     *
     * @mbg.generated
     */
    private String orderCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_order.competition_id
     *
     * @mbg.generated
     */
    private Integer competitionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_order.application_id
     *
     * @mbg.generated
     */
    private Integer applicationId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_order.wx_pay_code
     *
     * @mbg.generated
     */
    private String wxPayCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_order.order_time
     *
     * @mbg.generated
     */
    private Date orderTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_order.pay_time
     *
     * @mbg.generated
     */
    private Date payTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_order.order_amount
     *
     * @mbg.generated
     */
    private BigDecimal orderAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_order.order_status
     *
     * @mbg.generated
     */
    private Integer orderStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_order.pay_status
     *
     * @mbg.generated
     */
    private Integer payStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_order.id
     *
     * @return the value of cw_order.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_order.id
     *
     * @param id the value for cw_order.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_order.is_deleted
     *
     * @return the value of cw_order.is_deleted
     *
     * @mbg.generated
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_order.is_deleted
     *
     * @param isDeleted the value for cw_order.is_deleted
     *
     * @mbg.generated
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_order.creator_id
     *
     * @return the value of cw_order.creator_id
     *
     * @mbg.generated
     */
    public String getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_order.creator_id
     *
     * @param creatorId the value for cw_order.creator_id
     *
     * @mbg.generated
     */
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_order.creator_name
     *
     * @return the value of cw_order.creator_name
     *
     * @mbg.generated
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_order.creator_name
     *
     * @param creatorName the value for cw_order.creator_name
     *
     * @mbg.generated
     */
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_order.gmt_create
     *
     * @return the value of cw_order.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_order.gmt_create
     *
     * @param gmtCreate the value for cw_order.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_order.modifier_id
     *
     * @return the value of cw_order.modifier_id
     *
     * @mbg.generated
     */
    public String getModifierId() {
        return modifierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_order.modifier_id
     *
     * @param modifierId the value for cw_order.modifier_id
     *
     * @mbg.generated
     */
    public void setModifierId(String modifierId) {
        this.modifierId = modifierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_order.modifier_name
     *
     * @return the value of cw_order.modifier_name
     *
     * @mbg.generated
     */
    public String getModifierName() {
        return modifierName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_order.modifier_name
     *
     * @param modifierName the value for cw_order.modifier_name
     *
     * @mbg.generated
     */
    public void setModifierName(String modifierName) {
        this.modifierName = modifierName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_order.gmt_modified
     *
     * @return the value of cw_order.gmt_modified
     *
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_order.gmt_modified
     *
     * @param gmtModified the value for cw_order.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_order.openid
     *
     * @return the value of cw_order.openid
     *
     * @mbg.generated
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_order.openid
     *
     * @param openid the value for cw_order.openid
     *
     * @mbg.generated
     */
    public void setOpenid(String openid) {
        this.openid = openid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_order.user_id
     *
     * @return the value of cw_order.user_id
     *
     * @mbg.generated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_order.user_id
     *
     * @param userId the value for cw_order.user_id
     *
     * @mbg.generated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_order.order_code
     *
     * @return the value of cw_order.order_code
     *
     * @mbg.generated
     */
    public String getOrderCode() {
        return orderCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_order.order_code
     *
     * @param orderCode the value for cw_order.order_code
     *
     * @mbg.generated
     */
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_order.competition_id
     *
     * @return the value of cw_order.competition_id
     *
     * @mbg.generated
     */
    public Integer getCompetitionId() {
        return competitionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_order.competition_id
     *
     * @param competitionId the value for cw_order.competition_id
     *
     * @mbg.generated
     */
    public void setCompetitionId(Integer competitionId) {
        this.competitionId = competitionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_order.application_id
     *
     * @return the value of cw_order.application_id
     *
     * @mbg.generated
     */
    public Integer getApplicationId() {
        return applicationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_order.application_id
     *
     * @param applicationId the value for cw_order.application_id
     *
     * @mbg.generated
     */
    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_order.wx_pay_code
     *
     * @return the value of cw_order.wx_pay_code
     *
     * @mbg.generated
     */
    public String getWxPayCode() {
        return wxPayCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_order.wx_pay_code
     *
     * @param wxPayCode the value for cw_order.wx_pay_code
     *
     * @mbg.generated
     */
    public void setWxPayCode(String wxPayCode) {
        this.wxPayCode = wxPayCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_order.order_time
     *
     * @return the value of cw_order.order_time
     *
     * @mbg.generated
     */
    public Date getOrderTime() {
        return orderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_order.order_time
     *
     * @param orderTime the value for cw_order.order_time
     *
     * @mbg.generated
     */
    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_order.pay_time
     *
     * @return the value of cw_order.pay_time
     *
     * @mbg.generated
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_order.pay_time
     *
     * @param payTime the value for cw_order.pay_time
     *
     * @mbg.generated
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_order.order_amount
     *
     * @return the value of cw_order.order_amount
     *
     * @mbg.generated
     */
    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_order.order_amount
     *
     * @param orderAmount the value for cw_order.order_amount
     *
     * @mbg.generated
     */
    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_order.order_status
     *
     * @return the value of cw_order.order_status
     *
     * @mbg.generated
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_order.order_status
     *
     * @param orderStatus the value for cw_order.order_status
     *
     * @mbg.generated
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_order.pay_status
     *
     * @return the value of cw_order.pay_status
     *
     * @mbg.generated
     */
    public Integer getPayStatus() {
        return payStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_order.pay_status
     *
     * @param payStatus the value for cw_order.pay_status
     *
     * @mbg.generated
     */
    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }
}