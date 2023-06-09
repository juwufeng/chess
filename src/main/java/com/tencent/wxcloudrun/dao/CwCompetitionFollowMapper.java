package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.domain.common.CwCompetitionFollow;
import com.tencent.wxcloudrun.domain.common.CwCompetitionFollowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CwCompetitionFollowMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition_follow
     *
     * @mbg.generated
     */
    long countByExample(CwCompetitionFollowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition_follow
     *
     * @mbg.generated
     */
    int deleteByExample(CwCompetitionFollowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition_follow
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition_follow
     *
     * @mbg.generated
     */
    int insert(CwCompetitionFollow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition_follow
     *
     * @mbg.generated
     */
    int insertSelective(CwCompetitionFollow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition_follow
     *
     * @mbg.generated
     */
    List<CwCompetitionFollow> selectByExample(CwCompetitionFollowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition_follow
     *
     * @mbg.generated
     */
    CwCompetitionFollow selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition_follow
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CwCompetitionFollow record, @Param("example") CwCompetitionFollowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition_follow
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CwCompetitionFollow record, @Param("example") CwCompetitionFollowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition_follow
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CwCompetitionFollow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_competition_follow
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CwCompetitionFollow record);
}