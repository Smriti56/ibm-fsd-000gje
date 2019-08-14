package Act;
import Act.Account;

public class Details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1;
		a1=new Account("Smriti",10000);
		Account a2;
		a2=new Account("Yukta",10000);
		
		System.out.println(a1.equals(a2));
		
		
		System.out.println(a1==a2);
				
		System.out.println(a1.toString());
		System.out.println(a2.toString());

		
	}

}
