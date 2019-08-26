package encryption;

import java.io.IOException;

public class Main {
	public static void main(String args[]) throws IOException {
		
		SimpleEncryption s= new SimpleEncryption();
		s.encrypt("words.txt", "encrypt.txt", 3);
		s.viewFile("encrypt.txt");
		
	}
	
	

}
