package sort_collections;

import java.util.ArrayList;
import java.util.Collections;

public class Employee {

	String first_name;
	String last_name;
	
	public Employee(String first_name,String last_name) {
		this.first_name=first_name;
		this.last_name=last_name;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [first_name=" + first_name + ", last_name=" + last_name + "]";
	}
    
	@Override
	public boolean equals(Object ob)
	{
	   Employee	e=(Employee)ob;
	  
	   if(!(this.first_name.equals(e.first_name)))
	   {
		   System.out.println("The first names are not equal");
		   return false;
	   }
	   
	   if(!(this.last_name.equals(e.last_name)))
	   {
		   System.out.println("First names equal,last names are not");
		   return false;
	   }
	   
	   
	   System.out.println("Both equal");
	   return true;   
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> emp=new ArrayList<Employee>();
		emp.add(new Employee("Shruti","Sethia"));
		emp.add(new Employee("Charlie","Chaplin"));
		emp.add(new Employee("Shruti", "xyz"));
		
		
		//System.out.println(emp.contains(new Employee("Shruti", "abc")));
		
		System.out.println(emp);
		
		NameCompare namecompareobj=new NameCompare();
		Collections.sort(emp, namecompareobj);
		
		System.out.println(emp);
		
	}


}
