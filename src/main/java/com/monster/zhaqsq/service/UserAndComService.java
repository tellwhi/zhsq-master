package com.monster.zhaqsq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monster.zhaqsq.bean.UserAndCom;
import com.monster.zhaqsq.dao.UserAndComMapper;

@Service
public class UserAndComService {

	
	@Autowired	
	UserAndComMapper userAndComMapper;
	
	public void insertUNC(UserAndCom userAndCom) {
		userAndComMapper.insertSelective(userAndCom);
	}
	
	public void deleteByUId(Integer uId) {
		userAndComMapper.deleteByUId(uId);
	}
	
	public void deleteByCId(Integer cId) {
		userAndComMapper.deleteByCId(cId);
	}
	
	public List<UserAndCom> seletByUId(Integer uId){
		return userAndComMapper.selectWithUId(uId);
	}
	
	public List<UserAndCom> seletByCId(Integer cId){
		return userAndComMapper.selectWithCId(cId);
	}
	
}
