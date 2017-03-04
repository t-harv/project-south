package com.ghost.test.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnectionTest {

	public static void main(String[] args) {

		Connection con = null;
		Statement st = null;

		String url = "jdbc:derby://localhost:1527/GhostWriterDB;user=APP;create=true";
		
		try {

			//System.setProperty("derby.system.home", "C:/Development/derby/db-derby-10.11.1.1-bin/bin");

			con = DriverManager.getConnection(url);
			st = con.createStatement();
			st.executeUpdate("CREATE TABLE CARS4(ID INT PRIMARY KEY,"
					+ "NAME VARCHAR(30), PRICE INT)");
			st.executeUpdate("INSERT INTO CARS3 VALUES(1, 'Audi', 52642)");
			st.executeUpdate("INSERT INTO CARS3 VALUES(2, 'Mercedes', 57127)");
			st.executeUpdate("INSERT INTO CARS3 VALUES(3, 'Skoda', 9000)");
			st.executeUpdate("INSERT INTO CARS3 VALUES(4, 'Volvo', 29000)");
			st.executeUpdate("INSERT INTO CARS3 VALUES(5, 'Bentley', 350000)");
			st.executeUpdate("INSERT INTO CARS3 VALUES(6, 'Citroen', 21000)");
			st.executeUpdate("INSERT INTO CARS3 VALUES(7, 'Hummer', 41400)");
			st.executeUpdate("INSERT INTO CARS3 VALUES(8, 'Volkswagen', 21600)");
			//DriverManager.getConnection("jdbc:derby:;shutdown=true");

		} catch (SQLException ex) {

			ex.printStackTrace();

		} finally {

			try {

				if (st != null) {
					st.close();
				}
				if (con != null) {
					con.close();
				}

			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}
}