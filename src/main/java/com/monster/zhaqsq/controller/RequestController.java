package com.monster.zhaqsq.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.monster.zhaqsq.bean.Content;
import com.monster.zhaqsq.bean.Data;
import com.monster.zhaqsq.bean.Msg;
import com.monster.zhaqsq.bean.Request;
import com.monster.zhaqsq.bean.Service;
import com.monster.zhaqsq.service.RequestService;

@Controller
@RequestMapping("/request")
public class RequestController {

	@Autowired
	RequestService requestService;
	
	@RequestMapping(value = "/insert",method = RequestMethod.POST)
    @ResponseBody
    public Msg insert(@RequestBody Content con){
		
		Request request=new Request();
		
		request.setNotifytype(con.getNotifyType());
		request.setRequestid(con.getRequestId());
		request.setDeviceid(con.getDeviceId());
		request.setGatewayid(con.getGatewayId());
		
		Service service=con.getService();
		
		request.setServiceid(service.getServiceId());
		request.setServicetype(service.getServiceType());
		Data data=service.getData();
		request.setDevicenumber(data.getDeviceNumber());
		request.setDimension(data.getDimension());
		request.setNsflag(data.getNSFlag());
		System.out.println(con);
		request.setLongitude(data.getLongitude());
		request.setWeflag(data.getWEFlag());
		request.setEventtime(service.getEventTime());
		requestService.insertRequest(request);
		return Msg.success();
    }
	
	@RequestMapping(value = "/getBydevice",method = RequestMethod.GET)
    @ResponseBody
    public Msg getByDeviceNumber(String devicenumber) {
		Request request = requestService.selectBydeviceNumber(devicenumber);
		return Msg.success().add("request", request);
	}
	
//	@RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
//	@ResponseBody
//	public Msg getRequest(@PathVariable("id")Integer id) {
//		Request request=requestService.getRequest(id);
//		return Msg.success().add("request", request);
//	}
	
}
