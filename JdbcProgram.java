package com.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcProgram {

	public static void main(String[] args) {
		try {
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "c##bms", "abc");
			Statement statement = connection.createStatement();
			int executeUpdate = statement.executeUpdate("INSERT INTO EMPP VALUES(9,'K')");
			System.out.println(executeUpdate);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
