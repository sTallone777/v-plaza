package com.ranbo.vplaza.db.mapper;

import com.ranbo.vplaza.db.model.MUserPermission;

public interface MUserPermissionMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Short id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(MUserPermission record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(MUserPermission record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    MUserPermission selectByPrimaryKeyWithLock(Short id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    MUserPermission selectByPrimaryKey(Short id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(MUserPermission record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(MUserPermission record);
}