package assessment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Main {

	public static void main(String args[])
	{
		SortedMap<String,List<String> > list= new TreeMap<String,List<String>>();
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Sample input/output");
		int n= sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			String names=sc.next();
			String name[]=names.split("\\|");
			String country=name[0];
			String state=name[1];
			if(list.containsKey(country))
			{
				list.get(country).add(state);
				
			}
			else
			{
				
				list.put(country,.add(state));
			}
		}
		
		for(Entry<String,List<String> > entry: list.entrySet())
		{
			System.out.println(entry.getKey());
			int n1=entry.getValue().size();
			System.out.println(entry.getValue());
			System.out.println(n1);
		}
}
}