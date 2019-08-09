package com.monster.zhaqsq.bean;

import java.util.List;

public class Content {
	
	

   public Content(String notifyType, Integer requestId, String deviceId, String gatewayId, List<Services> services) {
		super();
		this.notifyType = notifyType;
		this.requestId = requestId;
		this.deviceId = deviceId;
		this.gatewayId = gatewayId;
		this.services = services;
	}
   
   public Content() {
		super();
		// TODO Auto-generated constructor stub
	}
   private String notifyType;
   private Integer requestId;
   private String deviceId;
   private String gatewayId;
   private List<Services> services;
   public void setNotifyType(String notifyType) {
        this.notifyType = notifyType;
    }
    public String getNotifyType() {
        return notifyType;
    }
    
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }
    public Integer getRequestId() {
        return requestId;
    }
    
   public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
    public String getDeviceId() {
        return deviceId;
    }

   public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }
    public String getGatewayId() {
        return gatewayId;
    }

   public void setServices(List<Services> services) {
        this.services = services;
    }
    public List<Services> getServices() {
        return services;
    }

}