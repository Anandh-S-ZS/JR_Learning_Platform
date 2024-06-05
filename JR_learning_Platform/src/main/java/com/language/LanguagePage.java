package com.language;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.data.ChaptersData;
import com.opensymphony.xwork2.ActionSupport;
import com.util.SessionUtil;

public class LanguagePage extends ActionSupport{
	private String language;
	
	public String execute() throws SQLException {
		System.out.println("entered language page");
		ResultSet r = ChaptersData.languageDetails(language);
//		System.out.println(r.getString("section_name"));
		SessionUtil.setSessionAttribute("languageData", r);
		return SUCCESS;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
}
