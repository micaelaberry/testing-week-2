package src.main.java;

public class CountLoop {

	public static void main(String[] args) {
		
		int count = 1;
		while (count < 11) {
			System.out.println("The count is " + count);
		count++; // remember, this increases the value of count by 1
		}
		
		System.out.println("\nWith do/while");
		count = 1;
		do {
			System.out.println("The count is " + count);
			count++;
			
		} while (count <11);
		}
		
	}


