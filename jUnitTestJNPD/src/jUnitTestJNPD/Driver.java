package jUnitTestJNPD;

import java.sql.*;

public class Driver {

	public static void main(String[] args) {

		// Creating a new connection to the database
		connectionDB connection = new connectionDB();
		Connection connect = null;
		PreparedStatement p = null;
		ResultSet rs = null;

		connect = connection.connectDB();

		// Selecting all the data in the table with Nigerian Royalty names and print all
		// names with their id's
		try {
			String sql = "SELECT * FROM `Nigerian Royalty Names`;";

			p = connect.prepareStatement(sql);
			rs = p.executeQuery();

			System.out.println("id\t\tname\t");

			// Prints all rows of data while the next row is not empty
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				System.out.println(id + "\t\t" + name + "\t\t");
			}
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}
