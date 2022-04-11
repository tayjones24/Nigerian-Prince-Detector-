package jUnitTestJNPD;

import java.sql.*;

public class Driver {

	public static void main(String[] args) {

		// Creating a new connection to the database
		connectionDB connection = new connectionDB();
		Connection connect = null;
		PreparedStatement p = null;
		ResultSet rs = null;

		// Connecting to the database
		connect = connection.connectDB();
	}
}
