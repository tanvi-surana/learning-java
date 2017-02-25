package jdbc_learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Testing {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/niitdb";
	private static final String USER = "root";
	private static final String PASS = "root";
    static Connection conn=null;
	private static Statement stmt;
	
	static void establishConnection()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			//open a connection
			System.out.println("Connecting to a database ...");
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
			System.out.println("Connected to db ... ");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		establishConnection();

	}

}
