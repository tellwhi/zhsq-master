package com.monster.zhaqsq.controller;

import com.monster.zhaqsq.bean.Msg;
import com.monster.zhaqsq.bean.UserBasic;
import com.monster.zhaqsq.service.UserBasicService;
import com.monster.zhaqsq.utils.cookieUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    /**
     * 获取用户个人信息
     */
    @RequestMapping("/info")
    @ResponseBody
    public Msg getUserPersonalInfo(HttpServletRequest request, HttpServletResponse response) throws Exception{
    	if (cookieUtils.getUserType(request).equals("1")) {
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
    public Msg getUserPersonalAllInfo(HttpServletRequest request, HttpServletResponse response) throws Exception{
    	if (cookieUtils.getUserType(request).equals("1")) {
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
    public Msg getCall(@RequestParam("userName")String userName ,
    		HttpServletRequest request, HttpServletResponse response) throws Exception{
    	if (cookieUtils.getUserType(request).equals("1")) {
    		UserBasic userBasic = userbasicService.getWithUserName(userName);
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
    public Msg saveUser(UserBasic userbasic, HttpServletRequest request, HttpServletResponse response) throws Exception{
    	if (cookieUtils.getUserType(request).equals("1")) {
            userbasicService.updateInfo(userbasic);
            return Msg.success();
		}
    	else {
    		return Msg.fail();
    	}
    }

    /**
     * 登录
     * @throws Exception 
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public Msg login(@RequestParam("userPhonenumber")String userPhonenumber,
                     @RequestParam("userPassword")String userPassword,
                     HttpServletRequest request, HttpServletResponse response) throws Exception{
        List<UserBasic> userList = userbasicService.getall();
        for (UserBasic user:userList){
            if (user.getUserPhonenumber().equals(userPhonenumber) && user.getUserPassword().equals(userPassword)){
            	cookieUtils.setCookie(user.getUserName(),user.getUserDept(),response);
                return Msg.success().add("user",user);
            }
        }
        return Msg.fail();
    }

    /**
     * 注册
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public Msg register(@RequestParam("userName")String userName,
                        @RequestParam("userPassword")String userPassword,
                        @RequestParam("userPhonenumber")String userPhonenumber){
    	List<UserBasic> userList = userbasicService.getall();
        for (UserBasic user:userList){
            if (user.getUserName().equals(userName) || user.getUserPhonenumber().equals(userPhonenumber)){
                return Msg.fail();
            }
        }
        userbasicService.register(userName, userPassword,userPhonenumber);
        return Msg.success();
    }
}