package sort;

import java.util.Arrays;

public class Tester {
	
	private static int index;
	static{index= 0;}
	

	
		public void sortArray (int arr[]) {
			Arrays.sort(arr);
			for(int a:arr)
			{
				System.out.print
				(a+" ");
			}	
		}
		

	/*	public boolean Search(int a) {
			// TODO Auto-generated method stub
			int i = Arrays.binarySearch(arr, a);
			if(i>0) { return true;}
			else {return false;}
		}
		*/
		
		public void push(int arr[],int item) {
			if(index==arr.length)
			{
				System.out.println();
				System.out.println("Stack is full");
			}
			else
			{
				System.out.println();
				arr[index]=item;
				index++;
				for(int a:arr)
				{
					System.out.print(a+" ");
				}	
			}
			
		}
		
		public int pop(int arr[]) {
			if(index>0) {
				System.out.println();
				int n=arr[index-1];
				index--;
				return n;
				
			}
			else
			{
				System.out.println("Stack is empty");
				return 0;
				
			}
			
			
			
			
		}
		
		
	
		public int add(int... var)
		{
			int result =0;
			for(int i:0)
			{
				result+=i;
			}
		}
		
	
		
		

	

}
