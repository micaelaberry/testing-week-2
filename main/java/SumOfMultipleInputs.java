package src.main.java;

import java.util.Scanner;

public class SumOfMultipleInputs {
	public static void main(String[] args) {
		// have user input 2 integers
		// calculate the sum of the numbers the user inputed 
		// 4 + 5 + 6 = 15

		Scanner input = new Scanner(System.in);
		int sumOfInt = 0;
		int startingValue = 0;

		System.out.println("Please enter a lower integer to figure out the sum of it:");
		int userIntOne = input.nextInt();
		
		startingValue = userIntOne; 
		
		System.out.println("Please enter a higher integer to figure out the sum of it:");
		int userIntTwo = input.nextInt();

		while (startingValue < userIntTwo) {
			sumOfInt = userIntOne + userIntTwo + startingValue++;  // startingValue +1 since it starts o
			
		}
		System.out.println("The sum of " + userIntOne + " and " 
		+ userIntTwo + " numbers are: " + sumOfInt);
	
	input.close();
}
}