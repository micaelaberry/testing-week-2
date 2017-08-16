package src.main.java;

public class EvenOrOdd {

	public static void main(String[] args) {
		
		// writeLine(); works like system.out.println
		System.out.println("Message for 42: " + chooseMessage(42));
		System.out.println("Message for 23: " + chooseMessage(23));
		
		
		writeLine("did another one");
	}

	private static void writeLine(String string) {
		// TODO Auto-generated method stub
		
	}

	public static String chooseMessage(int input) {
		if (input % 2 == 0) {
			return "Even Steven!";
		}
		return "You're odd!";
	}

}
