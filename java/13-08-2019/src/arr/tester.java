package arr;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDemo arrayDemo = new ArrayDemo();
		arrayDemo.createArray(26);
		char[] arr = arrayDemo.getArr();
		for(char c:arr) {
			System.out.print(c+" ");
		}
	}

}