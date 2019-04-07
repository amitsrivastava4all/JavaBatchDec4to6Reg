package com.brainmentors.billing.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CommonDAO {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Userid");
		String userid =s.next();
		System.out.println("Enter the password");
		String password = s.next();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// Load Driver - Driver is a class 
		// and we are loading a Class (Driver)
		Class.forName("org.postgresql.Driver");
		//System.out.println("Driver Loaded...");
		//System.out.println("Connection Created....");
		// Create Connection to the DB
		//jdbc:postgresql://hostname:port/dbname
		// jdbc:mysql://localhost:3306/javabase
		//jdbc:oracle:thin:@localhost:1521:SID
		
		con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/billingdb", "amit", "amit123");
		if(con!=null) {
			pstmt = con.prepareStatement("select userid, password from users where userid=? and password=?");
			pstmt.setString(1, userid);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("Welcome "+userid);
			}
			else {
				System.out.println("Invalid Userid or Password");
			}
			
			rs.close();
			pstmt.close();
			con.close();
		}
	}
}
