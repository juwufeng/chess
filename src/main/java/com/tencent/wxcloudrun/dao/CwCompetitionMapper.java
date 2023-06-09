package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.domain.common.CwCompetition;
import com.tencent.wxcloudrun.domain.common.CwCompetitionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CwCompetitionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition
     *
     * @mbg.generated
     */
    long countByExample(CwCompetitionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition
     *
     * @mbg.generated
     */
    int deleteByExample(CwCompetitionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition
     *
     * @mbg.generated
     */
    int insert(CwCompetition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition
     *
     * @mbg.generated
     */
    int insertSelective(CwCompetition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition
     *
     * @mbg.generated
     */
    List<CwCompetition> selectByExampleWithBLOBs(CwCompetitionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition
     *
     * @mbg.generated
     */
    List<CwCompetition> selectByExample(CwCompetitionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition
     *
     * @mbg.generated
     */
    CwCompetition selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CwCompetition record, @Param("example") CwCompetitionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") CwCompetition record, @Param("example") CwCompetitionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CwCompetition record, @Param("example") CwCompetitionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CwCompetition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(CwCompetition record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CwCompetition record);
}