package com.action;

import com.data.Database;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport{
	private String name;
	private String username;
	private String dob;
	private String email;
	private String password;
	private String state;
	private static Database db=new Database();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String success() {
		return "success";
	}
	
	public String execute() 
    {
		boolean success = db.insertData(name, username, dob,email, password, state);
        if (success) {
        	System.out.println("Signup - Success");
            return SUCCESS;
        } else {
        	System.out.println("Signup - Invalid Values");
            return ERROR;
        }
    }
}
