package dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class DBCon {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String dbUrl = "jdbc:mysql://127.0.0.1:3306/employee";
		//Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(dbUrl,"root","punitboss");
		
		Statement stm = con.createStatement();
		
		ResultSet result = stm.executeQuery("Select * from employeedetails;");
		
//		System.out.println(result.last());
//		System.out.println(result.getInt("EmpId"));
		
		while(result.next())
		{
			System.out.println(result.getInt("EmpId"));
		}
		
		
		
		
	}

}
