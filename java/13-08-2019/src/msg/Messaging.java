package msg;

public class Messaging {

	private String message;
	private static Messaging messaging;



	private Messaging(String message) {
		super();
		this.message = message;
	}

	private Messaging() {
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	//static method so as to initiate private constructor
	public static Messaging createMessagingObject() {
		if (messaging == null) {
			System.out.println("without msg");
			messaging = new Messaging();
		}
		return messaging;	
	}

	public static Messaging createMessagingObject(String name) {
		if (messaging == null) {
			messaging = new Messaging(name);
			
		}
		System.out.println("with msg "+name);
		return messaging;

	}

	@Override
	public String toString() {
		return "Meessaging{"+
				"message="+message+'\''+ '}';
	}





}
