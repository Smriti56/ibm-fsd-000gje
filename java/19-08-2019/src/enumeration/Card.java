package enumeration;

public class Card {
	
	private Suit suit;
	private Rank rank;
	
	public Card(Suit suit, Rank rank) {
		super();
		this.suit = suit;
		this.rank = rank;
	}
	
//	public Suit suit()
//	{
//		return suit;
//	}
//	
//	public Rank rank()
//	{
//		return rank;
//	}
	
	public Card()
	{
		super();
	}

	@Override
	public String toString() {
		return "Card [suit=" + suit + ", rank=" + rank + "]";
	}
	
	
	
	
	
	

}
