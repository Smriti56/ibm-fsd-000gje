package prod;

public class Product {
	private int currRate;
	 
	private static int item;
	
	static {item=0;}

	public Product() {
		super();
		item++;
	}

	public Product(int currRate) {
		super();
		item++;
		this.currRate = currRate;
		System.out.println(item);
	}
	
	
	
	
	
	

}