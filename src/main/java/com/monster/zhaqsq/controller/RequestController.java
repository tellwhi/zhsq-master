package com.monster.zhaqsq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.monster.zhaqsq.bean.Content;
import com.monster.zhaqsq.bean.Data;
import com.monster.zhaqsq.bean.Msg;
import com.monster.zhaqsq.bean.Request;
import com.monster.zhaqsq.bean.Services;
import com.monster.zhaqsq.service.RequestService;
import com.mysql.jdbc.log.Log;

@Controller
@RequestMapping("/request")
public class RequestController {

	@Autowired
	RequestService requestService;
	
	@RequestMapping(value = "/insert",method = RequestMethod.POST)
    @ResponseBody
    public Msg insert(String content){
		
		Content con=JSON.parseObject(content.substring(1, content.length()-2) ,Content.class);
		Request request=new Request();
		
		request.setNotifytype(con.getNotifyType());
		request.setRequestid(con.getRequestId());
		request.setDeviceid(con.getDeviceId());
		request.setGatewayid(con.getGatewayId());
		
		List<Services> services=con.getServices();
		
		for(Services service:services) {
			request.setServiceid(service.getServiceId());
			request.setServicetype(service.getServiceType());
			Data data=service.getData();
			request.setDevicenumber(data.getDeviceNumber());
			request.setDimension(data.getDimension());
			request.setNsflag(data.getNSFlag());
			request.setLongitude(data.getLongitude());
			request.setWeflag(data.getWEFlag());
			request.setEventtime(service.getEventTime());
		}
		requestService.insertRequest(request);
		return Msg.success();
    }
	
//	@RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
//	@ResponseBody
//	public Msg getRequest(@PathVariable("id")Integer id) {
//		Request request=requestService.getRequest(id);
//		return Msg.success().add("request", request);
//	}
	
}
