package com.ghost.test.database;
import java.io.FileReader;
import java.sql.Connection;
import java.util.Properties;

import org.apache.commons.dbcp.BasicDataSource;


public class DatabaseConnectionTest {

	public static void main(String[] args) {

		/**
		 * update
		 */
		try {
			
			Properties props = new Properties();
			props.load(new FileReader("../Ghost-DB/src/test/resources/database.properties"));
			
			
			String username = props.getProperty("username");
			String password = props.getProperty("password");
			String url = props.getProperty("url");
			String oracleDriver = props.getProperty("oracleDriver");
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