package com.monster.zhaqsq.controller;

import com.monster.zhaqsq.bean.CommunityBasic;
import com.monster.zhaqsq.bean.Msg;
import com.monster.zhaqsq.service.CommunityBasicService;
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
@RequestMapping("/community")
public class CommunityBasicController {

    @Autowired
    CommunityBasicService communitybasicService;

    /**
     * 查询所有社区
     */
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    @ResponseBody
    public Msg getAllCommunity(HttpServletRequest request, HttpServletResponse response) throws Exception{
    	if (cookieUtils.getUserType(request).equals("1")) {
    		List<CommunityBasic> communities = communitybasicService.getall();
    		return Msg.success().add("communities", communities);
    	}
    	else {
			return Msg.fail();
		}
    }

    /**
     * 根据comTitle查询社区
     */
    @RequestMapping(value = "/select",method = RequestMethod.GET)
    @ResponseBody
    public Msg getCommunity(@RequestParam("comTitle")String comTitle,
    						HttpServletRequest request, HttpServletResponse response) throws Exception{
    	if (cookieUtils.getUserType(request).equals("1")) {
    		CommunityBasic community = communitybasicService.getCom(comTitle);
    		return Msg.success().add("community", community);
    	}
    	else {
			return Msg.fail();
		}
    }

    /**
     *插入新社区
     */
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @ResponseBody
    public Msg saveCom(CommunityBasic communityBasic,
    				   HttpServletRequest request, HttpServletResponse response) throws Exception{
    	if (cookieUtils.getUserType(request).equals("1")) {
    		List<CommunityBasic> communities = communitybasicService.getall();
    		for(CommunityBasic community:communities)
    		{
    			if (community.getComTitle().equals(communityBasic.getComTitle())){
    				return Msg.fail();
    			}
    		}
    		communitybasicService.saveCom(communityBasic);
    		return Msg.success();
    	}
    	else {
			return Msg.fail();
		}
    }

    /**
     * 修改社区不更新图片
     */
    @RequestMapping(value = "/comId",method = RequestMethod.PUT)
    @ResponseBody
    public Msg updateCom(CommunityBasic communityBasic, 
    					HttpServletRequest request, HttpServletResponse response) throws Exception{
    	if (cookieUtils.getUserType(request).equals("1")) {
    		communitybasicService.updateCommunityWithoutPicture(communityBasic);
    		return Msg.success();
    	}
    	else {
			return Msg.fail();
		}
    }


    /**
     * 修改社区更新图片
     */
    @RequestMapping(value = "/updatepic/{callId}",method = RequestMethod.PUT)
    @ResponseBody
    public Msg updateComWithPic(CommunityBasic communityBasic, 
			HttpServletRequest request, HttpServletResponse response) throws Exception{
    	if (cookieUtils.getUserType(request).equals("1")) {
    		communitybasicService.updateCommunityWithPicture(communityBasic);
    		return Msg.success();
    	}
    	else {
			return Msg.fail();
		}
    }

    /**
     * 删除社区
     */
    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    @ResponseBody
    public Msg deleteCom(@RequestParam("comId")Integer comId, 
			HttpServletRequest request, HttpServletResponse response) throws Exception{
    	if (cookieUtils.getUserType(request).equals("1")) {
    		communitybasicService.deletCom(comId);
        	return Msg.success();
    	}
    	else {
			return Msg.fail();
		}
    }
}
