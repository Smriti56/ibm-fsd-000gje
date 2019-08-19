package innerClass;

public class OuterClass {
	
	private int x;
	private int y;

	public OuterClass() {
		super();
	}
	
	public OuterClass(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void outerMethod() {
		System.out.println("calling outer method: x="+x+"y="+y);
	}
	
	public class InnerClass{
		public void innerMethod() {
			outerMethod();
			
			x=10;
			outerMethod();
			
			y=20;
			outerMethod();
		}
		
		public class Inner2{
			public void innerMethod2() {
				x=30;
				outerMethod();
			}
		}
	}
	
	
	
	
	

}