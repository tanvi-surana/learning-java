package emp_bonus;

public class testEmpBonus {

	public static void main(String args[])
	{
		Employee a1=new Regular(100);
		Employee b1=new Contractors(50);
		Employee a2=new Regular(200);
		Employee b2=new Contractors(50);
		Employee b3=new Contractors(50);
		Employee a3=new Regular(300);
		
		Employee arr[]={a1,b1,a2,b2,b3,a3};
		
		for(int i=0;i<arr.length;i++)
		{
			Employee x=arr[i];
			x.printBonus();
		}
	}

}
