package comm.example;

public class Bird extends Flyer{

	@Override
	public void takeoff() {
		System.out.println("Bird takeoff");
		
	}

	@Override
	public void fly() {
		System.out.println("Bird fly");
	}

	@Override
	public void land() {
		System.out.println("Bird land");
		
	}
	
}
