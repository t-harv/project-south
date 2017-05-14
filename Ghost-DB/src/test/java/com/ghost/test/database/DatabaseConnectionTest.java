package com.ghost.test.database;
import java.sql.Connection;

import org.apache.commons.dbcp.BasicDataSource;


public class DatabaseConnectionTest {

	public static void main(String[] args) {

		/**
		 * update
		 */
		try {
			String username = "toyan";
			String password = "turpleP420";
			String url = "jdbc:oracle:thin:@//localhost:1521/xe";
			String port = "1521";
			String DBName = "toyan";

			String oracleDriver = "oracle.jdbc.driver.OracleDriver";

			BasicDataSource ds = new BasicDataSource();
			
			ds.setUsername(username);
			ds.setPassword(password);
			ds.setUrl(url);
			ds.setDriverClassName(oracleDriver);
			ds.setMaxWait(-1L);
			ds.setTestWhileIdle(true);
			ds.setTimeBetweenEvictionRunsMillis(60000);
			ds.setValidationQuery("select * from dual");
			
			Connection conn = ds.getConnection();
			
			System.out.println(conn.isClosed());
			conn.close();
			System.out.println(conn.isClosed());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}