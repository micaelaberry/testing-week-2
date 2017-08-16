package src.main.java;
import java.util.Scanner;

public class ATMPrompt {

	public static void main(String[] args) {
		// prompt user for PIN number
		// display error message if wrong and prompt user to try again
		// if they get it right print a congrats message

		Scanner input = new Scanner(System.in);
		int correctPIN = 9876;


		int pinGuess;
		int numberOfAttempts = 0;

		do {		
			System.out.println("Please enter your four digit PIN number:");
			pinGuess = input.nextInt();

			if (correctPIN == pinGuess)
				System.out.println("That is correct!");

			if  (correctPIN != pinGuess) 
				System.out.println("Sorry, guess again.\n");
				
		} while (pinGuess != correctPIN && numberOfAttempts < 3);

		numberOfAttempts++;
		if (pinGuess == numberOfAttempts) {

			System.out.println("Too many incorrect attempts");
		}
		
		input.close();

	}
}
