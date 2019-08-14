package example;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	public boolean setDay (int d) {
			if(d<=30) {
				day=d;
				return true;	
				
			}
			else return false;
	}
	public boolean setMonth (int m) {
		if(m<=12) {
			month=m;
			return true;
			
		}
		return false;
		
	}
	public boolean setYear (int y) {
		if(y<2019) {
			year=y;
			return true;
		}
		return false;
		
	}
	
	public int getDay() {
		return day;
	}
	
public int getMonth() {
	return month;
		
	}
public int getYear() {
	return year;
}
}

