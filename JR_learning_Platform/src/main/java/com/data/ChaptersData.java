package com.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;

public class ChaptersData {
	private static Connection con;
	private static PreparedStatement pst;
	
	
	public static ResultSet languageDetails(String language) {
		System.out.println("language details");
		con = Database.getConnection();
		ResultSet r = null;
		
		String query = "SELECT subject_name, section_name, lesson_name FROM SUBJECT"
				+ " JOIN section_details ON section_details.subject_id = subject.subject_id"
				+ " JOIN lesson_details ON lesson_details.section_id = section_details.section_id"
				+ " WHERE subject_name = ? ";
		
		try {
			pst=con.prepareStatement(query);
			pst.setString(1, language);
			System.out.println(language);
			r=pst.executeQuery();
			System.out.println("executed query");
		} catch (Exception e) {
			System.out.println("error in language details ");
		}
		return r;
	}
}
