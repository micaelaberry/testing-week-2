package src.main.java;
import java.util.Scanner;

public class AddIntegerLoop {

	public static void main(String[] args) {
		// have user input an integer
		// calculate the sum of the numbers the user inputed (ex: entered 6 so
		// 1+2+3+4+5+6 = 21

		Scanner input = new Scanner(System.in);
		int sumOfInt = 0; 
		int startingValue = 0;
		
		System.out.println("Please enter an integer to figure out the sum of it:");
		int userInt = input.nextInt();
		
		while (startingValue <= userInt) {
			sumOfInt = sumOfInt + startingValue++; //startingValue +1 since it starts at zero
		}
			System.out.println("The sum of "+ userInt +" numbers are: " + sumOfInt);	
		}

	}