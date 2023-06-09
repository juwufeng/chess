package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.domain.common.CwUserHistory;
import com.tencent.wxcloudrun.domain.common.CwUserHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CwUserHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_user_history
     *
     * @mbg.generated
     */
    long countByExample(CwUserHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_user_history
     *
     * @mbg.generated
     */
    int deleteByExample(CwUserHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_user_history
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_user_history
     *
     * @mbg.generated
     */
    int insert(CwUserHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_user_history
     *
     * @mbg.generated
     */
    int insertSelective(CwUserHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_user_history
     *
     * @mbg.generated
     */
    List<CwUserHistory> selectByExample(CwUserHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_user_history
     *
     * @mbg.generated
     */
    CwUserHistory selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_user_history
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CwUserHistory record, @Param("example") CwUserHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_user_history
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CwUserHistory record, @Param("example") CwUserHistoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_user_history
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CwUserHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_user_history
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CwUserHistory record);
}