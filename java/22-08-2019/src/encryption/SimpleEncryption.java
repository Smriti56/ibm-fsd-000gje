package encryption;

import java.io.*;

public class SimpleEncryption {
	
	void encrypt(String source, String dest, int shiftSize) throws IOException
	{
		
		BufferedReader reader = new BufferedReader(new FileReader(source));
		BufferedWriter writer = new BufferedWriter(new FileWriter(dest));
		
		String line=reader.readLine();
		
		int data;
		while(line!=null)
			{
			int count=0;
				for(int i=0;i<line.length();i++)
				{
					
					if(line.charAt(i)=='a' || line.charAt(i)=='e' || line.charAt(i)=='i'|| line.charAt(i)=='o'|| line.charAt(i)=='u'|| line.charAt(i)=='A'|| line.charAt(i)=='E' || line.charAt(i)=='I'|| line.charAt(i)=='O'|| line.charAt(i)=='U')
					{
						count++;
					}
					data=(int)line.charAt(i)+shiftSize;
					writer.write(data);
				}
				writer.write((int)'\n'+" "+count);
				//writer.write(count);
				line=reader.readLine();
				
			}
		reader.close();
		writer.close();
		
	}
	
	public void viewFile(String filename) throws IOException
	{
		BufferedReader reader;
		
		reader = new BufferedReader(new FileReader(filename));
		String line=reader.readLine();
		while(line!=null)
		{
			System.out.println(line);
			line=reader.readLine();
		}
		reader.close();
	
	}

}
