package com.monster.zhaqsq.bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class CallList {
	
	
    public CallList(Integer callId, Integer subId, Date subTime, Date endTime, String callTitle, String callDesp,
			Integer callMoney, String callNow, Integer recId, String subName, String recName, String callAddress) {
		super();
		this.callId = callId;
		this.subId = subId;
		this.subTime = subTime;
		this.endTime = endTime;
		this.callTitle = callTitle;
		this.callDesp = callDesp;
		this.callMoney = callMoney;
		this.callNow = callNow;
		this.recId = recId;
		this.subName = subName;
		this.recName = recName;
		this.callAddress = callAddress;
	}

	public CallList() {
		super();
		// TODO Auto-generated constructor stub
	}

	private Integer callId;

    private Integer subId;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date subTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    private String callTitle;

    private String callDesp;

    private Integer callMoney;

    private String callNow;

    private Integer recId;

    private String subName;

    private String recName;

    private String callAddress;

    public Integer getCallId() {
        return callId;
    }

    public void setCallId(Integer callId) {
        this.callId = callId;
    }

    public Integer getSubId() {
        return subId;
    }

    public void setSubId(Integer subId) {
        this.subId = subId;
    }

    public Date getSubTime() {
        return subTime;
    }

    public void setSubTime(Date subTime) {
        this.subTime = subTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getCallTitle() {
        return callTitle;
    }

    public void setCallTitle(String callTitle) {
        this.callTitle = callTitle == null ? null : callTitle.trim();
    }

    public String getCallDesp() {
        return callDesp;
    }

    public void setCallDesp(String callDesp) {
        this.callDesp = callDesp == null ? null : callDesp.trim();
    }

    public Integer getCallMoney() {
        return callMoney;
    }

    public void setCallMoney(Integer callMoney) {
        this.callMoney = callMoney;
    }

    public String getCallNow() {
        return callNow;
    }

    public void setCallNow(String callNow) {
        this.callNow = callNow == null ? null : callNow.trim();
    }

    public Integer getRecId() {
        return recId;
    }

    public void setRecId(Integer recId) {
        this.recId = recId;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName == null ? null : subName.trim();
    }

    public String getRecName() {
        return recName;
    }

    public void setRecName(String recName) {
        this.recName = recName == null ? null : recName.trim();
    }

    public String getCallAddress() {
        return callAddress;
    }

    public void setCallAddress(String callAddress) {
        this.callAddress = callAddress == null ? null : callAddress.trim();
    }
}