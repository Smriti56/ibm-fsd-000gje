package Practice;


	import java.io.*;
	import java.util.*;
	public class Str {
	    public static void main(String args[] ) throws Exception {

	        //Write code here
	       
	        Scanner sc= new Scanner(System.in);
	        int n= sc.nextInt();
	        if(n<10)
	        {
	        	 for(int i=0;i<n;i++)
	 	        {
	 	        	 HashMap<Character, Integer> hm= new HashMap<Character,Integer>();
	 	 	        int count=1;
	 	 	        int max = 0;
	 	 	        char ch = '\0';
	 	            char[] str=sc.next().toCharArray();
	 	      
	 	            if(str.length<=100000)
	 	            {
	 	            	 for(int j=0;j<str.length;j++)
	 	 	            {
	 	 	      
	 	 	                if( hm.containsKey(str[j]) )
	 	 	                {
	 	 	                    int m=hm.get(str[i]);
	 	 	                    hm.put(str[j],++m);
	 	 	                }
	 	 	                else
	 	 	                {
	 	 	                    hm.put(str[j],count);
	 	 	                }
	 	 	            }

	 	 	            for (Map.Entry mapElement : hm.entrySet()) 
	 	 	            { 
	 	 	                 int value = (int)mapElement.getValue();
	 	 	                 if(value>max)
	 	 	                 {
	 	 	                     max=value;
	 	 	                     ch=(char)mapElement.getKey();
	 	 	                 } 
	 	 	                 } 
	 	 	                 System.out.println(ch);

	 	            }
	 	            
	 	           
	 	        }
	        }
	       

	   }
	}


