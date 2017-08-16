package src.main.java;
import java.util.Scanner;

public class PrintNameFiveTimes {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your message:");
		String message = input.nextLine();

		int count = 1;
		while (count <= 5) {
			count++; // always add this to make sure you don't break eclipse 
					// add ++ to count in While bracket if you want one less line of code
			System.out.println(message);
		}
		input.close();
	}

}
