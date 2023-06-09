package com.tencent.wxcloudrun.domain.common;

import java.util.Date;

public class CwBanner {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_banner.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_banner.is_deleted
     *
     * @mbg.generated
     */
    private Integer isDeleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_banner.creator_id
     *
     * @mbg.generated
     */
    private String creatorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_banner.creator_name
     *
     * @mbg.generated
     */
    private String creatorName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_banner.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_banner.modifier_id
     *
     * @mbg.generated
     */
    private String modifierId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_banner.modifier_name
     *
     * @mbg.generated
     */
    private String modifierName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_banner.gmt_modified
     *
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_banner.banner_type
     *
     * @mbg.generated
     */
    private Byte bannerType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_banner.img_url
     *
     * @mbg.generated
     */
    private String imgUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_banner.banner_order
     *
     * @mbg.generated
     */
    private Integer bannerOrder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_banner.jump_url
     *
     * @mbg.generated
     */
    private String jumpUrl;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_banner.id
     *
     * @return the value of cw_banner.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_banner.id
     *
     * @param id the value for cw_banner.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_banner.is_deleted
     *
     * @return the value of cw_banner.is_deleted
     *
     * @mbg.generated
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_banner.is_deleted
     *
     * @param isDeleted the value for cw_banner.is_deleted
     *
     * @mbg.generated
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_banner.creator_id
     *
     * @return the value of cw_banner.creator_id
     *
     * @mbg.generated
     */
    public String getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_banner.creator_id
     *
     * @param creatorId the value for cw_banner.creator_id
     *
     * @mbg.generated
     */
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_banner.creator_name
     *
     * @return the value of cw_banner.creator_name
     *
     * @mbg.generated
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_banner.creator_name
     *
     * @param creatorName the value for cw_banner.creator_name
     *
     * @mbg.generated
     */
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_banner.gmt_create
     *
     * @return the value of cw_banner.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_banner.gmt_create
     *
     * @param gmtCreate the value for cw_banner.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_banner.modifier_id
     *
     * @return the value of cw_banner.modifier_id
     *
     * @mbg.generated
     */
    public String getModifierId() {
        return modifierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_banner.modifier_id
     *
     * @param modifierId the value for cw_banner.modifier_id
     *
     * @mbg.generated
     */
    public void setModifierId(String modifierId) {
        this.modifierId = modifierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_banner.modifier_name
     *
     * @return the value of cw_banner.modifier_name
     *
     * @mbg.generated
     */
    public String getModifierName() {
        return modifierName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_banner.modifier_name
     *
     * @param modifierName the value for cw_banner.modifier_name
     *
     * @mbg.generated
     */
    public void setModifierName(String modifierName) {
        this.modifierName = modifierName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_banner.gmt_modified
     *
     * @return the value of cw_banner.gmt_modified
     *
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_banner.gmt_modified
     *
     * @param gmtModified the value for cw_banner.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_banner.banner_type
     *
     * @return the value of cw_banner.banner_type
     *
     * @mbg.generated
     */
    public Byte getBannerType() {
        return bannerType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_banner.banner_type
     *
     * @param bannerType the value for cw_banner.banner_type
     *
     * @mbg.generated
     */
    public void setBannerType(Byte bannerType) {
        this.bannerType = bannerType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_banner.img_url
     *
     * @return the value of cw_banner.img_url
     *
     * @mbg.generated
     */
    public String getImgUrl() {
        return imgUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_banner.img_url
     *
     * @param imgUrl the value for cw_banner.img_url
     *
     * @mbg.generated
     */
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_banner.banner_order
     *
     * @return the value of cw_banner.banner_order
     *
     * @mbg.generated
     */
    public Integer getBannerOrder() {
        return bannerOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_banner.banner_order
     *
     * @param bannerOrder the value for cw_banner.banner_order
     *
     * @mbg.generated
     */
    public void setBannerOrder(Integer bannerOrder) {
        this.bannerOrder = bannerOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_banner.jump_url
     *
     * @return the value of cw_banner.jump_url
     *
     * @mbg.generated
     */
    public String getJumpUrl() {
        return jumpUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_banner.jump_url
     *
     * @param jumpUrl the value for cw_banner.jump_url
     *
     * @mbg.generated
     */
    public void setJumpUrl(String jumpUrl) {
        this.jumpUrl = jumpUrl == null ? null : jumpUrl.trim();
    }
}