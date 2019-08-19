package enumeration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Shuffle {
	public static void main(String args[])
	{
		int noOfHands;
		int noOfCardsPerHand;
		
		
		char ans;
		do
		{
			System.out.println("Enter no of hands");
			Scanner sc= new Scanner(System.in);
			noOfHands=sc.nextInt();
			System.out.println("Enter no of cards per hand");
			noOfCardsPerHand=sc.nextInt();
			
			
			List<String> rank= new ArrayList<String>();
			List<String> suit= new ArrayList<String>();
			Collections.addAll(rank, "deuce","three","four","five","six","seven","eight","nine","jack","queen","king");
			Collections.addAll(suit,"spade","ace","club","diamond");
			
			
			List<Card> deck= new ArrayList<Card>();
			
			
		
			System.out.println("Distribute again");
			ans=sc.next().charAt(0);
				
		}while(ans=='y');
	
		
	}

}
