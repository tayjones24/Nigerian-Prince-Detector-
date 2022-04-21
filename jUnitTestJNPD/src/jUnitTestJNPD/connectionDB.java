package jUnitTestJNPD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	
	String database = "";
	

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

	/**
	 * Searches the database and if the given name matches any name in the database.
	 * Returns a string saying whether the person is a real Nigerian Royalty or not
	 * 
	 * @param s
	 * @return
	 */
	public String isLegit(String s) {
		PreparedStatement p = null;
		ResultSet rs = null;

		try {
			String sql = "SELECT Name FROM `Nigerian Royalty Names` WHERE Name = '" + s + "'";

			p = this.connectDB().prepareStatement(sql);
			rs = p.executeQuery();
			rs.next();

			if (rs.getString("Name") != null) {
				return "Yes, it is a real Nigerian Royalty";
			}

		} catch (SQLException e) {
			System.out.println(e);
		}
		return "Name not found. Not a real Nigerian Royalty!";
	}

	/**
	 * Prints the table of the database that contains Nigerian Royalty Names. Prints
	 * the name of the royalty with the corresponding unique id for all the names
	 */
	public void printDB() {
		PreparedStatement p = null;
		ResultSet rs = null;

		try {
			String sql = "SELECT * FROM `Nigerian Royalty Names`";

			p = this.connectDB().prepareStatement(sql);
			rs = p.executeQuery();

			while (rs.next()) {

				int id = rs.getInt("id");
				String name = rs.getString("name");

				System.out.println(id + "\t\t" + name + "\t\t");
				database += id + "\t\t" + name + "\t\t";
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
