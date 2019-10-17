package com.monster.zhaqsq.bean;

public class Content {
	
	

   @Override
	public String toString() {
		return "Content [notifyType=" + notifyType + ", requestId=" + requestId + ", deviceId=" + deviceId
				+ ", gatewayId=" + gatewayId + ", service=" + service + "]";
	}

public Content(String notifyType, String requestId, String deviceId, String gatewayId, Service service) {
		super();
		this.notifyType = notifyType;
		this.requestId = requestId;
		this.deviceId = deviceId;
		this.gatewayId = gatewayId;
		this.service = service;
	}
   
   public Content() {
		super();
		// TODO Auto-generated constructor stub
	}
   private String notifyType;
   private String requestId;
   private String deviceId;
   private String gatewayId;
   private Service service;
   public void setNotifyType(String notifyType) {
        this.notifyType = notifyType;
    }
    public String getNotifyType() {
        return notifyType;
    }
    
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
    public String getRequestId() {
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

   public void setService(Service service) {
        this.service = service;
    }
    public Service getService() {
        return service;
    }

}