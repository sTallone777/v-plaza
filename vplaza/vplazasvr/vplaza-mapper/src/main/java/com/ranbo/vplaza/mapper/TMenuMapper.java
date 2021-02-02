package com.ranbo.vplaza.mapper;

import com.ranbo.vplaza.model.TMenu;
import org.springframework.stereotype.Repository;

@Repository
public interface TMenuMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Short id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(TMenu record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(TMenu record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    TMenu selectByPrimaryKeyWithLock(Short id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    TMenu selectByPrimaryKey(Short id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(TMenu record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(TMenu record);
}