package Bicycle;

public abstract class Bicycle implements IBicycle {
	

	int speed;
	public Bicycle(int speed) {
		this.speed=speed;
		// TODO Auto-generated constructor stub
	}
	@Override
	public abstract int speedUp();
	
	 
}
