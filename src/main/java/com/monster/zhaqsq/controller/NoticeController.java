package com.monster.zhaqsq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.monster.zhaqsq.bean.Msg;
import com.monster.zhaqsq.bean.Notice;
import com.monster.zhaqsq.service.NoticeService;

@Controller
@RequestMapping("/notice")
public class NoticeController {

	@Autowired
	NoticeService noticeService;
	
	/**
	 * 获取所有公告
	 * 
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public Msg getAllNotice() {
		List<Notice> notices = noticeService.getAll();
		return Msg.success().add("notices", notices);
	}
	
	/**
	 * 根据社区获取公告信息
	 * 
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/getByCom", method = RequestMethod.GET)
	public Msg getNoticeByCom(int comId) {
		List<Notice> notices = noticeService.getNoticeByComid(comId);
		return Msg.success().add("notices", notices);
	}

	/**
	 * 新增公告
	 * 
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	public Msg insertNotice(Notice notice) {
		noticeService.saveNotice(notice);;
		return Msg.success();
	}
	
	/**
	 * 获取公告信息
	 */
	@RequestMapping(value = "/getById", method = RequestMethod.GET)
	@ResponseBody
	public Msg getNotice(int noId) {
		Notice notice = noticeService.getNotice(noId);
		return Msg.success().add("notice", notice);
	}

	/**
	 * 保存更新后的数据
	 * 
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public Msg updateNotice(Notice notice) {
		noticeService.updateNotice(notice);
		return Msg.success();
	}
	
	/**
	 * 删除
	 * 
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public Msg deleteNotice(int noId) {
		noticeService.deleteNotice(noId);
		return Msg.success();
	}
	
}
