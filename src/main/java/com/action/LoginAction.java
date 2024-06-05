package com.action;

import com.data.Database;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String email;
	private String password;
	private static Database db=new Database();
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
	public String success() {
		return "success";
	}
	public String execute() 
    {
    	boolean success = db.validateUser(email, password);
        if (success) {
        	System.out.println("Login - Success");
            return SUCCESS;
        } else {
        	System.out.println("Login - Invalid credentials");
            return ERROR;
        }
    }
}
