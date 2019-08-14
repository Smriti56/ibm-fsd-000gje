package comm.example;

public class Superman extends Flyer{

	@Override
	public void takeoff() {
		System.out.println("superman takeoff");
		
	}

	@Override
	public void fly() {
		System.out.println("superman fly");
		
	}

	@Override
	public void land() {
		System.out.println("Superman land");
		
	}

}
