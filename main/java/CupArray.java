package src.main.java;

public class CupArray {

	public static void main(String[] args) {
		
		//declaration and creation
		int[] cupValues = new int[5];
		
		//assigning values
		cupValues[0] = 42;
		cupValues[1] = 86;
		cupValues[2] = 23;
		cupValues[3] = 8;
		cupValues[4] = 91;
		
		//getting values
		System.out.println(cupValues[0]); // prints "42"
		System.out.println(cupValues[1]); // prints "86"
		System.out.println(cupValues[2]); // prints "23"
		System.out.println(cupValues[3]); // prints "8"
		System.out.println(cupValues[4]); // prints "91"

		
		//change value for index 2
		System.out.println("Changing Cup Value 2");
		cupValues[2] = 82;
		System.out.println(cupValues[2]);
		
		// finding length of array
		System.out.println("The length of my array is " + cupValues.length);
	}

}
