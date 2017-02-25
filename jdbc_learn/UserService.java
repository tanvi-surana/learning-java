package jdbc_learn;

public class UserService {

	public UserService() {
		// TODO Auto-generated constructor stub
	}
    
	public static void registerUser(User u) throws MyException
	{
		 UserDAO obj=new UserDAO();
		if(u.password.equals(u.confirmPassword))
		{
			if(obj.register(u))
			{
			  System.out.println("User registered");	
			}
			
		}
		
	}
	
	public static void login(User u)
	{
		
		UserDAO obj=new UserDAO();
		if(obj.login(u))
		{
			System.out.println("Finally logging in ...");
		} 		
		else
		{
			System.out.println("Login failed");
		}		
		//return false;
	}

	public static void main(String[] args)
	{
		User u=new User(1,"password","password");
		/*try {
			registerUser(u);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		login(u);
	}
}
