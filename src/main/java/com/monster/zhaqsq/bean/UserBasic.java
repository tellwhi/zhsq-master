package com.monster.zhaqsq.bean;

public class UserBasic {
	
	
	
	
	
	
    public UserBasic() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserBasic(Integer uid, String userName, String userPassword, String userPhonenumber, String userDept,
			String userSex, String userDesp, String userNamecheck, Integer userCreditlevel, String userMessagelevel,
			Integer userPoint) {
		super();
		this.uid = uid;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userPhonenumber = userPhonenumber;
		this.userDept = userDept;
		this.userSex = userSex;
		this.userDesp = userDesp;
		this.userNamecheck = userNamecheck;
		this.userCreditlevel = userCreditlevel;
		this.userMessagelevel = userMessagelevel;
		this.userPoint = userPoint;
	}

	private Integer uid;

    private String userName;

    private String userPassword;

    private String userPhonenumber;

    private String userDept;

    private String userSex;

    private String userDesp;

    private String userNamecheck;

    private Integer userCreditlevel;

    private String userMessagelevel;

    private Integer userPoint;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserPhonenumber() {
        return userPhonenumber;
    }

    public void setUserPhonenumber(String userPhonenumber) {
        this.userPhonenumber = userPhonenumber == null ? null : userPhonenumber.trim();
    }

    public String getUserDept() {
        return userDept;
    }

    public void setUserDept(String userDept) {
        this.userDept = userDept == null ? null : userDept.trim();
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex == null ? null : userSex.trim();
    }

    public String getUserDesp() {
        return userDesp;
    }

    public void setUserDesp(String userDesp) {
        this.userDesp = userDesp == null ? null : userDesp.trim();
    }

    public String getUserNamecheck() {
        return userNamecheck;
    }

    public void setUserNamecheck(String userNamecheck) {
        this.userNamecheck = userNamecheck == null ? null : userNamecheck.trim();
    }

    public Integer getUserCreditlevel() {
        return userCreditlevel;
    }

    public void setUserCreditlevel(Integer userCreditlevel) {
        this.userCreditlevel = userCreditlevel;
    }

    public String getUserMessagelevel() {
        return userMessagelevel;
    }

    public void setUserMessagelevel(String userMessagelevel) {
        this.userMessagelevel = userMessagelevel == null ? null : userMessagelevel.trim();
    }

    public Integer getUserPoint() {
        return userPoint;
    }

    public void setUserPoint(Integer userPoint) {
        this.userPoint = userPoint;
    }


}