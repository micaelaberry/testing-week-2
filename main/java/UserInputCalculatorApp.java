package src.main.java;
import java.util.Scanner;

public class UserInputCalculatorApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		UserInputCalculator myCalc = new UserInputCalculator();
		newDisplayValue ();
		updateDisplay(0);
		String currentNumber;

		System.out.println("Enter first number to find sum");
		 String userNumber1 = input.nextLine();

		myCalc.pushAdd();
		
		System.out.println("Enter second number to find sum");
		String userNumber2 = input.next();
		

	//	String pushEquals = (currentNumber);
//		System.out.println("The sum is: " + pushEquals);
		
	

	} // main method closing bracket


	private static void newDisplayValue() {
		
	}

	public static void updateDisplay(int value) {
		System.out.println(value);
	}
}
