package src.main.java;
import java.util.Scanner;

public class UserInputPeerName {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter First Name");
		
		//second way of writing an array. You MUST put new and fill how many are in the array
		String [] peerNames = new String [2]; 
		peerNames [0] = input.next();
		
		char lettersFirst = peerNames[0].charAt(0);
		System.out.println("The first letter of the peer name is " + lettersFirst);
		
		System.out.println("\nEnter second Name");
		peerNames [0] = input.next();
		
		char lettersSecond = peerNames[0].charAt(1);
		System.out.println("The second letter of the peer name is " + lettersSecond); 
		
		input.close();
	}

}

