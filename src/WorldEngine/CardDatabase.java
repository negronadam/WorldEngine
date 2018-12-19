package WorldEngine;
import java.util.ArrayList;
public class CardDatabase {
	public CardDatabase()
	{
		ArrayList<CardClass> cardData = new ArrayList<CardClass>();
		cardData.add(new CardClass("Lightning Resource", 0001, 10, 10, 1));
		cardData.add(new CardClass("Water Resource", 0002, 10, 10, 2));
		cardData.add(new CardClass("Fire Resource", 0003, 10, 10, 3));
		cardData.add(new CardClass("Earth Resource", 0004, 10, 10, 4));
		cardData.add(new CardClass("Panzer-Hydra", 0005, 1000, 2500, 5));
	}
	
	public void cardSearch(int qCardID)
	{
		int searchCardID = qCardID;
	}
}
