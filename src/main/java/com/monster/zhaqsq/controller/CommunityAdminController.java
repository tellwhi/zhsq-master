package com.monster.zhaqsq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.monster.zhaqsq.bean.CommunityAdmin;
import com.monster.zhaqsq.bean.Msg;
import com.monster.zhaqsq.service.CommunityAdminService;

@Controller
@RequestMapping("/admin")
public class CommunityAdminController {

	@Autowired
	CommunityAdminService communityAdminService;
	

	/**
	 * 获取管理员信息
	 */
	@RequestMapping(value = "/getById", method = RequestMethod.GET)
	@ResponseBody
	public Msg getNotice(int adId) {
		CommunityAdmin communityAdmin = communityAdminService.getComAdmin(adId);
		return Msg.success().add("communityAdmin", communityAdmin);
	}

	/**
	 * 保存更新后的数据
	 * 
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public Msg updateNotice(CommunityAdmin communityAdmin) {
		communityAdminService.updateComAdmin(communityAdmin);
		return Msg.success();
	}
	
}
