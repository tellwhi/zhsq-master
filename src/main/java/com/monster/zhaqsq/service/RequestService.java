package com.monster.zhaqsq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monster.zhaqsq.bean.Request;
import com.monster.zhaqsq.dao.RequestMapper;

@Service
public class RequestService {

	@Autowired
	RequestMapper requestMapper;
	
	public void insertRequest(Request request) {
		requestMapper.insertSelective(request);
	}
	
//	public Request getRequest(int requestId) {
//		return requestMapper.selectByPrimaryKey(requestId);
//	}
	
}
