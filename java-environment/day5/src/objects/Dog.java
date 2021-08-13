package objects;

public class Dog {
	public String name;
	public String breed;
	public int age;
	public double weight;
	
	public void bark() {
		System.out.println("Woof Woof");
	}
	
	/*
	 * Constructors are special methods* (technically they
	 * are subroutines), that are called as the first
	 * action when creating a new object. Constructors have
	 * a few noticable differences between normal methods.
	 * 1 - The constructor's name must match the name of the
	 * class exactly.
	 * 2 - Constructors do not return any information (you dont
	 * need to declare any return type).
	 * 
	 */
	
	/*
	 * Syntax for a 'default' (no-args) constructor is below
	 * 
	 * Java will provide you with a default constructor if you
	 * DO NOT provide a constructor of your own. If you create
	 * a custom constructor, the default constructor is not
	 * provided to you.
	 */
	 public Dog() {
		 this("No Name", "No Breed", 0, 0.0);
	 }
	
	// Syntax for a 'parameterized' constructor
	public Dog(String name, String breed, int age, double weight) {
		System.out.println("Dog constructor was called!");
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.weight = weight;
		// Increase the Count for Dogs created
		// Log that information and write to a file
		// Call DB
	}
	
	public Dog(String name, int age) {
		this(name, "No Breed", age, 0.0);
	}
	
	/*
	 * This populate Fields method is for demonstration purposes
	 * The logic contained here is better suited for a constructor
	 * such as the parameterized constructor created above!
	 */
	public void populateFields(String name, String breed, int age, double weight) {
		System.out.println("Populating Fields on Dog");
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.weight = weight;
	}
}
