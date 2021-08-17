package animals;

/*
 * The Abstract keyword can be used with classes and methods
 * 
 * When used with a class, the abstract keyword allows you
 * to declare abstract methods within that class. AND it 
 * prevents you from using that classes constructors to 
 * create objects directly. You can only call the constructor 
 * from a child class.
 */
public abstract class Animal {
	public String name;
	public Tag tag;
	public int age;
	public double weight;
	
	public abstract void funFact();
	
	public abstract void eat(String food);
	
	public void setTag(Tag tag) {
		this.tag = tag;
	}
	
	public Animal(String name, int age, double weight, Tag tag) {
		System.out.println("Parameterized Animal Constructor Called");
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.tag = tag;
	}
}
