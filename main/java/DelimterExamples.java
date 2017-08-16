package src.main.java;

public class DelimterExamples {

	public static void main(String[] args) {
		
		String hobbits = "Frodo, Sam, Merry, Pippin";
        String[] names = hobbits.split(", ");

        //Below is the shorter way of writing the code using a FOR loop
        System.out.println("Names of Hobbits:");
        for (String name: names) {
        	System.out.println(name);
        }
        
   //     System.out.println(names[0]); 
   //     System.out.println(names[1]); 
   //     System.out.println(names[2]); 
   //     System.out.println(names[3]);
	}

}
