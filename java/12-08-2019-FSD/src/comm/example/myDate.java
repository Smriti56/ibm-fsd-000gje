package comm.example;

public class myDate {
	private int day;
	private int month;
	private int year;

	
	
	
	public void createDate(int d, int m, int y) 
	{
		if(d>30) {
			System.out.println("day cant be greater than 30");
			System.exit(0);
		}
		if(m>12) {
			System.out.println("month cant be greater than 30");
			System.exit(0);
		}
		if(y<1990 && y>2019) {
			System.out.println("wrong year");
			System.exit(0);
		}
		
		day=d;
		month=m;
		year=y;
	}
		
		public String getDetails() 
		{
			return day+"-"+month+"-"+year;
		}

		
		
}
