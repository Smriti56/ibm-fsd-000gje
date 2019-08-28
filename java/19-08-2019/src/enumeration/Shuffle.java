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
		
		System.out.println("Enter no of hands");
		Scanner sc= new Scanner(System.in);
		noOfHands=sc.nextInt();
		System.out.println("Enter no of cards per hand");
		noOfCardsPerHand=sc.nextInt();
		
		List<Card> deck= new ArrayList<Card>();
		
		
		
		for(Suit s:Suit.values())
		{
			for(Rank r:Rank.values())
			{
				deck.add(new Card(s,r));
		}
		}
		
		char ans;
		do
		{		
			Collections.shuffle(deck);
			
			
			System.out.println("Distribute again");
			ans=sc.next().charAt(0);
				
		}while(ans=='y');
	
		
	}

}
