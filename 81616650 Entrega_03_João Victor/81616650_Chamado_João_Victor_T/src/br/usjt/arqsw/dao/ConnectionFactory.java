package br.usjt.arqsw.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * 
 * @author Jo�o Victor Telles Gementi 81616650  14/03/2017
 *
 */

public class ConnectionFactory {
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws IOException {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/servicedesk?"
					+ "user=root&password=&useSSL=false");
		} catch (SQLException e) {
			throw new IOException(e);
		}
		return conn;
	}
}
