package com.monster.zhaqsq.bean;

public class Request {
	
	
	
    public Request() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Request(Integer rid, String notifytype, String requestid, String deviceid, String gatewayid,
			String serviceid, String servicetype, String devicenumber, String dimension, String nsflag,
			String longitude, String weflag, String eventtime) {
		super();
		this.rid = rid;
		this.notifytype = notifytype;
		this.requestid = requestid;
		this.deviceid = deviceid;
		this.gatewayid = gatewayid;
		this.serviceid = serviceid;
		this.servicetype = servicetype;
		this.devicenumber = devicenumber;
		this.dimension = dimension;
		this.nsflag = nsflag;
		this.longitude = longitude;
		this.weflag = weflag;
		this.eventtime = eventtime;
	}

	private Integer rid;

    private String notifytype;

    private String requestid;

    private String deviceid;

    private String gatewayid;

    private String serviceid;

    private String servicetype;

    private String devicenumber;

    private String dimension;

    private String nsflag;

    private String longitude;

    private String weflag;

    private String eventtime;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getNotifytype() {
        return notifytype;
    }

    public void setNotifytype(String notifytype) {
        this.notifytype = notifytype == null ? null : notifytype.trim();
    }

    public String getRequestid() {
        return requestid;
    }

    public void setRequestid(String requestid) {
        this.requestid = requestid == null ? null : requestid.trim();
    }

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid == null ? null : deviceid.trim();
    }

    public String getGatewayid() {
        return gatewayid;
    }

    public void setGatewayid(String gatewayid) {
        this.gatewayid = gatewayid == null ? null : gatewayid.trim();
    }

    public String getServiceid() {
        return serviceid;
    }

    public void setServiceid(String serviceid) {
        this.serviceid = serviceid == null ? null : serviceid.trim();
    }

    public String getServicetype() {
        return servicetype;
    }

    public void setServicetype(String servicetype) {
        this.servicetype = servicetype == null ? null : servicetype.trim();
    }

    public String getDevicenumber() {
        return devicenumber;
    }

    public void setDevicenumber(String devicenumber) {
        this.devicenumber = devicenumber == null ? null : devicenumber.trim();
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension == null ? null : dimension.trim();
    }

    public String getNsflag() {
        return nsflag;
    }

    public void setNsflag(String nsflag) {
        this.nsflag = nsflag == null ? null : nsflag.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getWeflag() {
        return weflag;
    }

    public void setWeflag(String weflag) {
        this.weflag = weflag == null ? null : weflag.trim();
    }

    public String getEventtime() {
        return eventtime;
    }

    public void setEventtime(String eventtime) {
        this.eventtime = eventtime == null ? null : eventtime.trim();
    }
}