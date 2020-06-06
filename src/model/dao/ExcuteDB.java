package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExcuteDB {
	String url = "jdbc:sqlserver://localhost:1433;databaseName=ChoVayNangLai";
	String userName = "sa";
	String password = "123";
	
	Connection getConnection(){

		Connection connection = null;
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}

	ResultSet executeQuery(String sql) {
		Connection connection = getConnection();
		ResultSet rs = null;
		Statement stmt = null;
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			if(connection != null) {try {connection.close();} catch (SQLException e1) {e1.printStackTrace();}}
			if(stmt != null) {try {stmt.close();} catch (SQLException e1) {e1.printStackTrace();}}
		} //finally  {
//			if(connection != null) {try {connection.close();} catch (SQLException e1) {e1.printStackTrace();}}
//			if(stmt != null) {try {stmt.close();} catch (SQLException e1) {e1.printStackTrace();}}
//		}
		return rs;
	}
	
	void executeUpdate(String sql) {
		Connection connection = getConnection();
		Statement stmt = null;
		try {
			stmt = connection.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("success");
		} catch (SQLException e) {
			e.printStackTrace();
			if(connection != null) {try {connection.close();} catch (SQLException e1) {e1.printStackTrace();}}
			if(stmt != null) {try {stmt.close();} catch (SQLException e1) {e1.printStackTrace();}}
		} finally  {
			if(connection != null) {try {connection.close();} catch (SQLException e1) {e1.printStackTrace();}}
			if(stmt != null) {try {stmt.close();} catch (SQLException e1) {e1.printStackTrace();}}
		}
	}
}
