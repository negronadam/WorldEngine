package WorldEngine;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class WorldEngineMain {

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
			System.out.println("4. Quit");
			menuChoice = input.nextInt();
			switch(menuChoice)
			{
			case 1:
				
			break;
				
			case 2:
				
				for(int a = 0; a < cDatabase.databaseSize(); a++)
				{
					System.out.println(cDatabase.toString());
				}
				
			break;
			
			case 3:
				
			break;
			
			case 4:
				gameIsRunning = false;
			break;
			}
		}
		
	}
	
}
