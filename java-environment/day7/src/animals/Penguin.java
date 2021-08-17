package animals;

public class Penguin extends Bird implements Swimmable {
	public Penguin(String name, int age, double weight, Tag tag) {
		super(name, age, weight, tag);
	}
	
	public void funFact() {
		System.out.println("Penguins are one of three flightless birds");
	}

	@Override
	public void eat(String food) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void layEggs() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		
	}
}
