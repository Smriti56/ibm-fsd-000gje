package comm.example.model;

public class User {
	private String name;
	private String password;
	
	
	
	

	public User() {
		super();
	}





	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}





	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}





	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}





	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}





	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}





	public String validate(String s1,String s2)
	  {
	    if(s1.equals(name) && s2.equals(password))
	      return "VALID";
	    else
	     return "INVALID";
	   }

}
