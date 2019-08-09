package com.monster.zhaqsq.dao;

import com.monster.zhaqsq.bean.UserAddress;
import com.monster.zhaqsq.bean.UserAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAddressMapper {
    long countByExample(UserAddressExample example);

    int deleteByExample(UserAddressExample example);

    int deleteByPrimaryKey(Integer id);

    //根据username删除地址
    int deleteWithUsername(String username);

    int insert(UserAddress record);

    int insertSelective(UserAddress record);

    List<UserAddress> selectByExample(UserAddressExample example);

    UserAddress selectByPrimaryKey(Integer id);
    
    
    //根据username查找地址
    UserAddress selectWithUsername(String userName);
    
    //只更新地址
    int updateOnlyAddress(@Param("address")String address,@Param("userName") String userName);

    int updateByExampleSelective(@Param("record") UserAddress record, @Param("example") UserAddressExample example);

    int updateByExample(@Param("record") UserAddress record, @Param("example") UserAddressExample example);

    int updateByPrimaryKeySelective(UserAddress record);

    int updateByPrimaryKey(UserAddress record);
}