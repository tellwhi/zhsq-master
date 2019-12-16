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

import com.monster.zhaqsq.bean.CommunityAdmin;
import com.monster.zhaqsq.bean.Msg;
import com.monster.zhaqsq.bean.UserBasic;
import com.monster.zhaqsq.service.CommunityAdminService;
import com.monster.zhaqsq.service.UserBasicService;
import com.monster.zhaqsq.utils.cookieUtils;

@Controller
public class LoginController {

	@Autowired
	UserBasicService userbasicService;
	
	@Autowired
	CommunityAdminService communityAdminService;
	
	/**
     * 用户登录
     * @throws Exception 
     */
    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    @ResponseBody
    public Msg userLogin(@RequestParam("userPhonenumber")String userPhonenumber,
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
     * 用户注册
     */
    @RequestMapping(value = "/user/register", method = RequestMethod.POST)
    @ResponseBody
    public Msg userRegister(@RequestParam("userName")String userName,
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
    
    /**
     * 管理员登录
     * @throws Exception 
     */
    @RequestMapping(value = "/admin/login", method = RequestMethod.POST)
    @ResponseBody
    public Msg adminLogin(@RequestParam("adUsername")String adUsername,
                     @RequestParam("adPassword")String adPassword,
                     HttpServletRequest request, HttpServletResponse response) throws Exception{
        List<CommunityAdmin>  communityAdmins = communityAdminService.getAllComAdmin();
        for (CommunityAdmin communityAdmin:communityAdmins){
            if (communityAdmin.getAdUsername().equals(adUsername) && 
            		communityAdmin.getAdPassword().equals(adPassword)){
            	cookieUtils.setCookie(communityAdmin.getAdUsername() ,"2" ,response);
                return Msg.success().add("communityAdmin", communityAdmin);
            }
        }
        return Msg.fail();
    }

//    /**
//     * 注册
//     */
//    @RequestMapping(value = "/admin/register", method = RequestMethod.POST)
//    @ResponseBody
//    public Msg adminRegister(@RequestParam("userName")String userName,
//                        @RequestParam("userPassword")String userPassword,
//                        @RequestParam("userPhonenumber")String userPhonenumber){
//    	List<UserBasic> userList = userbasicService.getall();
//        for (UserBasic user:userList){
//            if (user.getUserName().equals(userName) || user.getUserPhonenumber().equals(userPhonenumber)){
//                return Msg.fail();
//            }
//        }
//        userbasicService.register(userName, userPassword,userPhonenumber);
//        return Msg.success();
//    }
	
}
