package msg;

public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Messaging m= Messaging.createMessagingObject();
		Messaging m1 =Messaging.createMessagingObject("test");
		String name=m.toString();
		System.out.println(name);
		

	}

}