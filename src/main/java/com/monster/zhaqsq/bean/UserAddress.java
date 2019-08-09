package com.monster.zhaqsq.bean;

public class UserAddress {
	
	
	
	
	
	
	
    public UserAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserAddress(Integer id, Integer uid, String address, String userName) {
		super();
		this.id = id;
		this.uid = uid;
		this.address = address;
		this.userName = userName;
	}

	private Integer id;

    private Integer uid;

    private String address;

    private String userName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
}