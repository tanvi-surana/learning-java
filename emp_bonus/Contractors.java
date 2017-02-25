package emp_bonus;

public class Contractors extends Employee {

	int pay_per_day;
	public Contractors(int pay_per_day) {
		super();
		this.pay_per_day=pay_per_day;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Contractors [salary=" + pay_per_day + "]";
	}
	
	@Override
	public void printBonus()
    {
    	int incr=5000;
    	System.out.println(incr);
    }
}
