package WorldEngine;
import java.util.Random;
public class CardClass {
	Random generator = new Random();
	private int cardID;
	private int cardNumbers;
	private double cardHP;
	private double cardMP;
	private String cardName;
	public CardClass()
	{
		cardID = 0;
		
	}
	
	public CardClass(String xCardName,int xCardID, double xCardHP, double xCardMP, int xCardNumbers)
	{
		xCardName = cardName;
		xCardID = cardID;
		xCardHP = cardHP;
		xCardMP = cardMP;
		xCardNumbers = cardNumbers;
	}
	
	public void getCard (int cardNumber)
	{
		
	}
	
	
}
