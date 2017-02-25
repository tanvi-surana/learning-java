package vehicle;

public class Car extends Vehicle {

	//int maxSpeed;
	public Car(int speed) {
		super(speed);
		//this.maxSpeed=speed;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Car [maxSpeed=" + maxSpeed + "]";
	}
}
