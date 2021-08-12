package methods;

public class Dog {
	public String name;
	public int age;
	public String breed;

	public void bark() {
		System.out.println("Woof Woof");
	}
	
	public void feed(String food) {
		System.out.println("You fed your dog some: " + food);
	}
	
	public void feed() {
		System.out.println("You didn't state the type of food!");
	}
}
