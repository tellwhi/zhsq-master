package com.monster.zhaqsq.dao;

import com.monster.zhaqsq.bean.UserBasic;
import com.monster.zhaqsq.bean.UserBasicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserBasicMapper {
    long countByExample(UserBasicExample example);

    int deleteByExample(UserBasicExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(UserBasic record);

    int insertSelective(UserBasic record);

    List<UserBasic> selectByExample(UserBasicExample example);

    UserBasic selectByPrimaryKey(Integer uid);
    
    UserBasic selectByUserName(@Param("userName") String userName);

    /*个人信息*/
    List<UserBasic> selectPersonalInfoByExample(UserBasicExample example);

    UserBasic selectPersonalInfoByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") UserBasic record, @Param("example") UserBasicExample example);

    int updateByExample(@Param("record") UserBasic record, @Param("example") UserBasicExample example);

    int updateByPrimaryKeySelective(UserBasic record);

    int updateByPrimaryKey(UserBasic record);
}