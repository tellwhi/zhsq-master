package com.monster.zhaqsq.controller;

import com.monster.zhaqsq.bean.CommunityBasic;
import com.monster.zhaqsq.bean.Msg;
import com.monster.zhaqsq.service.CommunityBasicService;
import com.monster.zhaqsq.utils.cookieUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/community")
public class CommunityBasicController {

	@Autowired
	CommunityBasicService communitybasicService;

	/**
	 * 查询所有社区
	 */
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	@ResponseBody
	public Msg getAllCommunity() {
		List<CommunityBasic> communities = communitybasicService.getall();
		return Msg.success().add("communities", communities);
	}

	/**
	 * 根据comTitle查询社区
	 */
	@RequestMapping(value = "/select", method = RequestMethod.GET)
	@ResponseBody
	public Msg getCommunity(@RequestParam("comTitle") String comTitle) {
		CommunityBasic community = communitybasicService.getCom(comTitle);
		return Msg.success().add("community", community);
	}

	/**
	 * 根据comTitle查询社区
	 */
	@RequestMapping(value = "/like", method = RequestMethod.GET)
	@ResponseBody
	public Msg selectLikeByTitle(@RequestParam("comTitle") String comTitle) {
		List<CommunityBasic> communities = communitybasicService.selectLikeByTitle(comTitle);
		return Msg.success().add("communities", communities);
	}

	/**
	 * 插入新社区
	 */
	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	public Msg saveCom(CommunityBasic communityBasic) {
		List<CommunityBasic> communities = communitybasicService.getall();
		for (CommunityBasic community : communities) {
			if (community.getComTitle().equals(communityBasic.getComTitle())) {
				return Msg.fail();
			}
		}
		communitybasicService.saveCom(communityBasic);
		return Msg.success();
	}

	/**
	 * 修改社区不更新图片
	 */
	@RequestMapping(value = "/comId", method = RequestMethod.PUT)
	@ResponseBody
	public Msg updateCom(CommunityBasic communityBasic) {
		communitybasicService.updateCommunityWithoutPicture(communityBasic);
		return Msg.success();
	}

	/**
	 * 修改社区更新图片
	 */
	@RequestMapping(value = "/updatepic/{callId}", method = RequestMethod.PUT)
	@ResponseBody
	public Msg updateComWithPic(CommunityBasic communityBasic) {
		communitybasicService.updateCommunityWithPicture(communityBasic);
		return Msg.success();

	}

	/**
	 * 删除社区
	 */
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	@ResponseBody
	public Msg deleteCom(@RequestParam("comId") Integer comId) {
		communitybasicService.deletCom(comId);
		return Msg.success();
	}
}
