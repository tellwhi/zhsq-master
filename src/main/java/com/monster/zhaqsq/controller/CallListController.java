package com.monster.zhaqsq.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.monster.zhaqsq.bean.CallList;
import com.monster.zhaqsq.bean.Msg;
import com.monster.zhaqsq.service.CallListService;
import com.monster.zhaqsq.utils.cookieUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/call")
public class CallListController {

	@Autowired
	CallListService calllistService;

//    @ModelAttribute
//    public boolean userTypeJudge(HttpServletRequest request, HttpServletResponse response) throws Exception{
//        if(cookieUtils.getUserType(request).equals("1")){
//        	if(cookieUtils.userLoginTimeStatus(request)) {
//        		return true;
//        	}
//        	else {
//        		cookieUtils.clearCookie(request, response);
//        		return false;
//        	}
//        }
//        else if(cookieUtils.getUserType(request).equals("2")){
//        	if(cookieUtils.adminLoginTimeStatus(request)) {
//        		return true;
//        	}
//        	else {
//        		cookieUtils.clearCookie(request, response);
//        		return false;
//        	}
//        }
//        else {
//    		return false;
//		}
//    }
	
	
	

	/**
	 * 单个批量二合一 批量删除：1-2-3 单个删除：1
	 *
	 * @param ids
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/delete/{ids}", method = RequestMethod.DELETE)
	public Msg deleteCall(@PathVariable("ids") String ids) {
		if (ids.contains("-")) {
			List<Integer> del_ids = new ArrayList<>();
			String[] str_ids = ids.split("-");
			// 组装id的集合
			for (String string : str_ids) {
				del_ids.add(Integer.parseInt(string));
			}
			calllistService.deleteBatch(del_ids);
		} else {
			Integer id = Integer.parseInt(ids);
			calllistService.deleteCall(id);
		}
		return Msg.success();
	}

	/**
	 * 保存更新后的数据
	 */
	@ResponseBody
	@RequestMapping(value = "/update/{callId}", method = RequestMethod.PUT)
	public Msg updateCall(CallList callList) {
		calllistService.updateCallList(callList);
		return Msg.success();
	}

	/**
	 * 保存更新后的数据
	 */
	@ResponseBody
	@RequestMapping(value = "/updatetime", method = RequestMethod.PUT)
	public Msg updateTime(Integer callId, String subTime, String endTime) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date sTime = null, eTime = null;
		if (subTime != null) {
			long lt = new Long(subTime);
			sTime = new Date(lt);
		}
		if (endTime != null) {
			long lt = new Long(endTime);
			eTime = new Date(lt);
		}
		calllistService.changeTime(callId, sTime, eTime);
		;
		return Msg.success();
	}

	/**
	 * 获取任务信息
	 */
	@RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Msg getCall(@PathVariable("id") Integer id) {
		CallList calllist = calllistService.getCall(id);
		return Msg.success().add("call", calllist);
	}

	/**
	 * 获取用户所在社区的任务
	 */
	@RequestMapping(value = "/getcomcall", method = RequestMethod.GET)
	@ResponseBody
	public Msg getComCall(Integer uId, Integer callNow) {
		List<CallList> calllists = calllistService.getComCallList(uId, callNow);
		return Msg.success().add("calls", calllists);
	}

	
	/**
	 * 根据发布者查询
	 */
	@RequestMapping(value = "/getBysub", method = RequestMethod.GET)
	@ResponseBody
	public Msg selectBysub(Integer subId) {
		List<CallList> calllists = calllistService.selectBysub(subId);
		return Msg.success().add("calls", calllists);
	}

	/**
	 * 根据接收者查询
	 */
	@RequestMapping(value = "/getByrec", method = RequestMethod.GET)
	@ResponseBody
	public Msg selectByrec(Integer recId) {
		List<CallList> calllists = calllistService.selectByrec(recId);
		return Msg.success().add("calls", calllists);
	}

	/**
	 * 任务保存
	 * 
	 * @return
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public Msg saveCall(CallList calllist) {
		calllistService.saveCall(calllist);
		return Msg.success();
	}

	/**
	 * 查询任务数据
	 * 
	 * @return
	 */

	@RequestMapping("/calls")
	@ResponseBody
	public Msg getcallsWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		// 引入PageHelper分页插件
		// 在查询之前只需要调用，传入页码，以及每页的大小
		PageHelper.startPage(pn, 5);
		// startPage后面紧跟的这个查询就是一个分页查询
		List<CallList> calls = calllistService.getAll();
		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo page = new PageInfo(calls, 5);
		return Msg.success().add("pageInfo", page);
	}

//    //@RequestMapping("/calls")
//    public String getcalls(@RequestParam(value="pn",defaultValue = "1")Integer pn, Model model){
//        // 引入PageHelper分页插件
//        // 在查询之前只需要调用，传入页码，以及每页的大小
//        PageHelper.startPage(pn,5);
//        // startPage后面紧跟的这个查询就是一个分页查询
//        List<CallList> calls = calllistService.getAll();
//        // 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
//        // 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
//        PageInfo page = new PageInfo(calls,5);
//        model.addAttribute("PageInfo",page);
//
//        return "list";
//    }
}
