package jUnitTestJNPD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Creates a connection to the Nigerian Royalty Database with all the necessary
 * information
 * 
 * @author veronikakermoshchuk
 *
 */
public class connectionDB {

	final String DB_URL = "jdbc:mysql://localhost:3306/Nigerian Princes";

	final String USER = "root";

	final String PASS = "NigerianRoyalty1!";

	/**
	 * Connects to the Database
	 * 
	 * @return
	 */
	public Connection connectDB() {
		Connection connect = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect = DriverManager.getConnection(DB_URL, USER, PASS);
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connect;
	}
}
