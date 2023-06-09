package com.tencent.wxcloudrun.domain.common;

import java.math.BigDecimal;
import java.util.Date;

public class CwPlayer {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_player.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_player.is_deleted
     *
     * @mbg.generated
     */
    private Integer isDeleted;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_player.creator_id
     *
     * @mbg.generated
     */
    private String creatorId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_player.creator_name
     *
     * @mbg.generated
     */
    private String creatorName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_player.gmt_create
     *
     * @mbg.generated
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_player.modifier_id
     *
     * @mbg.generated
     */
    private String modifierId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_player.modifier_name
     *
     * @mbg.generated
     */
    private String modifierName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_player.gmt_modified
     *
     * @mbg.generated
     */
    private Date gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_player.application_id
     *
     * @mbg.generated
     */
    private Integer applicationId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_player.player_name
     *
     * @mbg.generated
     */
    private String playerName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_player.player_sex
     *
     * @mbg.generated
     */
    private Integer playerSex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_player.player_age
     *
     * @mbg.generated
     */
    private Integer playerAge;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_player.player_id_card
     *
     * @mbg.generated
     */
    private String playerIdCard;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_player.player_group
     *
     * @mbg.generated
     */
    private String playerGroup;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_player.charge_id
     *
     * @mbg.generated
     */
    private Integer chargeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_player.charge_amount
     *
     * @mbg.generated
     */
    private BigDecimal chargeAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_player.player_type
     *
     * @mbg.generated
     */
    private Integer playerType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cw_player.player_status
     *
     * @mbg.generated
     */
    private Integer playerStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_player.id
     *
     * @return the value of cw_player.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_player.id
     *
     * @param id the value for cw_player.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_player.is_deleted
     *
     * @return the value of cw_player.is_deleted
     *
     * @mbg.generated
     */
    public Integer getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_player.is_deleted
     *
     * @param isDeleted the value for cw_player.is_deleted
     *
     * @mbg.generated
     */
    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_player.creator_id
     *
     * @return the value of cw_player.creator_id
     *
     * @mbg.generated
     */
    public String getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_player.creator_id
     *
     * @param creatorId the value for cw_player.creator_id
     *
     * @mbg.generated
     */
    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_player.creator_name
     *
     * @return the value of cw_player.creator_name
     *
     * @mbg.generated
     */
    public String getCreatorName() {
        return creatorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_player.creator_name
     *
     * @param creatorName the value for cw_player.creator_name
     *
     * @mbg.generated
     */
    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_player.gmt_create
     *
     * @return the value of cw_player.gmt_create
     *
     * @mbg.generated
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_player.gmt_create
     *
     * @param gmtCreate the value for cw_player.gmt_create
     *
     * @mbg.generated
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_player.modifier_id
     *
     * @return the value of cw_player.modifier_id
     *
     * @mbg.generated
     */
    public String getModifierId() {
        return modifierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_player.modifier_id
     *
     * @param modifierId the value for cw_player.modifier_id
     *
     * @mbg.generated
     */
    public void setModifierId(String modifierId) {
        this.modifierId = modifierId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_player.modifier_name
     *
     * @return the value of cw_player.modifier_name
     *
     * @mbg.generated
     */
    public String getModifierName() {
        return modifierName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_player.modifier_name
     *
     * @param modifierName the value for cw_player.modifier_name
     *
     * @mbg.generated
     */
    public void setModifierName(String modifierName) {
        this.modifierName = modifierName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_player.gmt_modified
     *
     * @return the value of cw_player.gmt_modified
     *
     * @mbg.generated
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_player.gmt_modified
     *
     * @param gmtModified the value for cw_player.gmt_modified
     *
     * @mbg.generated
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_player.application_id
     *
     * @return the value of cw_player.application_id
     *
     * @mbg.generated
     */
    public Integer getApplicationId() {
        return applicationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_player.application_id
     *
     * @param applicationId the value for cw_player.application_id
     *
     * @mbg.generated
     */
    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_player.player_name
     *
     * @return the value of cw_player.player_name
     *
     * @mbg.generated
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_player.player_name
     *
     * @param playerName the value for cw_player.player_name
     *
     * @mbg.generated
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_player.player_sex
     *
     * @return the value of cw_player.player_sex
     *
     * @mbg.generated
     */
    public Integer getPlayerSex() {
        return playerSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_player.player_sex
     *
     * @param playerSex the value for cw_player.player_sex
     *
     * @mbg.generated
     */
    public void setPlayerSex(Integer playerSex) {
        this.playerSex = playerSex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_player.player_age
     *
     * @return the value of cw_player.player_age
     *
     * @mbg.generated
     */
    public Integer getPlayerAge() {
        return playerAge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_player.player_age
     *
     * @param playerAge the value for cw_player.player_age
     *
     * @mbg.generated
     */
    public void setPlayerAge(Integer playerAge) {
        this.playerAge = playerAge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_player.player_id_card
     *
     * @return the value of cw_player.player_id_card
     *
     * @mbg.generated
     */
    public String getPlayerIdCard() {
        return playerIdCard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_player.player_id_card
     *
     * @param playerIdCard the value for cw_player.player_id_card
     *
     * @mbg.generated
     */
    public void setPlayerIdCard(String playerIdCard) {
        this.playerIdCard = playerIdCard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_player.player_group
     *
     * @return the value of cw_player.player_group
     *
     * @mbg.generated
     */
    public String getPlayerGroup() {
        return playerGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_player.player_group
     *
     * @param playerGroup the value for cw_player.player_group
     *
     * @mbg.generated
     */
    public void setPlayerGroup(String playerGroup) {
        this.playerGroup = playerGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_player.charge_id
     *
     * @return the value of cw_player.charge_id
     *
     * @mbg.generated
     */
    public Integer getChargeId() {
        return chargeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_player.charge_id
     *
     * @param chargeId the value for cw_player.charge_id
     *
     * @mbg.generated
     */
    public void setChargeId(Integer chargeId) {
        this.chargeId = chargeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_player.charge_amount
     *
     * @return the value of cw_player.charge_amount
     *
     * @mbg.generated
     */
    public BigDecimal getChargeAmount() {
        return chargeAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_player.charge_amount
     *
     * @param chargeAmount the value for cw_player.charge_amount
     *
     * @mbg.generated
     */
    public void setChargeAmount(BigDecimal chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_player.player_type
     *
     * @return the value of cw_player.player_type
     *
     * @mbg.generated
     */
    public Integer getPlayerType() {
        return playerType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_player.player_type
     *
     * @param playerType the value for cw_player.player_type
     *
     * @mbg.generated
     */
    public void setPlayerType(Integer playerType) {
        this.playerType = playerType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cw_player.player_status
     *
     * @return the value of cw_player.player_status
     *
     * @mbg.generated
     */
    public Integer getPlayerStatus() {
        return playerStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cw_player.player_status
     *
     * @param playerStatus the value for cw_player.player_status
     *
     * @mbg.generated
     */
    public void setPlayerStatus(Integer playerStatus) {
        this.playerStatus = playerStatus;
    }
}