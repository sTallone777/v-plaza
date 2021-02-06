package com.ranbo.vplaza.db.mapper;

import com.ranbo.vplaza.db.model.TUserAccount;

public interface TUserAccountMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(TUserAccount record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(TUserAccount record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    TUserAccount selectByPrimaryKeyWithLock(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    TUserAccount selectByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(TUserAccount record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(TUserAccount record);
}