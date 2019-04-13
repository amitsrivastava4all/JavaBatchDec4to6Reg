package com.mongia.billing.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class OracleDAO {
	public static Connection getOracleConnection() throws SQLException, ClassNotFoundException {
		System.out.println("Oracle DAO Call");
		ResourceBundle rb = ResourceBundle.getBundle("db");
				
				Connection con = null;
				Class.forName(rb.getString("driver"));
				con = DriverManager.getConnection(rb.getString("url"),rb.getString("userid"),rb.getString("password"));
				return con;
			}

}
