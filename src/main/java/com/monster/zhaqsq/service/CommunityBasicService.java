package com.monster.zhaqsq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monster.zhaqsq.bean.CommunityBasic;
import com.monster.zhaqsq.dao.CommunityBasicMapper;

import java.util.List;

@Service
public class CommunityBasicService {
	
	@Autowired
	CommunityBasicMapper communityBasicMapper;

	/**
	 * 查询所有社区
	 */
	public List<CommunityBasic> getall(){
		return communityBasicMapper.selectByExample(null);
	}

	/**
	 * 根据comTitle查询社区
	 * @param comTitle
	 */
	public CommunityBasic getCom(String comTitle) {
		return communityBasicMapper.selectByComtitle(comTitle);
	}
	
	/**
	 * 根据comTitle模糊查询
	 * @param comTitle
	 */
	public List<CommunityBasic> selectLikeByTitle(String comTitle) {
		return communityBasicMapper.selectLikeByTitle(comTitle);
	}
	
	/**
	 *插入新社区
	 */
	public void saveCom(CommunityBasic communityBasic){
		communityBasicMapper.insert(communityBasic);
	}
	
	/**
	 * 修改社区不更新图片
	 */
	public void updateCommunityWithoutPicture(CommunityBasic communityBasic) {
		communityBasicMapper.updateByPrimaryKeySelective(communityBasic);
	}
	
	/**
	 * 修改社区更新图片
	 */
	public void updateCommunityWithPicture(CommunityBasic communityBasic) {
		communityBasicMapper.updateByPrimaryKeyWithBLOBs(communityBasic);
	}
	
	/**
	 * 删除社区
	 */
	public void deletCom(Integer comId) {
		communityBasicMapper.deleteByPrimaryKey(comId);
	}

}
