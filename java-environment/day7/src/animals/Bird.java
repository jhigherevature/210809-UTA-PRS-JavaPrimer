package animals;

public abstract class Bird extends Animal {
	public Bird(String name, int age, double weight, Tag tag) {
		super(name, age, weight, tag);
	}
	
	public abstract void layEggs();
}
