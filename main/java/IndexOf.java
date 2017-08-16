package src.main.java;

public class IndexOf {

	public static void main(String[] args) {
	
		String source = "foo";
		
		int firstIndexOfO = source.indexOf('o');
		
		System.out.println("The first index of \'o\' is " + firstIndexOfO);
		
		int nextIndexOfO = source.indexOf( 'o', firstIndexOfO + 1);
		
		System.out.println("The next index of \'o\' is " + nextIndexOfO);

	}

}
