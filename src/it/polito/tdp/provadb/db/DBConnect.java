package it.polito.tdp.provadb.db;

import java.sql.*;
public class DBConnect {

	
	public static Connection getConnection() {
		
			String jdbcURL = "jdbc:mysql://localhost/dizionario?useTimeZone=true&serverTimeZone=UTC&user=root&password=treno";
		
		try {
			
			Connection conn = DriverManager.getConnection(jdbcURL);
			
			return conn;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
