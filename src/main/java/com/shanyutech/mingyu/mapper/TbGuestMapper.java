package com.shanyutech.mingyu.mapper;

import com.shanyutech.mingyu.mapper.TbGuest;
import com.shanyutech.mingyu.mapper.TbGuestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbGuestMapper {
    long countByExample(TbGuestExample example);

    int deleteByExample(TbGuestExample example);

    int deleteByPrimaryKey(Long guestId);

    int insert(TbGuest record);

    int insertSelective(TbGuest record);

    List<TbGuest> selectByExample(TbGuestExample example);

    TbGuest selectByPrimaryKey(Long guestId);

    int updateByExampleSelective(@Param("record") TbGuest record, @Param("example") TbGuestExample example);

    int updateByExample(@Param("record") TbGuest record, @Param("example") TbGuestExample example);

    int updateByPrimaryKeySelective(TbGuest record);

    int updateByPrimaryKey(TbGuest record);
}