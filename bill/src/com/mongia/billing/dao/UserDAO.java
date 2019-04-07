package com.mongia.billing.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class UserDAO {

	public boolean doLogin(String userid, String password) throws ClassNotFoundException, SQLException {
		boolean isUserExist = false;
		
		
		Connection con = null;  
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		con = CommonDAO.getConnection();
		
		if (con!=null) {
			pstmt=con.prepareStatement("select userid, password from users where userid=? and password=?");
			pstmt.setString(1, userid); 
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				isUserExist = true;
				System.out.println("Welcome "+userid);
					}
			else {
				System.out.println("Invalid userid or password");
			}
			rs.close();
			pstmt.close();
			con.close();
			
		}
		return isUserExist;
		
	}

}
