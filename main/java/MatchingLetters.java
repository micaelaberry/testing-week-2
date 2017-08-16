package src.main.java;
import java.util.Scanner;

public class MatchingLetters {

	public static void main(String[] args) {
		// see if the word the user inputs has a letter that matches
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a word:");
		String userWord = input.nextLine();
		userWord = userWord.toLowerCase();
		
		System.out.println("Enter a letter:");
		String userLetter = input.nextLine();
		userLetter = userLetter.toLowerCase();

	//	char [] userletterInputAsChars = userLetterInput.toCharArry();
	//	char userletter = userLetterInputAsChar[0];
		
		String userMatch = "yes or no";

		if (userWord.contains(userLetter)) {
			userMatch = ("Yep, it's got one of those.");
		}

		else {
			userMatch = ("So sorry.");

		}
		System.out.println(userMatch);
		
		input.close();
	}

}
