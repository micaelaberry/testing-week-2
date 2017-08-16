package src.main.java;
import java.util.Scanner;

public class random {

	public static void main(String[] args) {

		
		Scanner input = new Scanner(System.in);	
		{
			int sum = 0;
			System.out.println("Enter a number to find the sum of it:");
			int number = input.nextInt();
			
			for(int i = 1;i <= number;i++)
			{
				sum = sum + i;
			}
			System.out.println("The sum of "+ number +" numbers are: " + sum);
		}
	} 
}



