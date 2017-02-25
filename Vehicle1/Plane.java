package Vehicle1;

public class Plane extends Vehicle {

	public Plane() {
		// TODO Auto-generated constructor stub
	}
		
	public void run()
	{
	   e=new PlaneEngine();	
	   startEngine();
	   System.out.println("In the plane");
	}
	
	public static void main(String args[])
	{
	     
		Plane v=new Plane();
		v.run();
		
	}
}
