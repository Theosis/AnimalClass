
/*
 * This is the parent class. Also called the super class
 */
public class Animal {
	
	public String animalType = "animal";
	
	public Animal() {
		
//		System.out.println("A new animal has been created!");
	}
	public String sleep() {
		return ("The  " + animalType + " sleeps...");
	}
	public String eat() {
		return ("The " + animalType + " eats...");
	}
	public String breathe() {
		return ("The " + animalType + " breathes.");
	}
	
}

