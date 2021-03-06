package collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class CollectionDemo {
	static Scanner sc = new Scanner(System.in);
	private String str[];
	private Set<String> set;
	
	public CollectionDemo() {
		System.out.println("no of elements in array:");
		str = new String[sc.nextInt()];
		
		for( int i=0;i<str.length;i++) 
		{
			System.out.println("Name : ");
			str[i]=sc.next().toString().toLowerCase();
		}
		
		set = new HashSet<String>();
		for (String s:str)
		{
			if(!set.add(s))
			{
				System.out.println("Duplicate elements can't be added "+s);
			}
			
		}
	}
	
	public void displayCollection() {
		for(String s:set)
		{
			System.out.println(s);
		}
	}
	
	


}
