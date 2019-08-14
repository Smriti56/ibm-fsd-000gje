package prod;

public class Electronics extends Product{
	private int manufacturingYear;

	public Electronics() {
		super();
	}

	public Electronics(int manufacturingYear) {
		super(300);
		this.manufacturingYear = manufacturingYear;
	}
	
	
}
