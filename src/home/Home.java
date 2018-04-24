package home;

import java.util.Scanner;

public class Home { // open the Home class

	public static void main(String[] args) { // open the main method
		// defining a scanner object
		Scanner input = new Scanner(System.in);
		
		// create a new Dog object
		Dog myDog = new Dog();
		
		// variables for the myDog object
		String name = myDog.getName();
		
		// other variables
		String sound = "";
		
		try {
			// print the name of the myDog object
			System.out.println("A day in the life of my dog: " + name);
			
			// testing all of the methods, while the dog is awake
			myDog.wakeUp();
			myDog.feed();
			myDog.hear("ding-dong");
			myDog.hear("ding-dong");
			myDog.hear(name);
			myDog.hear("ding-dong");
			myDog.hear("ding-dong");
			myDog.feed();
			myDog.feed();
			
			// testing the methods, while the dog is asleep
			System.out.println("\nNight-Time...");
			myDog.sleep();
			myDog.feed();
			myDog.hear("ding-dong");
			myDog.wakeUp();
			
			// testing the 'reset', upon a new day
			System.out.println("\nAnother day...");
			myDog.hear("ding-dong");
			myDog.feed();
			myDog.feed();
			myDog.feed();
			
			// user sounds
			System.out.println("Available sounds: dog's name, ding-dong, bark");
			System.out.print("Sound: ");
			sound = input.nextLine();
			
			myDog.hear(sound);
		} finally{
			input.close();
		}
	} // close the main method

} // close the Home class
