package com.monster.zhaqsq.controller;

import com.monster.zhaqsq.bean.Msg;
import com.monster.zhaqsq.bean.UserBasic;
import com.monster.zhaqsq.service.UserBasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserBasicController {

	@Autowired
	UserBasicService userbasicService;

	/**
	 * 获取用户个人信息
	 */
	@RequestMapping("/info")
	@ResponseBody
	public Msg getUserPersonalInfo() {
		List<UserBasic> userpersonalinfo = userbasicService.getinfo();
		return Msg.success().add("users", userpersonalinfo);
	}

	/**
	 * 获取用户个人信息
	 * 
	 * @throws Exception
	 */
	@RequestMapping("/all")
	@ResponseBody
	public Msg getUserPersonalAllInfo() {
		List<UserBasic> userpersonalinfo = userbasicService.getall();
		return Msg.success().add("users", userpersonalinfo);
	}

	/**
	 * 根据Username获取任务信息
	 */
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	@ResponseBody
	public Msg getCall(int uid) {
		UserBasic userBasic = userbasicService.getWithUid(uid);
		return Msg.success().add("user", userBasic);
	}

	/**
	 * 保存更新后的数据
	 * 
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/{uid}", method = RequestMethod.PUT)
	public Msg saveUser(UserBasic userbasic) {
		userbasicService.updateInfo(userbasic);
		return Msg.success();
	}

}