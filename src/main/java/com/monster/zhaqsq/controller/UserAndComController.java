package com.monster.zhaqsq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.monster.zhaqsq.bean.Msg;
import com.monster.zhaqsq.bean.UserAndCom;
import com.monster.zhaqsq.service.UserAndComService;

@Controller
@RequestMapping("/unc")
public class UserAndComController {

	@Autowired
	UserAndComService userAndComService;

	/**
	 * 保存
	 */
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	@ResponseBody
	public Msg insertUserAndCom(UserAndCom userAndCom) {
		userAndComService.insertUNC(userAndCom);
		return Msg.success();
	}
	
	/**
	 * 根据uid删除
	 */
	@RequestMapping(value="/deleteu",method=RequestMethod.DELETE)
	@ResponseBody
	public Msg deleteByUid(Integer uId) {
		userAndComService.deleteByUId(uId);
		return Msg.success();
	}
	
	/**
	 * 根据cid删除
	 */
	@RequestMapping(value="/deletec",method=RequestMethod.DELETE)
	@ResponseBody
	public Msg deleteByComid(Integer cIdS) {
		userAndComService.deleteByCId(cIdS);
		return Msg.success();
	}
	
	
	/**
	 * 根据uid查询cid
	 */
	@RequestMapping(value = "/getc",method = RequestMethod.GET)
	@ResponseBody
	public Msg getComid(Integer uId){
		List<UserAndCom> cIdS=userAndComService.seletByUId(uId);
		return Msg.success().add("communities", cIdS);
	}
	
	
	/**
	 * 根据cid查询uid
	 */
	@RequestMapping(value = "/getu",method = RequestMethod.GET)
	@ResponseBody
	public Msg getUid(Integer cId){
		List<UserAndCom> uIdS=userAndComService.seletByCId(cId);
		return Msg.success().add("users", uIdS);
	}
	
}
