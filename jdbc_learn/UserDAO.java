package jdbc_learn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;

public class UserDAO {

	private static final String DB_URL = "jdbc:mysql://localhost:3306/niitdb";
	private static final String USER = "root";
	private static final String PASS = "root";
    static Connection conn=null;
	private static Statement stmt;
	
	void establishConnection()
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
	
	public boolean register(User u) throws MyException
	{
		establishConnection();
		Integer userNameObtained=u.username;
		String passwordObtained=u.password;
		
		try {
			/*stmt=conn.createStatement();
			String sql;
			sql="SELECT username FROM user";
			ResultSet rs=stmt.executeQuery(sql);
			boolean flag=false;
			
			while(rs.next())
			{
			   String userNameCurrent=rs.getString("username");
			   if(userNameCurrent.equals(userNameObtained))
			   {
				   flag=true;
				   break;
			   }
			}		
			
			if(flag)
			{
				throw new UserAlreadyPresentException("User already exists");
			}		*/
			
			PreparedStatement stmt=conn.prepareStatement("Insert into user values(?,?)");
			stmt.setInt(1,userNameObtained);
			stmt.setString(2, passwordObtained);
			stmt.executeUpdate();
			
		} 
		catch(SQLIntegrityConstraintViolationException e)
		{
			throw new MyException("Username already exists ... Try Again");
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
		
	}
	
	
	public boolean login(User u)
	{
		establishConnection();
		Integer userNameObtained=u.username;
		String passwordObtained=u.password;
		Statement stmt;
		try {
		    
			String sql;
			stmt=conn.createStatement();
			sql="SELECT username,password FROM user ";
			ResultSet rs=stmt.executeQuery(sql);
			boolean flag=false;
			
			/*while(rs.next())
			{
			   String userNameCurrent=rs.getString("username");
			   String passwordCurrent=rs.getString("password");
			   if(userNameCurrent.equals(userNameObtained) && passwordCurrent.equals(passwordObtained))
			   {
				   flag=true;
				   break;
			   }
			}	*/	
			
			if(flag)
			{
			    return true;
			}	
			else
			{
				return false;
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	}

