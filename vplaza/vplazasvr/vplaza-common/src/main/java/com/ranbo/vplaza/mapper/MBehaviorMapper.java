package com.ranbo.vplaza.mapper;

import com.ranbo.vplaza.model.MBehavior;
import org.springframework.stereotype.Repository;

@Repository
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