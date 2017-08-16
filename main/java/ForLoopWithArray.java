package src.main.java;

public class ForLoopWithArray {

	public static void main(String[] args) {

		String[] roygbivColors = { "Red", "Orange", "Yellow", "Green" };

		for (int index = 0; index < roygbivColors.length; index++) {
			System.out.println("The index is " + index);
			System.out.println("The color is " + roygbivColors[index]);
			// index inside roygbivColors[] shows all the string content
		}

		System.out.println("With an exhanced for (for each)");
		// if i only need to do something with every element in my array
		// enhanced for
		for (String colors : roygbivColors) {
			System.out.println("The color is " + colors);
		}

		char[] alphabet = { 'a', 'b', 'c' };
		for (char letter : alphabet) {
			System.out.println(letter);
		}
	
	}
}