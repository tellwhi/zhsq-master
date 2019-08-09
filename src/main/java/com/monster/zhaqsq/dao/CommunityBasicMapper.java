package com.monster.zhaqsq.dao;

import com.monster.zhaqsq.bean.CommunityBasic;
import com.monster.zhaqsq.bean.CommunityBasicExample;
import com.monster.zhaqsq.bean.UserAddress;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommunityBasicMapper {
    long countByExample(CommunityBasicExample example);

    int deleteByExample(CommunityBasicExample example);

    int deleteByPrimaryKey(Integer comId);

    int insert(CommunityBasic record);

    int insertSelective(CommunityBasic record);

    List<CommunityBasic> selectByExampleWithBLOBs(CommunityBasicExample example);

    List<CommunityBasic> selectByExample(CommunityBasicExample example);

    CommunityBasic selectByPrimaryKey(Integer comId);
    

    //根据comTitle查找社区
    CommunityBasic selectByComtitle(String comTitle);
    

    int updateByExampleSelective(@Param("record") CommunityBasic record, @Param("example") CommunityBasicExample example);

    int updateByExampleWithBLOBs(@Param("record") CommunityBasic record, @Param("example") CommunityBasicExample example);

    int updateByExample(@Param("record") CommunityBasic record, @Param("example") CommunityBasicExample example);

    int updateByPrimaryKeySelective(CommunityBasic record);

    int updateByPrimaryKeyWithBLOBs(CommunityBasic record);

    int updateByPrimaryKey(CommunityBasic record);
}