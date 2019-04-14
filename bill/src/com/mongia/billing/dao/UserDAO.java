package com.mongia.billing.dao;

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class UserDAO {

	public boolean doLogin(String userid, String password) throws ClassNotFoundException, SQLException {
		boolean isUserExist = false;
		
		
		Connection con = null;  
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ResourceBundle rb = ResourceBundle.getBundle("db");
		String dbClass = rb.getString("dbtype");
		try {
			try {
			Object object = Class.forName(dbClass.trim()).newInstance();
			Method method = object.getClass().getMethod(rb.getString("dbmethod").trim(), null);
			con = (Connection)method.invoke(object, null);
			}
			catch(Exception e) {
				System.out.println(e);
				e.printStackTrace();
			}
			//con = CommonDAO.getConnection();
		
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
		}
		}
		finally {
			if(rs!=null) {
			rs.close();
			}
			if(pstmt!=null) {
			pstmt.close();
			}
			if(con!=null) {
			con.close();
			}
		}
		
		return isUserExist;
		
	}

}
