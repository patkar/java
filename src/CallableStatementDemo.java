import java.sql.*;
import java.util.Scanner;

public class CallableStatementDemo {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");

			String sql = "{?=call big1(?,?)}";
			CallableStatement cst = con.prepareCall(sql);

			cst.registerOutParameter(1, Types.INTEGER);

			cst.setInt(2, 300);
			cst.setInt(3, 300);
			cst.execute();

			// boolean ex = cst.execute();
			// if (ex == true) {
			System.out.println("Success");
			System.out.println("BIG is:" + cst.getInt(1));
			// } else
			// System.out.println("Problem");
		} catch (ClassNotFoundException e) {
			System.out.println("Class not found");
		} catch (SQLException e) {
			System.out.println("Sql Exception");
		} catch (java.lang.Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
