import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class DailySteps {

	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			con.setAutoCommit(false);

			String name = "";
			String date;
			int steps = 0;

			System.out.println("Enter name:");
			name = br.readLine();
			System.out.println("Enter date:");
			date = br.readLine().trim();
			System.out.println("Enter steps:");
			steps = Integer.parseInt(br.readLine());

			String sql = "insert into dailysteps values(?,?,?)";
			PreparedStatement psm = con.prepareStatement(sql);
			psm.setString(1, name);
			psm.setString(2, date);
			psm.setInt(3, steps);

			int rowsAffected = psm.executeUpdate();
			if (rowsAffected <= 0) {
				System.out.println("Trans failed");
				return;
			}
			System.out.println("Inserted into daily steps");
			sql = "select * from totalsteps";
			psm = con.prepareStatement(sql);
			ResultSet rs = psm.executeQuery();
			if (rs.next()) {
				int ts = rs.getInt(2);
				ts += steps;
				sql = "update totalsteps set steps=" + ts;
				psm=con.prepareStatement(sql);
			} else {
				sql = "insert into totalsteps values(?,?)";
				psm = con.prepareStatement(sql);
				psm.setString(1, name);
				psm.setInt(2, +steps);
			}
			rowsAffected = psm.executeUpdate();
			if (rowsAffected <= 0) {
				System.out.println("Trans failed");
				con.rollback();
				return;
			}
			System.out.println("Trans success");
			con.commit();
		} catch (java.lang.Exception e) {
			System.out.println(e.getMessage());
			StackTraceElement[] elements =e.getStackTrace();
			for(StackTraceElement s:elements)
				System.out.println(s.getLineNumber());
		}
	}

}
