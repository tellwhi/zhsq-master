package com.monster.zhaqsq.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.monster.zhaqsq.bean.Msg;
import com.monster.zhaqsq.bean.UserAndCom;
import com.monster.zhaqsq.service.UserAndComService;
import com.monster.zhaqsq.utils.cookieUtils;

@Controller
@RequestMapping("/unc")
public class UserAndComController {

	@Autowired
	UserAndComService userAndComService;

	@ModelAttribute
    public boolean userTypeJudge(HttpServletRequest request, HttpServletResponse response) throws Exception{
        if(cookieUtils.getUserType(request).equals("1")){
        	if(cookieUtils.userLoginTimeStatus(request)) {
        		return true;
        	}
        	else {
        		cookieUtils.clearCookie(request, response);
        		return false;
        	}
        }
        else if(cookieUtils.getUserType(request).equals("2")){
        	if(cookieUtils.adminLoginTimeStatus(request)) {
        		return true;
        	}
        	else {
        		cookieUtils.clearCookie(request, response);
        		return false;
        	}
        }
        else {
    		return false;
		}
    }
	
	/**
	 * 保存
	 */
	@RequestMapping(value="/insert",method=RequestMethod.POST)
	@ResponseBody
	public Msg insertUserAndCom(UserAndCom userAndCom, @ModelAttribute("boolean")boolean judge){
    	if (judge) {
			userAndComService.insertUNC(userAndCom);
			return Msg.success();
		}
    	else {
			return Msg.fail();
		}
	}
	
	/**
	 * 根据uid删除
	 */
	@RequestMapping(value="/deleteu",method=RequestMethod.DELETE)
	@ResponseBody
	public Msg deleteByUid(Integer uId, @ModelAttribute("boolean")boolean judge){
    	if (judge) {
			userAndComService.deleteByUId(uId);
			return Msg.success();
		}
    	else {
			return Msg.fail();
		}
	}
	
	/**
	 * 根据cid删除
	 */
	@RequestMapping(value="/deletec",method=RequestMethod.DELETE)
	@ResponseBody
	public Msg deleteByComid(Integer cIdS, @ModelAttribute("boolean")boolean judge){
    	if (judge) {
			userAndComService.deleteByCId(cIdS);
			return Msg.success();
		}
    	else {
			return Msg.fail();
		}
	}
	
	
	/**
	 * 根据uid查询cid
	 */
	@RequestMapping(value = "/getc",method = RequestMethod.GET)
	@ResponseBody
	public Msg getComid(Integer uId, @ModelAttribute("boolean")boolean judge){
    	if (judge) {
			List<UserAndCom> cIdS=userAndComService.seletByUId(uId);
			return Msg.success().add("communities", cIdS);
		}
    	else {
			return Msg.fail();
		}
	}
	
	
	/**
	 * 根据cid查询uid
	 */
	@RequestMapping(value = "/getu",method = RequestMethod.GET)
	@ResponseBody
	public Msg getUid(Integer cId, @ModelAttribute("boolean")boolean judge){
    	if (judge) {
			List<UserAndCom> uIdS=userAndComService.seletByCId(cId);
			return Msg.success().add("users", uIdS);
		}
    	else {
			return Msg.fail();
		}
	}
	
}
