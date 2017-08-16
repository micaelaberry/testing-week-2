package src.main.java;

public class PeerNames {

	public static void main(String[] args) {
		// name 4 peers next to you
		//print specific letters from each name
	
		
		String [] peerNames = {"Meaghan", "Evie", "Jamie", "Samatar"};
	
		
		//create a new char name and reference STRING peer name. peerName[0]=first name in string
		// .charAT(0) references where the character is coming from in the word; 0=first char
		char lettersFirst = peerNames[0].charAt(0);
		System.out.println("The first letter of the first peer name is " + lettersFirst);
		
		//lettersSecond is the second person in the string
		//.charAT(1) is the second character in the word
		char lettersSecond = peerNames[1].charAt(1);
		System.out.println("The second letter of the second peer name is " + lettersSecond);
		
		char lettersThird = peerNames[2].charAt(2);
		System.out.println("The third letter of the third peer name is " + lettersThird);
	}

}
