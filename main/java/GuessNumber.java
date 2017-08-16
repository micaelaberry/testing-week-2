package src.main.java;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int secretNumber = 11;
		System.out.println("Pick a number:");

		int guess;
		do { 
			
			guess = input.nextInt();

			if (guess == secretNumber) {
				System.out.println("You guessed the right number!");
			}
			else {
				System.out.println("Sorry, guess again.\n");
			}

		} while (guess != secretNumber); //keeps asking the question to the until the answer is correct
		
		input.close();
		}

}