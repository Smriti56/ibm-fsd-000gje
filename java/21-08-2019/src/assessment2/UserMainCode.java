package assessment2;

import java.util.regex.Pattern;

import java.util.regex.Matcher;

public class UserMainCode {
	
	public static boolean checkPassword(String password){
		
		if(password.length()<=8)
		{
			return false;
		}
		else 
		{
			boolean hasUppercase = !password.equals(password.toLowerCase());
			boolean hasLowercase = !password.equals(password.toUpperCase());
			Pattern p = Pattern.compile("[^a-zA-Z0-9]*");
			Matcher matcher=p.matcher(password);
			
			
			
			if(hasUppercase && hasLowercase)
			{
				if(!matcher.matches())
				{
					return true;
				}
				else
				{
					return false;
				}
				
			}
			else
			{
				return false;
			}
			
		}
		
		
	}

}