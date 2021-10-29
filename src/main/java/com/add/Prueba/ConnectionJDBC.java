package com.add.Prueba;

import java.sql.*;

public class ConnectionJDBC {
	public static void muestraErrorSQL(SQLException e) {
		System.err.println("SQL ERROR mensaje: " +e.getMessage());
		System.err.println("SQL Estado" + e.getSQLState());
		System.err.println("SQL codigo espedcifico" + e.getErrorCode());
	}
	public static void main(String[] args) {
	try {
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/dummy", "root", "root");
		
		Statement stmt = con.createStatement();
		
		//select FIJA
		ResultSet rs = stmt.executeQuery("Select * from empleados");
		System.out.println("Hola mundo");
		System.out.println("Hola mundo2");
		//Resulset
		while (rs.next())
		    System.out.println (rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) 
		    + " " + rs.getString(4));
			con.close();
		} catch (SQLException e) { 
			muestraErrorSQL(e);    
		}catch (Exception e) {
			e.printStackTrace(System.err);
		}

	}

}
