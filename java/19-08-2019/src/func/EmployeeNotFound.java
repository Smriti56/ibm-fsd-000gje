package func;

public class EmployeeNotFound extends Throwable{

	
	private static final long serialVersionUID = -6717113425327033221L;
	private String msg;
	
	
	
	public EmployeeNotFound() {
		super();
	}
	public EmployeeNotFound(String msg) {
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
