package src.main.java;
import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		Calculator myCalc = new Calculator();
		updateDisplay(0);

		int newDisplayValue = myCalc.pushNumbers(42);
		updateDisplay(newDisplayValue);
	
		
		myCalc.pushAdd();
		
		newDisplayValue = myCalc.pushNumbers(44);
		updateDisplay(newDisplayValue);
		
		newDisplayValue = myCalc.pushEquals();
		updateDisplay(newDisplayValue);
		
		myCalc.pushMinus();
		
		newDisplayValue = myCalc.pushNumbers(63);
		updateDisplay(newDisplayValue);
		
		newDisplayValue = myCalc.pushEquals();
		updateDisplay(newDisplayValue);
		
		
		
	} //main method closing bracket

	public static void updateDisplay(int value) {
		System.out.println(value);
	}
}
