package com.monster.zhaqsq.bean;

public class CommunityBasic {
	
	
	
    public CommunityBasic() {
		super();
		// TODO Auto-generated constructor stub
	}
    

	public CommunityBasic(Integer comId, String comTitle, String comCategory, Integer comNumber, String comDesp,
			String comAddress, byte[] comPicture) {
		super();
		this.comId = comId;
		this.comTitle = comTitle;
		this.comCategory = comCategory;
		this.comNumber = comNumber;
		this.comDesp = comDesp;
		this.comAddress = comAddress;
		this.comPicture = comPicture;
	}


	private Integer comId;

    private String comTitle;

    private String comCategory;

    private Integer comNumber;

    private String comDesp;

    private String comAddress;

    private byte[] comPicture;

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public String getComTitle() {
        return comTitle;
    }

    public void setComTitle(String comTitle) {
        this.comTitle = comTitle == null ? null : comTitle.trim();
    }

    public String getComCategory() {
        return comCategory;
    }

    public void setComCategory(String comCategory) {
        this.comCategory = comCategory == null ? null : comCategory.trim();
    }

    public Integer getComNumber() {
        return comNumber;
    }

    public void setComNumber(Integer comNumber) {
        this.comNumber = comNumber;
    }

    public String getComDesp() {
        return comDesp;
    }

    public void setComDesp(String comDesp) {
        this.comDesp = comDesp == null ? null : comDesp.trim();
    }

    public String getComAddress() {
        return comAddress;
    }

    public void setComAddress(String comAddress) {
        this.comAddress = comAddress == null ? null : comAddress.trim();
    }

    public byte[] getComPicture() {
        return comPicture;
    }

    public void setComPicture(byte[] comPicture) {
        this.comPicture = comPicture;
    }
}