package src.main.java;

public class UserInputCalculator {

	int previousNumber;
	int currentNumber;

	char operation; // adding this so pushAdd/Minus works correctly and doesn't
					// just add it

	int pushNumbers(int number) {
		previousNumber = currentNumber; // adding this so we can use the
										// pushMinus function
		currentNumber = number;
		return currentNumber;
	}

	void pushAdd() {// adding another method from calculatorApp.java code
		operation = '+';
	}

	void pushMinus() {
		operation = '-';
	}

	void pushDivide() {
		operation = '/';

	}
	int pushEquals() {
		if (operation == '+') {
			currentNumber = currentNumber + previousNumber;
		} else {
			currentNumber = previousNumber - currentNumber;
		}
		return currentNumber;
}
}
