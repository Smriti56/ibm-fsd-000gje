package name;

public class NameNotValid extends Throwable{
	
	private static final long serialVersionUID = 8620973261679292573L;
	private String message;
	
	public NameNotValid() {
		super();
	}
	
	
	public NameNotValid(String message) {
		super();
		this.message = message;
	}


	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
	
	

}
