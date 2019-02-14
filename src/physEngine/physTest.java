package physEngine;
import java.util.Scanner;
public class physTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		physicsEngine physEngine = new physicsEngine();
		Scanner input = new Scanner(System.in);
		int menuChoice = -999;
		boolean programIsRunning = true;
		System.out.println("Hi! Welcome to Adam Negron's Physics Simulator v0.0.1!");
		System.out.println("This program is still under development and as such will not be super stable");
		while(programIsRunning == true)
		{
			
			System.out.println("What would you like to calculate today?");
			System.out.println("1. How far forward will an object move? (Displacement)");
			System.out.println("2. How fast will an object speed up? (Acceleration)");
			System.out.println("3. How fast did an object go? (Velocity)");
			menuChoice = input.nextInt();
			switch(menuChoice)
				{
					case 1:
						System.out.println("Please enter the final position of the object");
						double finalPos = input.nextDouble();
						System.out.println("Please enter the initial position of the object");
						double initialPos = input.nextDouble();
						physEngine.displacementChangeCalc(finalPos, initialPos);
						System.out.println("The final position you entered is: " + finalPos + " and the initial position you entered is: " + initialPos);
						System.out.println("Is this correct?");
						boolean correct = input.nextBoolean();
						if(correct == true)
						{
							
						}
						else
						{
							System.out.println("Please enter the final position of the object");
							double newFinalPos = input.nextDouble();
							System.out.println("Please enter the initial position of the object");
							double newInitialPos = input.nextDouble();
							physEngine.displacementChangeCalc(newFinalPos, newInitialPos);
							System.out.println("The final position you entered is: " + finalPos + " and the initial position you entered is: " + initialPos);
						}
					break;
					
					case 2:
						
					break;
					
					case 3:
						
					break;
				}
		}
	}

}
