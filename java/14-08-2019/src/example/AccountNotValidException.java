package example;

public class AccountNotValidException extends Throwable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2473378385400865414L;
	private String message;

	public AccountNotValidException() {
		super();
	}

	public AccountNotValidException(String message) {
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
