package home;

public class Dog { // open the Dog class
	// define Class Level variables
	private int numTimesFed = 0; // private integer   value = number of times fed
	private boolean sleeping = false; // private boolean   value = state of sleep
	private String name = "Casey"; // private string   value = dog name
	
	public String getName() {
		return name;
	}
	
	public void wakeUp() {
		System.out.println("WAKEING UP");
		System.out.println("");
		
		sleeping = false;
		numTimesFed = 0;
	}
	
	public void sleep() {
		sleeping = true;
		
		System.out.println("SLEEPING");
		System.out.println("");
	}
	
	public void hear(String sound) {
		if (sleeping == true) {
			return;
		}
		
		if (sound.equals(name)) {
			System.out.println("WAG TAIL");
			System.out.println("");
		} else if (sound.equals("ding-dong")) {
			System.out.println("BARK!!");
			System.out.println("");
		} else if (sound.equals("bark")) {
			System.out.println("BARK BARK BARK BARK");
			System.out.println("");
		} else {
			return;
		}
	}
	
	public void feed() {
		if (sleeping == true) {
			return;
		}
		
		numTimesFed +=1;
		
		if (numTimesFed > 2) {
			System.out.println("YAWN");
			System.out.println("");
		} else {
			System.out.println("YUMMY");
			System.out.println("");
		}
	}
} // close the Dog class
