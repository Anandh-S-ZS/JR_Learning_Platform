package com.model;

public class User {
	private String name;
	private String userName;
	private String email;
	private String dob;
	private String password;
	private int otp;
	
	
	public User(String name2, String username2, String dob2, String email2, String password2) {
		this.name = name2;
		this.userName = username2;
		this.dob = dob2;
		this.email = email2;
		this.password = password2;
	}
	
	
	public String getName() {
		return name;
	}
	public String getUserName() {
		return userName;
	}
	public String getEmail() {
		return email;
	}
	public String getDob() {
		return dob;
	}
	public String getPassword() {
		return password;
	}
	public int getOtp() {
		return otp;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
	
	

}
