
public class Cow extends Animal {

	public Cow()  {
		animalType = "cow";
		//System.out.println("A cow was born...");
	}
	
/*	
	@Override
	public String eat() {
		return "A cow eats grass...";
	}
	*/
	
	public String moo() {
		return "The cow  moos...";
	}
	
	public String drink() {
		return "The cow drinks a lot of water...";
	}

}
