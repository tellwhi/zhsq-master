package com.monster.zhaqsq.bean;

public class Data {

	
	
   public Data() {
		super();
		// TODO Auto-generated constructor stub
	}
   
   public Data(String deviceNumber, String dimension, String nSFlag, String longitude, String wEFlag) {
		super();
		this.deviceNumber = deviceNumber;
		this.dimension = dimension;
		NSFlag = nSFlag;
		this.longitude = longitude;
		WEFlag = wEFlag;
	}
   
   private String deviceNumber;
   private String dimension;
   private String NSFlag;
   private String longitude;
   private String WEFlag;
   public void setDeviceNumber(String deviceNumber) {
        this.deviceNumber = deviceNumber;
    }
    public String getDeviceNumber() {
        return deviceNumber;
    }

   public void setDimension(String dimension) {
        this.dimension = dimension;
    }
    public String getDimension() {
        return dimension;
    }

   public void setNSFlag(String NSFlag) {
        this.NSFlag = NSFlag;
    }
    public String getNSFlag() {
        return NSFlag;
    }

   public void setLongitude(String longitude) {
        this.longitude = longitude;
    }
    public String getLongitude() {
        return longitude;
    }

   public void setWEFlag(String WEFlag) {
        this.WEFlag = WEFlag;
    }
    public String getWEFlag() {
        return WEFlag;
    }

}