package com.monster.zhaqsq.bean;

public class Service {

	
	
   @Override
	public String toString() {
		return "Service [serviceId=" + serviceId + ", serviceType=" + serviceType + ", data=" + data + ", eventTime="
				+ eventTime + "]";
	}
public Service() {
		super();
		// TODO Auto-generated constructor stub
	}
   public Service(String serviceId, String serviceType, Data data, String eventTime) {
		super();
		this.serviceId = serviceId;
		this.serviceType = serviceType;
		this.data = data;
		this.eventTime = eventTime;
	}
   private String serviceId;
   private String serviceType;
   private Data data;
   private String eventTime;
   public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }
    public String getServiceId() {
        return serviceId;
    }

   public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
    public String getServiceType() {
        return serviceType;
    }

   public void setData(Data data) {
        this.data = data;
    }
    public Data getData() {
        return data;
    }

   public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }
    public String getEventTime() {
        return eventTime;
    }

}