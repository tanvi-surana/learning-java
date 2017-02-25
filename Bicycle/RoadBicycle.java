package Bicycle;

public class RoadBicycle extends Bicycle {

	public RoadBicycle(int speed) {
		super(speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int applyBrakes() {
		// TODO Auto-generated method stub
		return this.speed--;
	}

	@Override
	public void changeGear() {
		// TODO Auto-generated method stub
		System.out.println("changing gear in the road bicycle");

	}

	@Override
	public int speedUp() {
		
		return this.speed++;
	}

}
