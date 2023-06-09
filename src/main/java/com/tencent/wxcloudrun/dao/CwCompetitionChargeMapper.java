package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.domain.common.CwCompetitionCharge;
import com.tencent.wxcloudrun.domain.common.CwCompetitionChargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CwCompetitionChargeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition_charge
     *
     * @mbg.generated
     */
    long countByExample(CwCompetitionChargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition_charge
     *
     * @mbg.generated
     */
    int deleteByExample(CwCompetitionChargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition_charge
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition_charge
     *
     * @mbg.generated
     */
    int insert(CwCompetitionCharge record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition_charge
     *
     * @mbg.generated
     */
    int insertSelective(CwCompetitionCharge record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition_charge
     *
     * @mbg.generated
     */
    List<CwCompetitionCharge> selectByExample(CwCompetitionChargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition_charge
     *
     * @mbg.generated
     */
    CwCompetitionCharge selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition_charge
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CwCompetitionCharge record, @Param("example") CwCompetitionChargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition_charge
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CwCompetitionCharge record, @Param("example") CwCompetitionChargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition_charge
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CwCompetitionCharge record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition_charge
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CwCompetitionCharge record);
}