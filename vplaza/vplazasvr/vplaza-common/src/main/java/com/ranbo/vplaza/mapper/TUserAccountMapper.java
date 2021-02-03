package com.ranbo.vplaza.mapper;

import com.ranbo.vplaza.model.TUserAccount;
import org.springframework.stereotype.Repository;

@Repository
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