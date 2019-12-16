package com.monster.zhaqsq.dao;

import com.monster.zhaqsq.bean.CommunityAdmin;
import com.monster.zhaqsq.bean.CommunityAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommunityAdminMapper {
    long countByExample(CommunityAdminExample example);

    int deleteByExample(CommunityAdminExample example);

    int deleteByPrimaryKey(Integer adId);

    int insert(CommunityAdmin record);

    int insertSelective(CommunityAdmin record);

    List<CommunityAdmin> selectByExample(CommunityAdminExample example);

    CommunityAdmin selectByPrimaryKey(Integer adId);
    
    List<CommunityAdmin> selectAll();

    int updateByExampleSelective(@Param("record") CommunityAdmin record, @Param("example") CommunityAdminExample example);

    int updateByExample(@Param("record") CommunityAdmin record, @Param("example") CommunityAdminExample example);

    int updateByPrimaryKeySelective(CommunityAdmin record);

    int updateByPrimaryKey(CommunityAdmin record);
}