package com.monster.zhaqsq.controller;

import com.monster.zhaqsq.bean.Msg;
import com.monster.zhaqsq.bean.UserBasic;
import com.monster.zhaqsq.service.UserBasicService;
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
@RequestMapping("/user")
public class UserBasicController {

    @Autowired
    UserBasicService userbasicService;

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
     * 获取用户个人信息
     */
    @RequestMapping("/info")
    @ResponseBody
    public Msg getUserPersonalInfo(@ModelAttribute("boolean")boolean judge){
    	if (judge) {
            List<UserBasic> userpersonalinfo = userbasicService.getinfo();
            return Msg.success().add("users", userpersonalinfo);
    	}
    	else {
			return Msg.fail();
		}
    }

    /**
     * 获取用户个人信息
     * @throws Exception 
     */
    @RequestMapping("/all")
    @ResponseBody
    public Msg getUserPersonalAllInfo(HttpServletRequest request, @ModelAttribute("boolean")boolean judge){
    	if (judge) {
    		List<UserBasic> userpersonalinfo = userbasicService.getall();
            return Msg.success().add("users", userpersonalinfo);
		}
    	else {
    		return Msg.fail();
    	}
    }
    
    /**
     * 根据Username获取任务信息
     */
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    @ResponseBody
    public Msg getCall(@RequestParam("uid")int uid, @ModelAttribute("boolean")boolean judge){
    	if (judge) {
    		UserBasic userBasic = userbasicService.getWithUid(uid);
    		return Msg.success().add("user",userBasic);
        }
    	else {
    		return Msg.fail();
    	}
    }
    
    /**
     * 保存更新后的数据
     * @throws Exception 
     */
    @ResponseBody
    @RequestMapping(value = "/{uid}",method = RequestMethod.PUT)
    public Msg saveUser(UserBasic userbasic, @ModelAttribute("boolean")boolean judge){
    	if (judge) {
            userbasicService.updateInfo(userbasic);
            return Msg.success();
		}
    	else {
    		return Msg.fail();
    	}
    }

}