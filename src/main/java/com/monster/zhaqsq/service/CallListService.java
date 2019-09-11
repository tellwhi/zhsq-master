package com.monster.zhaqsq.service;

import com.monster.zhaqsq.bean.CallList;
import com.monster.zhaqsq.bean.CallListExample;
import com.monster.zhaqsq.dao.CallListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CallListService {

    @Autowired
    CallListMapper callListMapper;


	/*得到用户个人信息*/
    public List<CallList> getinfo() {
        List<CallList> list = callListMapper.selectByExample(null);
        return list;
    }

    //根据发布者查询
    public List<CallList> selectBysub(Integer subId) {
        List<CallList> list = callListMapper.selectBysub(subId);
        return list;
    }
    
    //根据接收者查询
    public List<CallList> selectByrec(Integer recId) {
        List<CallList> list = callListMapper.selectByrec(recId);
        return list;
    }
    
	/*
	 * 插入新任务
	 */
	public void saveCal(CallList callList) {
		callListMapper.insert(callList);
	}

	/*
	 * 提交人修改
	 */
	public void changeRec(Integer recId, String recName, Integer callId) {
		callListMapper.updateRec(recId, recName, callId);
	}
	
	/*
	 * 时间修改
	 */
	public void changeTime(Integer callId, Date subTime, Date endTime) {
		callListMapper.updateTimeByPrimaryKeySelective(callId, subTime, endTime);
	}

	/*
	 * 修改任务
	 */
	public void updateCallList(CallList callList) {
		callListMapper.updateByPrimaryKeySelective(callList);
	}

	/*
	 * 查询任务
	 */
	public CallList getCal(Integer callId) {
		return callListMapper.selectByPrimaryKey(callId);
	}

	/*
	 * 删除任务
	 */
	public void deletCal(Integer callId) {
		callListMapper.deleteByPrimaryKey(callId);
	}


    /**
     * 查询所有任务
     * @return
     */
    public List<CallList> getAll() {
        return callListMapper.selectByExample(null);
    }

    /**
     * 任务保存
     * @param calllist
     */
    public void saveCall(CallList calllist) {
        callListMapper.insertSelective(calllist);
    }

    /**
     * 按照任务id查询任务
     * @param id
     * @return
     */
    public CallList getCall(Integer id) {
        CallList calllist = callListMapper.selectByPrimaryKey(id);
        return calllist;
    }

    /**
     * 任务删除
     * @param id
     */
    public void deleteCall(Integer id) {
        callListMapper.deleteByPrimaryKey(id);
    }

    public void deleteBatch(List<Integer> ids) {
        CallListExample example = new CallListExample();
        CallListExample.Criteria criteria = example.createCriteria();
        criteria.andCallIdIn(ids);
        callListMapper.deleteByExample(example);
    }
}
