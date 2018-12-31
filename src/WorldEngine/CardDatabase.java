package WorldEngine;
import java.util.ArrayList;
public class CardDatabase {
	public CardDatabase()
	{
		//Card Data will be stored here and accessible in the main method.
		ArrayList<Card> cardData = new ArrayList<Card>();
		cardData.add(new Card("Lightning Resource", 0001, 10, 10, 1));
		cardData.add(new Card("Water Resource", 0002, 10, 10, 2));
		cardData.add(new Card("Fire Resource", 0003, 10, 10, 3));
		cardData.add(new Card("Earth Resource", 0004, 10, 10, 4));
		cardData.add(new Card("Panzer-Hydra", 0005, 1000, 2500, 5));
		cardData.add(new Card("Knight", 0006, 500, 750, 6));
		cardData.add(new Card("Warrior" , 0007, 800, 750, 7));
	}
	
}
