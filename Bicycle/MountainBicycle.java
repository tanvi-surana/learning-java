package Bicycle;

public class MountainBicycle extends Bicycle {

	public MountainBicycle(int speed) {
		super(speed);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int applyBrakes() {
		return this.speed-=2;
	}

	@Override
	public void changeGear() {
		// TODO Auto-generated method stub
        System.out.println("In the mountain bicycle");
	}

	@Override
	public int speedUp() {
		// TODO Auto-generated method stub
		return this.speed+=2;
	}

}
