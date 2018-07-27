import java.sql.*;

public class JDBCConnectDemo {

	public static void main(String[] args) throws SQLException {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e1) {
			System.out.println("Unable to locate driver");
		}

		String jdbcurl = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "scott";
		String password = "tiger";
		Connection con = null;
		try {
			con = DriverManager.getConnection(jdbcurl, username, password);
			System.out.println("Connection is successful,you are now connected to oracle");
		} catch (SQLException e) {
			System.out.println("Could not connect to the server,some problem");
			System.out.println(e.getMessage());
		}
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM EMPLOYEE");
		System.out.println("Name" + "\t" + "Salary" + "\t" + "Dept" + "\t\t" + "city");
		System.out.println("_____________________________________________");
		while (rs.next()) {
			String name = rs.getString(1);
			int sal = rs.getInt(2);
			String dept = rs.getString(3);
			String city = rs.getString(4);

			System.out.println(name.trim() + "\t|" + sal + "\t|" + dept + "\t|" + city.trim());
		}

		rs.close();
		stmt.close();
		con.close();
	}

}
