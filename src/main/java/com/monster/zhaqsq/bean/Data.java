package com.monster.zhaqsq.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {

	
	
    @Override
	public String toString() {
		return "Data [deviceNumber=" + deviceNumber + ", dimension=" + dimension + ", NSFlag=" + NSFlag + ", longitude="
				+ longitude + ", WEFlag=" + WEFlag + "]";
	}

    public Data() {
		super();
		// TODO Auto-generated constructor stub
	}
   

   public Data(String deviceNumber, String dimension, String NSFlag, String longitude, String WEFlag) {
		super();
		this.deviceNumber = deviceNumber;
		this.dimension = dimension;
		this.NSFlag = NSFlag;
		this.longitude = longitude;
		this.WEFlag = WEFlag;
	}


   private String deviceNumber;
   
   private String dimension;
   
   @JsonProperty
   private String NSFlag;
   
   private String longitude;
   
   @JsonProperty
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