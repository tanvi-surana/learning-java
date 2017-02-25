package emp_bonus;

public class Regular extends Employee {

	int salary;
	public Regular(int salary) {
		super();
		this.salary=salary;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Regular [salary=" + salary + "]";
	}
	
	@Override
    public void printBonus()
    {
    	int incr=(int) (0.15*salary);
    	System.out.println(incr);
    }

}
