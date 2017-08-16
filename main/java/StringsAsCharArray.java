package src.main.java;

public class StringsAsCharArray {

	public static void main(String[] args) {

		String myName = "Harry";
		char[] letters = myName.toCharArray();
	

		System.out.println("The first letter of the boy's name is " + letters[0]);
		
		int lengthOfString = myName.length();
		// the top int is the same as the one below this comment
		int lastIndex = letters.length - 1;
		
		System.out.println("The last letter of the boy's name is " + letters[lastIndex]);

	}

}
