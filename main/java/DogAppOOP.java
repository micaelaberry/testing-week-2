package src.main.java;
import java.util.Scanner;

public class DogAppOOP {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Dog fido = new Dog();
		writeLine("My dog is " + fido);

		fido.name = "Fido"; // always write name(fido) and give it a value(name)
							// before asking for it's value
		writeLine("Its name is " + fido.name);

		writeLine(fido.name + " has " + fido.numberOfLegs + " legs");

		fido.numberOfLegs = 3;
		writeLine(fido.name + " has " + fido.numberOfLegs + " legs");

		// Fido runs away and ends up in a shelter
		// Fido gets adopted and gets a new name

		fido.rename("Hope");
		writeLine("Its name is now " + fido.name);

		writeLine("Bark, Hope!");
		fido.speak();

		fido.bark();

		Dog myOtherDog = new Dog(); // constructor method ---> Dog()
		myOtherDog.name = "Krusty";

		writeLine("My other dog's name is " + myOtherDog.name);
		myOtherDog.speak();

		writeLine("You come home. You dogs act if you've been gone");
		Dog[] myDogs = { fido, myOtherDog }; // tell all the dogs to bark

		for (Dog currentDog : myDogs) {
			// could have done: for(int index = 0;index < mydogs.length; index++){

			currentDog.bark();

		}

	} // closing bracket for main

	public static void writeLine(String message) { // void= not returning anything
													
		System.out.println(message);
	}
}
