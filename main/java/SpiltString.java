package src.main.java;

public class SpiltString {

	public static void main(String[] args) {
		
		String source = "this, that, the other";
		String[] elements = source.split(", ");

		System.out.println(elements[0]); // prints "this"
		System.out.println(elements[1]); // prints "that"
		System.out.println(elements[2]); // prints "the other"

		System.out.println("\nSplitting on \'t\'.");
		String [] splitOnT = source.split("t");
		
		System.out.println("Number of elements " + splitOnT.length);
		
		for(int index = 0; index < splitOnT.length; index++) {
			System.out.println("Elements at index " + index + ": |" +splitOnT[index] + " |");
		}
	}
}