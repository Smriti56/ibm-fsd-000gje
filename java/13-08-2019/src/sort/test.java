package sort;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {
				100,1,-20,30,0
		};
		
		int arr1[];
		arr1 =new int[5];
		
		new Tester().sortArray(arr);
		new Tester().pop(arr1);
		new Tester().push(arr1,3);
		new Tester().push(arr1,4);
		new Tester().push(arr1,5);
		//new Tester().push(arr1,20);
		
		
		int m=new Tester().pop(arr1);
		System.out.println(m);
		
		
		new Tester().push(arr1,6);
		new Tester().push(arr1,8);
		
		int p=new Tester().pop(arr1);
		System.out.println(p);
		
		new Tester().push(arr1,9);
		new Tester().push(arr1,10);
		
		new Tester().push(arr1,11);
		
		
		
		
		

	}

}