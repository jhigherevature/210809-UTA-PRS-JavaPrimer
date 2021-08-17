package animals;

public class Platypus extends Animal {
	
	public Platypus(String name, int age, double weight, Tag tag) {
		super(name, age, weight, tag);
		System.out.println("Platypus Constructor Called");
	}
	
	public void envenmon() {
		System.out.println("Male Platypus have a poisonous barb, watch out!");
	}
	
	public void funFact () {
		System.out.println("Platypi are Joseph's favorite animal");
	}
	public void eat(String food) {
		System.out.println("Did you know platypi are carnivorous?");
	}
}
