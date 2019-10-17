package com.monster.zhaqsq.dao;

import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.monster.zhaqsq.bean.CallList;
import com.monster.zhaqsq.bean.CallListExample;

public interface CallListMapper {
    long countByExample(CallListExample example);

    int deleteByExample(CallListExample example);

    int deleteByPrimaryKey(Integer callId);

    int insert(CallList record);

    int insertSelective(CallList record);

    List<CallList> selectByExample(CallListExample example);

    CallList selectByPrimaryKey(Integer callId);
    
    List<CallList> selectBysub(Integer subId);
    
    List<CallList> selectByrec(Integer recId);
    
    //查询用户所在社区任务
    List<CallList> selectComCall(@Param("subId")Integer subId, @Param("callNow")Integer callNow);
    
    //更新接收人
    int updateRec(@Param("recId")Integer recId, @Param("recName")String recName, @Param("callId")Integer callId);


    int updateByExampleSelective(@Param("record") CallList record, @Param("example") CallListExample example);
    
    int updateTimeByPrimaryKeySelective(@Param("callId")Integer callId, @Param("subTime") Date subTime, @Param("endTime") Date endTime);

    int updateByExample(@Param("record") CallList record, @Param("example") CallListExample example);

    int updateByPrimaryKeySelective(CallList record);

    int updateByPrimaryKey(CallList record);
}