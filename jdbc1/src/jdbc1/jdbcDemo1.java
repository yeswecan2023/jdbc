package jdbc1;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcDemo1 {

	public static void main(String[] args) throws Exception {
		update();
	}
	
	public static void readRecord() throws Exception {
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String username = "root";
		String password = "Java@123";
		String query = "select * from employee ";
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while (rs.next()) {
			System.out.println("Id is "+rs.getInt(1));
			System.out.println("Name is "+rs.getString(2));
			System.out.println("Salary is "+rs.getInt(3));
		}
		con.close();
	}
	
	public static void insertUsingPst() throws Exception {
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String username = "root";
		String password = "Java@123";
		
		int id = 7;
		String name = "nik";
		int salary = 600000;
		
		
		String query = "Insert into employee values ( ?,?,?)";
		
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pst = con.prepareStatement(query);
		pst.setInt(1, id);
		pst.setString(2,name);
		pst.setInt(3, salary);
		int rows = pst.executeUpdate();
		System.out.println(rows);
		con.close();
	}
	
	public static void delete() throws Exception {
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String username = "root";
		String password = "Java@123";
		
		int id = 5;
		
		String query = "delete from employee where emp_id = "+id ;
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		int rows = st.executeUpdate(query);
		System.out.println(rows);
		con.close();
	}
	
	public static void update() throws Exception {
		String url = "jdbc:mysql://localhost:3306/jdbcdemo";
		String username ="root";
		String password = "Java@123";
		
		String query = "update employee set salary = 8000000 where emp_id = 3";
		
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		int row = st.executeUpdate(query);
		System.out.println(row);		
	} 
	

}
