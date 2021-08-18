package sqltable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseConnection {
	private static Connection con;
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		 Class.forName("org.sqlite.JDBC");
		 con = DriverManager.getConnection("jdbc:sqlite:C:/sqlite3/mydb.db");
		 
		 System.out.println("Database Connected Successfully ");
		 
		 return con;
		}
}



