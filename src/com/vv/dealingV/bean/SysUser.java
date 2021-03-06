package com.vv.dealingV.bean;

import java.io.Serializable;

public class SysUser implements Serializable {
	private static final long serialVersionUID = 1684635898478047267L;
	private String userID;
	private String userCode;
	private String userName;
	private String password;
	private String manageCom;
	private String state;
	private String email;
	private String phone;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getManageCom() {
		return manageCom;
	}
	public void setManageCom(String manageCom) {
		this.manageCom = manageCom;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
