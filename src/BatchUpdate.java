import java.sql.*;
import java.util.Scanner;

public class BatchUpdate {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Scanner sc = new Scanner(System.in);
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			String sql = "insert into persons values(?,?,?,?)";
			PreparedStatement psm = con.prepareStatement(sql);
			System.out.println("Enter no of iterations:");
			for (int j = 0, n = sc.nextInt(); j < n; j++) {
				for (int i = 1; i <= 4; i++)
					psm.setString(i, sc.nextLine());
				psm.addBatch();
			}
			psm.executeBatch();
		} catch (java.lang.Exception e) {
			System.out.println(e.getMessage());
		}
	}
}