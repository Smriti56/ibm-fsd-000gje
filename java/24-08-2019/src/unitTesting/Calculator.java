package unitTesting;

public class Calculator {
	private int x;
	private int y;
	private int result;
	
	public Calculator() {
		super();
	}

	public Calculator(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int addMethod(int x,int y)
	{
		result=x+y;
		return result;
	}
	
	
	public int subMethod(int x,int y)
	{
		return x-y;
	}
	
	public int checkNumber(int x,int y)
	{
		return x>y?1:-1;
	}
	
	public int mulMethod(int x,int y)
	{
		return x*y;
	}
	
	public int divMethod(int x,int y)
	{
		return x/y;
	}
	

}
