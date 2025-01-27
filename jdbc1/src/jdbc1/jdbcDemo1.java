package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcDemo1 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String username = "root";
		String password = "Java@123";
		String query = "select * from employee ";
		try {
			Connection con = DriverManager.getConnection(url, username, password);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				System.out.println("Id is "+rs.getInt(1));
				System.out.println("Name is "+rs.getString(2));
				System.out.println("Salary is "+rs.getInt(3));
			}
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
