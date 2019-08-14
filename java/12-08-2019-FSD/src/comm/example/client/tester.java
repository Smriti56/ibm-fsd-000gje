package comm.example.client;
import example.MyDate;

public class tester {

	public static void main(String[] args) {
		int d,m,y;
		// TODO Auto-generated method stub
		MyDate date =new MyDate();
		date.setDay(21);
		date.setMonth(5);
		date.setYear(2018);
		d=date.getDay();
		m=date.getMonth();
		y=date.getYear();
		System.out.println("Day is :"+d+" month is :"+m+" year is :"+y);
				

	}

}
