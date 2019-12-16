package com.monster.zhaqsq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.monster.zhaqsq.bean.Notice;
import com.monster.zhaqsq.dao.NoticeMapper;

@Service
public class NoticeService {

	@Autowired
	NoticeMapper noticeMapper;
	
	/*
	 * 查询全部公告
	 */
	public List<Notice> getAll() {
		return noticeMapper.selectAll();
	}
	
	/*
	 * 根据id查询公告
	 */
	public Notice getNotice(Integer noId) {
		return noticeMapper.selectByPrimaryKey(noId);
	}
	
	/*
	 * 根据社区id查询公告
	 */
	public List<Notice> getNoticeByComid(Integer comId) {
		return noticeMapper.selectByComid(comId);
	}
	
	/*
	 * 删除公告
	 */
	public void deleteNotice(Integer noId) {
		noticeMapper.deleteByPrimaryKey(noId);
	}
	
	/*
	 * 修改公告
	 */
	public void updateNotice(Notice notice) {
		noticeMapper.updateByPrimaryKeySelective(notice);
	}
	
	/*
	 * 插入公告
	 */
	public void saveNotice(Notice notice) {
		noticeMapper.insertSelective(notice);
	}
	
}
