package com.monster.zhaqsq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monster.zhaqsq.bean.CommunityAdmin;
import com.monster.zhaqsq.dao.CommunityAdminMapper;

@Service
public class CommunityAdminService {

	@Autowired	
	CommunityAdminMapper communityAdminMapper;
	
	/*
	 * 查询管理员
	 */
	public CommunityAdmin getComAdmin(int adId) {
		return communityAdminMapper.selectByPrimaryKey(adId);
	}
	
	/*
	 * 查询全部管理员
	 */
	public List<CommunityAdmin> getAllComAdmin() {
		return communityAdminMapper.selectAll();
	}
	
	
	/*
	 * 删除管理员
	 */
	public void deleteComAdmin(int adId) {
		communityAdminMapper.deleteByPrimaryKey(adId);
	}
	
	/*
	 * 修改管理员
	 */
	public void updateComAdmin(CommunityAdmin communityAdmin) {
		communityAdminMapper.updateByPrimaryKeySelective(communityAdmin);
	}
	
	/*
	 * 插入管理员
	 */
	public void saveComAdmin(CommunityAdmin communityAdmin) {
		communityAdminMapper.insertSelective(communityAdmin);
	}
	
}
