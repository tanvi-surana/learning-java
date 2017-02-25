package vehicle;

public class VehicleTest {

	public static void main(String[] args) {
		
		Vehicle vc=new Car(10);
		Vehicle vp=new Plane(1000);
		
		Vehicle arr[]={vc,vp};
		
		for(int i=0;i<arr.length;i++)
		{
			Vehicle v=arr[i];
			System.out.println(v);
		}

	}

}
