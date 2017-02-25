package sort_collections;

import java.util.Comparator;

public class NameCompare implements Comparator<Employee> {

	public NameCompare() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		if(!(o1.first_name.equals(o2.first_name)))
		{
			return o1.first_name.compareTo(o2.first_name);
		}
		
		if(!(o1.last_name.equals(o2.last_name)))
		{
			return o1.last_name.compareTo(o2.last_name);
		}
		
		return 0;
	}

}
