package Vehicle1;

public class Car extends Vehicle {

	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void run()
	{
		e=new Engine(); //don't hardcode, use a constructor
		startEngine();
		System.out.println("In the car");
	}
	
	public static void main(String args[])
	{
	     
		Car v=new Car();
		v.run();
		
	}

}
