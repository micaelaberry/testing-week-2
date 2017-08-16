package src.main.java;

public class Dog {
	String name; //we create a new class with string or int etc. info so we don't have to 
				// write it in the code from the DogAppOOP aka where object oriented programming
	
	int numberOfLegs=4; // you can set a default value here unless you assign it in the 
						//separate class. Then it takes the assigned value in the other class
	
	void rename(String newName) { //use void because it doesn't have a return/response back
		// could have done this: name = newName;
		name = newName;
		} //void closing block
	
	void speak()  {
		bark();
		System.out.println("My name is " + name); // name is same as this.name
	}
	
	void bark() {
		System.out.println("wooooooof"); 
	}
	
}
