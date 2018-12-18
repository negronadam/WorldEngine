package WorldEngine;
import java.util.Random;
public class CardClass {
	Random generator = new Random();
	private int cardID;
	private int cardNumbers;
	private double cardHP;
	private double cardMP;
	private String cardName;
	CardClass[] cards = new CardClass[150];
	public CardClass()
	{
		cardID = 0;
		
	}
	
	public void card()
	{
		
	}
	
	public void getCard (int cardNumber)
	{
		
	}
	
	public void shuffleCards()
	{
		for(int i = 0; i < cards.length - 50; i++)
		{
			int randomnum = 1 - generator.nextInt(50 - 1 + 1);
			 
		}
	}
}
