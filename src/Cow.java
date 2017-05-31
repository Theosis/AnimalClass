
public class Cow extends Animal {
	
	public Cow()  {
		System.out.println("A cow was born...");
	}
	
	@Override
	public String eat() {
		return "A cow eats grass...";
	}
	
	public String moo() {
		return "A cow moos...";
	}
	
	public String drink() {
		return "A cow drinks a lot of water...";
	}

}
