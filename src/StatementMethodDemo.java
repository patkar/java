import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
public class StatementMethodDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String jdbcurl = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "scott";
		String password = "tiger";
		Connection con = null;
		try {
			con = DriverManager.getConnection(jdbcurl, username, password);
			//System.out.println("Connection is successful,you are now connected to oracle");
		} catch (SQLException e) {
			System.out.println("Could not connect to the server,some problem");
			System.out.println(e.getMessage());
		}
		//Statement stmt = con.createStatement();
		
		String lastname="";
		String firstname="";
		String address="";
		String city="";
		
		System.out.println("Enter lastname:");
		lastname=br.readLine();
		System.out.println("Enter firstname:");
		firstname=br.readLine();
		System.out.println("Enter address:");
		address=br.readLine();
		System.out.println("Enter city:");
		city=br.readLine();
		
		String sql="insert into persons values(?,?,?,?)";
		PreparedStatement psm=con.prepareStatement(sql);
		psm.setString(1, lastname);
		psm.setString(2, firstname);
		psm.setString(3, address);
		psm.setString(4, city);
		
		
		//String sql="insert into persons values('Nayak','Sanjay','Mangalore','Mangalore')";
		int rowsAffected=psm.executeUpdate();
		if(rowsAffected>0)
			System.out.println("Updated");
		else
			System.out.println("Problem");
		
		
	}

}
