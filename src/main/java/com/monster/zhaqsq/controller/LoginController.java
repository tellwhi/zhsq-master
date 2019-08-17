package com.monster.zhaqsq.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.monster.zhaqsq.bean.Msg;
import com.monster.zhaqsq.bean.UserBasic;
import com.monster.zhaqsq.service.UserBasicService;
import com.monster.zhaqsq.utils.cookieUtils;

@Controller
@RequestMapping("/user")
public class LoginController {

	@Autowired
	UserBasicService userbasicService;
	
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
