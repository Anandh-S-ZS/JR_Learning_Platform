package com.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Database {
	private static PreparedStatement pst;
	private static Connection con;
	private static Connection getConnection() {
		try {
			if(con==null) {
				String url="jdbc:mysql://localhost:3306/webpage";
				String user="root";
				String pass="satheesh";
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection(url, user, pass);
			}
			
		}
		catch(Exception e) {
			System.out.println("Error "+e);
		}
		return con;
	}
	
	public boolean validateUser(String username, String password) {
		
		try {
			con=getConnection();
			String query = "SELECT * FROM users WHERE Username = ? AND Password = ?";
			pst=con.prepareStatement(query);
			pst.setString(1, username);
			pst.setString(2, password);
			ResultSet rs=pst.executeQuery();
			if (rs.next()){
                return true;
            }
				
		}catch(Exception e) {
			System.out.println("Error "+e);
		}
		return false;
	}



    private static boolean userExists(String username) 
    {
    	con=getConnection();
        String sql = "SELECT * FROM users WHERE username = ? ";
        try (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1, username);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) 
                {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


	public boolean insertData(String name, String username, String dob, String email, String password, String state) {
		int st=0;
		System.out.println(state);
		con=getConnection();
		if (userExists(username)) 
	    {
				System.out.println("User exists with this username");
				return false; 
	        }
			if(state.equals("beginner")) {
				st=0;
			}else if(state.equals("intermediate")) {
				st=1;
			}else if(state.equals("expert")) {
				st=2;
			}
			String query = "insert into users(Name,DOB,username,email, password, learner_state) values(?,?,?,?,?,?)";
			try (PreparedStatement stmt = con.prepareStatement(query)) 
			{
				stmt.setString(1,name);
				stmt.setString(2,dob);
				stmt.setString(3,username);
				stmt.setString(4,email);
				stmt.setString(5,password);
				stmt.setInt(6,st);
				int n=stmt.executeUpdate();
				if(n>0) {
					return true;
				}
			}	
			catch (Exception e) {
	            e.printStackTrace();
	        }
			return false;
	}
}
