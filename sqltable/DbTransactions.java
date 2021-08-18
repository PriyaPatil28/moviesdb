package sqltable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DbTransactions {
	
	DataBaseConnection db = null;
	
	PreparedStatement ps;
	
	public void viewData() {
		try {
			
			String sql = "SELECT *FROM Movies";
			
			Connection connection=DataBaseConnection.getConnection();
			Statement statement = connection.createStatement();
			
			ResultSet result = statement.executeQuery(sql);
			while(result.next()) {
				String name = result.getString("name");
				String actor = result.getString("actor");
				String actress = result.getString("actress");
				int yearOfRelease = result.getInt("yearOfRelease");
				String director = result.getString("director");
			
				System.out.println("name :"+name);
				System.out.println("actor :"+actor);
				System.out.println("actress :"+actress);
				System.out.println("yearOfRelease :"+yearOfRelease);
				System.out.println("director :"+director);
			}	
			}
			catch (SQLException e) {
				//System.out.println("error connecting to SQLite database");
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public void insetdata(String name,String actor, String actress,int yearOfRelease , String director) {
		try {
			
			String sql = "insert into Movies values(?,?,?,?,?)";
			
			ps=DataBaseConnection.getConnection().prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, actor);
			ps.setString(3, actress);
			ps.setInt(4, yearOfRelease);
			ps.setString(5, director);
			
			
			int i=ps.executeUpdate();
			System.out.println(i);
			}
			catch (SQLException e) {
				//System.out.println("error connecting to SQLite database");
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
