package com.ranbo.vplaza.mapper;

import com.ranbo.vplaza.model.MVideoType;
import org.springframework.stereotype.Repository;

@Repository
public interface MVideoTypeMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Short id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(MVideoType record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(MVideoType record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    MVideoType selectByPrimaryKeyWithLock(Short id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    MVideoType selectByPrimaryKey(Short id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(MVideoType record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(MVideoType record);
}