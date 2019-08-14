package example;

public class Line extends Model {
	private int startPoint;
	private int endpoint;
	
	public Line() {
		super();
	}
	
	


	public Line(int startPoint, int endpoint) {
		super();
		this.startPoint = startPoint;
		this.endpoint = endpoint;
	}




	public int getStartPoint() {
		return startPoint;
	}

	
	public void setStartPoint(int startPoint) {
		this.startPoint = startPoint;
	}

	
	public int getEndpoint() {
		return endpoint;
	}

	
	public void setEndpoint(int endpoint) {
		this.endpoint = endpoint;
	}

	public int CalculateLength() {
		return getEndpoint()-getStartPoint();
	}
	
	@Override
	public boolean greaterThan(Object obj1, Object obj2) {
		Line l1=(Line)obj1;
		Line l2=(Line)obj2;
		
		return l1.CalculateLength()>l2.CalculateLength();
	}

	@Override
	public boolean equalTo(Object obj1, Object obj2) {
		Line l1=(Line)obj1;
		Line l2=(Line)obj2;
		return l1.CalculateLength()==l2.CalculateLength();
		
	}

	@Override
	public boolean lesserThan(Object obj1, Object obj2) {
		Line l1=(Line)obj1;
		Line l2=(Line)obj2;
		return l1.CalculateLength()<l2.CalculateLength();
	}




	@Override
	public int moreThan(Object obj) {
		Line l1=(Line)obj;
		return l1.CalculateLength();
	}
	

}
