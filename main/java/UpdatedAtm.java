package src.main.java;
import java.util.Scanner;

public class UpdatedAtm {

	public static void main(String[] args) {
		// prompt user for PIN number
		// display error message if wrong and prompt user to try again
		// if they get it right print a congrats message

		Scanner input = new Scanner(System.in);
		String userPin = "9876";

		String guess;
		int failCount = 0;

		do {

			System.out.println("Enter your PIN:");
			guess = input.nextLine();

			if (!guess.equals(userPin)) {
				System.out.println("Sorry, Wrong");
				failCount = failCount + 1;
			}
			if (failCount == 3) {
				System.out.println("Too many attempts");
				// System.exit(0);
				break;
			}
		} while (!guess.equals(userPin));

		if (guess.equals(userPin)) {

			System.out.println("Congrats!");
		}

		input.close();

	}
}
