package jdbc_learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCDemo {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/niitdb";
	private static final String USER = "root";
	private static final String PASS = "root";
	public JDBCDemo() {
		// TODO Auto-generated constructor stub
	}

	private static Statement stmt;
	public static void main(String[] args) {
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.driver");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			//open a connection
			System.out.println("Connecting to a database ...");
			conn=DriverManager.getConnection(DB_URL,USER,PASS);
			System.out.println("Connected to db ... ");
			
			//execute a query
			System.out.println("Creating a statement");
			stmt=conn.createStatement();
			String sql;
			sql="SELECT id,name FROM user";
			ResultSet rs=stmt.executeQuery(sql);
		
			while(rs.next())
			{
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
