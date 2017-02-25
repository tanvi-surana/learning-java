package Vehicle1;

public abstract class Vehicle{

    Engine e;	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void startEngine()
	{
		e.start();
		//System.out.println("Base class");
	}
	
	
}

