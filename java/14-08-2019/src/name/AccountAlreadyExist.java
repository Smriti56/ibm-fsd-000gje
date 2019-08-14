package name;

public class AccountAlreadyExist extends Throwable{
	
	private static final long serialVersionUID = -2592985287965466032L;
	private String msg;
	
	
	public AccountAlreadyExist() {
		super();
	}


	public AccountAlreadyExist(String msg) {
		super();
		this.msg = msg;
	}


	public String getMsg() {
		return msg;
	}


	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
	
	
	
	
	

}
