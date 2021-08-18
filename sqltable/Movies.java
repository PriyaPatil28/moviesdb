package sqltable;

public class Movies {

	public static void main(String[] args) {
		//String jdbcUrl = "jdbc:sqlite:/mydb.sqbpro";
		
		DbTransactions db = new DbTransactions();
		
		
		db.insetdata("vishnuvardhana","sudeep","priyamani",2017,"tarun");
		db.viewData();
		
	}
}
