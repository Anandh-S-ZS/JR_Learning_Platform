package com.action;

import com.data.Database;
import com.model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.util.SessionUtil;

public class InsertUser extends ActionSupport {
	//changes made in the insert user

	private String otp;
	private static Database db = new Database();

	public String execute() {
		int temp = 0;

		User u = (User) SessionUtil.getSessionAttribute("user");

		if (Integer.parseInt(otp) == u.getOtp()) {
			boolean success = db.insertData(u.getName(), u.getUserName(), u.getDob(), u.getEmail(), u.getPassword());
			if (success) {
				System.out.println("Signup - Success");
				return SUCCESS;
			} else {
				System.out.println("Signup - Invalid Values");
				return ERROR;
			}
		}
		return ERROR;

	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

}
