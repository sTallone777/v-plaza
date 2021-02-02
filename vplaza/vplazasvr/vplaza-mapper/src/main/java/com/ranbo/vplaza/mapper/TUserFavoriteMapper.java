package com.ranbo.vplaza.mapper;

import com.ranbo.vplaza.model.TUserFavorite;
import org.springframework.stereotype.Repository;

@Repository
public interface TUserFavoriteMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(TUserFavorite record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(TUserFavorite record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    TUserFavorite selectByPrimaryKeyWithLock(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    TUserFavorite selectByPrimaryKey(Long id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKeySelective(TUserFavorite record);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByPrimaryKey(TUserFavorite record);
}