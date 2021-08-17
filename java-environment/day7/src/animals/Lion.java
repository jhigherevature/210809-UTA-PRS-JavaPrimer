package animals;

public class Lion extends Animal {
	public float maneSizeInInches;
	
	public Lion(String name, int age, double weight, Tag tag, float maneSizeInInches) {
		super(name, age, weight, tag);
		this.maneSizeInInches = maneSizeInInches;
	}
	
	public void funFact() {
		System.out.println("Lions typically live in prides with females who hunt");
	}

	/*
	 * Below, we have an inherited eat method from the animal
	 * class that is being Overridden.
	 * 
	 * The '@Override' annotation that you see below is
	 * a way for you to apply 'meta-data' to your code.
	 * 
	 * Annotations (a.k.a. decorators) are used to describe
	 * some aspect of a method/class/variable/interface in
	 * your code, and apply some programatic logic to it. 
	 * Usually, annotations are used to organize your code or
	 * prevent certain mistakes
	 */
	@Override
	public void eat(String food) {
		System.out.println("Lions hunt together to catch prey");
	}
	
	public void roar() {
		System.out.println("Roar");
	}
}
