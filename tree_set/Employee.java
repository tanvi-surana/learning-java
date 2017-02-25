package tree_set;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Employee implements Comparable<Employee>{
	
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
		result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (first_name == null) {
			if (other.first_name != null)
				return false;
		} else if (!first_name.equals(other.first_name))
			return false;
		if (last_name == null) {
			if (other.last_name != null)
				return false;
		} else if (!last_name.equals(other.last_name))
			return false;
		return true;
	}
	
	@Override
	//Change this
	public int compareTo(Employee o) {
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> emp=new ArrayList<Employee>();
		
		
		
		//System.out.println(emp.contains(new Employee("Shruti", "abc")));
		
		//System.out.println(emp);
	    NameCompare namecompareobj=new NameCompare();
		Set<Employee> s=new TreeSet<Employee>(namecompareobj);
		
		s.add(new Employee("Shruti","Sethia"));
		s.add(new Employee("Charlie","Chaplin"));
		s.add(new Employee("Shruti", "Sethia"));
		
		Set<Employee> s2=new TreeSet<Employee>();
		
		s2.add(new Employee("Shruti","Sethia"));
		s2.add(new Employee("Charlie","Chaplin"));
		s2.add(new Employee("Shruti", "Sethia"));
		
		System.out.println(s);
		System.out.println(s2);
		
	}

	

}
