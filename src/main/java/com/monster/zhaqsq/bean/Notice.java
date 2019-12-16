package com.monster.zhaqsq.bean;

public class Notice {
	
	
	
    public Notice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Notice(Integer noId, Integer comId, String noTitle, String noContent) {
		super();
		this.noId = noId;
		this.comId = comId;
		this.noTitle = noTitle;
		this.noContent = noContent;
	}

	private Integer noId;

    private Integer comId;

    private String noTitle;

    private String noContent;

    public Integer getNoId() {
        return noId;
    }

    public void setNoId(Integer noId) {
        this.noId = noId;
    }

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public String getNoTitle() {
        return noTitle;
    }

    public void setNoTitle(String noTitle) {
        this.noTitle = noTitle == null ? null : noTitle.trim();
    }

    public String getNoContent() {
        return noContent;
    }

    public void setNoContent(String noContent) {
        this.noContent = noContent == null ? null : noContent.trim();
    }
}