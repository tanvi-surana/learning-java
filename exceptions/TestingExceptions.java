package exceptions;

public class TestingExceptions {

	public TestingExceptions() {
		
	}

	public static void e1(int x) throws RandomException
	{
		try
		{
			if(x<10)
				throw new RandomException("abc");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Tada! ");
		}
	}
	
	public static void e2(int x) throws RandomRuntimeException
	{
		try
		{
			if(x<10)
				throw new RandomRuntimeException("def");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Tada! ");
		}
	}
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		//TestingExceptions a=new TestingExceptions();
	    try {
			e1(5);
		} catch (RandomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    e2(12);

	}

}
