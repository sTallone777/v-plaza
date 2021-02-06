package com.ranbo.vplaza.db.mapper;

import com.ranbo.vplaza.db.model.MBehavior;

public interface MBehaviorMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Short id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(MBehavior record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(MBehavior record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    MBehavior selectByPrimaryKeyWithLock(Short id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    MBehavior selectByPrimaryKey(Short id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(MBehavior record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(MBehavior record);
}