package com.ranbo.vplaza.db.mapper;

import com.ranbo.vplaza.db.model.TAdminInfo;

public interface TAdminInfoMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Short id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(TAdminInfo record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(TAdminInfo record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    TAdminInfo selectByPrimaryKeyWithLock(Short id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    TAdminInfo selectByPrimaryKey(Short id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(TAdminInfo record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(TAdminInfo record);
}