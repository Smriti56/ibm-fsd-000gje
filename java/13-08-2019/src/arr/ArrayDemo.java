package arr;

public class ArrayDemo {
	
	private char arr[];
	//autoboxing
	//private Integer a new Integer(10);
	//private Integer a= 10;
	
	//autounboxing
	//int b=a.intValue();
	//int b=a;
	
	public ArrayDemo() {
		
	}
	public void createArray(int length) {
		arr= new char[length];
		for(int i=0;i<length;i++) {
			arr[i]=(char)('A'+i);
		}
	}
	
	
	public char[] getArr() {
		return arr;
	}
	/**
	 * @param arr the arr to set
	 */
	public void setArr(char[] arr) {
		this.arr = arr;
	}
	
	
	

}
