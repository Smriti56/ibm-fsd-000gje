package example;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Account account = new Account();
		try {
			account.createNewAccount("SB101", 10000.00);
		} catch (AccountNotValidException e) {
			//e.printStackTrace();
			System.err.println(e.getMessage());
		}

	}


}
