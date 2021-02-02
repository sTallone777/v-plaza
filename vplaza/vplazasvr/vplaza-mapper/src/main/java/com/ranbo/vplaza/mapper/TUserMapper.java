package com.ranbo.vplaza.mapper;

import com.ranbo.vplaza.model.TUser;
import org.springframework.stereotype.Repository;

@Repository
public interface TUserMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(TUser record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(TUser record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    TUser selectByPrimaryKeyWithLock(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    TUser selectByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(TUser record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(TUser record);
}