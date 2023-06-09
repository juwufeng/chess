package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.domain.common.CwOrder;
import com.tencent.wxcloudrun.domain.common.CwOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CwOrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_order
     *
     * @mbg.generated
     */
    long countByExample(CwOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_order
     *
     * @mbg.generated
     */
    int deleteByExample(CwOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_order
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_order
     *
     * @mbg.generated
     */
    int insert(CwOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_order
     *
     * @mbg.generated
     */
    int insertSelective(CwOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_order
     *
     * @mbg.generated
     */
    List<CwOrder> selectByExample(CwOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_order
     *
     * @mbg.generated
     */
    CwOrder selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_order
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CwOrder record, @Param("example") CwOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_order
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CwOrder record, @Param("example") CwOrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CwOrder record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cw_order
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CwOrder record);
}