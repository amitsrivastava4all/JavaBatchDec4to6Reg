package com.mongia.billing.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.Scanner;

public class CommonDAO {
	public  Connection getConnection() throws SQLException, ClassNotFoundException {
		System.out.println("PostGres DAO Call");
		ResourceBundle rb = ResourceBundle.getBundle("db");
		
		Connection con = null;
		Class.forName(rb.getString("driver"));
		con = DriverManager.getConnection(rb.getString("url"),rb.getString("userid"),rb.getString("password"));
		return con;
	}

}
