package employee;

public class Address {

	public int houseNo;
	String locality;
	String landmark;
	
	public Address(int houseNo,String locality,String landmark)
	{
		this.houseNo=houseNo;
		this.locality=locality;
		this.landmark=landmark;
	}
	
	
	
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", locality=" + locality + ", landmark=" + landmark + "]";
	}



	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a=new Address(123,"abc","def");
		System.out.println(a);

	}*/

}
