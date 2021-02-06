package com.ranbo.vplaza.db.mapper;

import com.ranbo.vplaza.db.model.MAdminPermission;

public interface MAdminPermissionMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Short id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(MAdminPermission record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(MAdminPermission record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    MAdminPermission selectByPrimaryKeyWithLock(Short id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    MAdminPermission selectByPrimaryKey(Short id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(MAdminPermission record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(MAdminPermission record);
}