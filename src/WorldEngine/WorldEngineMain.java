package WorldEngine;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class WorldEngineMain extends CardDatabase {
	
	public static void cards()
	{
		ArrayList<Card> cards = new ArrayList<Card>();
		cards.add(new Card("Test", 5, 5, 5, 1));
		cards.add(new Card("Test2", 7, 8, 7, 2));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		CardDatabase cDatabase = new CardDatabase();
		System.out.println("Welcome to the World Engine!");
		System.out.println("The Game Engine Written by: Adam Negron");
		boolean gameIsRunning = true;
		int menuChoice = -1;
		while(gameIsRunning = true)
		{
			System.out.println("Welcome to the main menu!");
			input.nextLine();
			System.out.println("1. Start Card Game");
			System.out.println("2. Card Inventory");
			System.out.println("3. Card Finder");
			System.out.println("4. Card Database Size");
			System.out.println("5. Quit");
			menuChoice = input.nextInt();
			switch(menuChoice)
			{
			case 1:
				
			break;
				
			case 2:
				
				
			break;
			
			case 3:
				cDatabase.getCard(2).toString();
				
			break;
			
			case 4:
				System.out.println(cDatabase.databaseSize());
				break;
			case 5:
				gameIsRunning = false;
			break;
			}
		}
		
	}
	
}
