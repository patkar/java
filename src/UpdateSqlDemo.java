import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class UpdateSqlDemo {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String jdbcurl = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "scott";
		String password = "tiger";
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(jdbcurl, username, password);
			String lastname = "";
			System.out.println("Enter lastname:");

			lastname = br.readLine();
			String sql = "delete from persons where lastname=?";
			PreparedStatement psm = null;

			psm = con.prepareStatement(sql);

			psm.setString(1, lastname);

			int rowsAffected = 0;

			rowsAffected = psm.executeUpdate();

			if (rowsAffected > 0)
				System.out.println("Updated");
			else
				System.out.println("Problem");
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}
	}
}
