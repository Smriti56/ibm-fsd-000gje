package assessment5;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortedMap<Character,Integer> treeMap=new TreeMap<Character,Integer>();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the input string");
		String sentence=sc.nextLine();
		//System.out.println(sentence);
		LetterSequence l=new LetterSequence(sentence);
		
		for(int i=0;i<sentence.length();i++)
		{
			int count=1;
			char c=sentence.charAt(i);
			if(c==' ')
			{
				
			}
			else if(treeMap.containsKey(c))
			{ 
				int number=treeMap.get(c);
				number=number+1;
				treeMap.put(c,number);
			}
			else
			{
				treeMap.put(c, count);
			}	
			
		}
		//System.out.println(treeMap);
		l.displayLetterFrequency(treeMap);
	}

}