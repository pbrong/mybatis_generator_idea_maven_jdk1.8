package com.shanyutech.mingyu.mapper;

import com.shanyutech.mingyu.mapper.TbGuestOrder;
import com.shanyutech.mingyu.mapper.TbGuestOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbGuestOrderMapper {
    long countByExample(TbGuestOrderExample example);

    int deleteByExample(TbGuestOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbGuestOrder record);

    int insertSelective(TbGuestOrder record);

    List<TbGuestOrder> selectByExample(TbGuestOrderExample example);

    TbGuestOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbGuestOrder record, @Param("example") TbGuestOrderExample example);

    int updateByExample(@Param("record") TbGuestOrder record, @Param("example") TbGuestOrderExample example);

    int updateByPrimaryKeySelective(TbGuestOrder record);

    int updateByPrimaryKey(TbGuestOrder record);
}