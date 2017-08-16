package src.main.java;
import java.util.Random;
import java.util.Scanner;

public class GuessRandomNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Random generator = new Random();

		int secretNumber = generator.nextInt(100) + 1;
		
		System.out.println("The secret number is " + secretNumber);
		
		System.out.println("Pick a number from 1 - 100:");
		int guess;
		do {
			guess = input.nextInt();

			if (guess == secretNumber) {
				System.out.println("You guessed the right number!");
			} else {
				System.out.println("Sorry, guess again.\n");
			}

		} while (guess != secretNumber);

		input.close();
	}

}