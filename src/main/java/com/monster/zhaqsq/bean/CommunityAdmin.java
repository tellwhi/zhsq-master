package com.monster.zhaqsq.bean;

public class CommunityAdmin {
	
	
	
    public CommunityAdmin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CommunityAdmin(Integer adId, String adUsername, String adPassword, Integer comId) {
		super();
		this.adId = adId;
		this.adUsername = adUsername;
		this.adPassword = adPassword;
		this.comId = comId;
	}

	private Integer adId;

    private String adUsername;

    private String adPassword;

    private Integer comId;

    public Integer getAdId() {
        return adId;
    }

    public void setAdId(Integer adId) {
        this.adId = adId;
    }

    public String getAdUsername() {
        return adUsername;
    }

    public void setAdUsername(String adUsername) {
        this.adUsername = adUsername == null ? null : adUsername.trim();
    }

    public String getAdPassword() {
        return adPassword;
    }

    public void setAdPassword(String adPassword) {
        this.adPassword = adPassword == null ? null : adPassword.trim();
    }

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }
}