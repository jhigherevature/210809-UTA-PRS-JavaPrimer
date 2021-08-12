package methods;

public class Simulator {
	public static void main(String[] args) {
		Dog fido = new Dog();
		fido.bark();
		fido.feed();
		fido.feed("Juicy Steak");
		fido.name = "Fido";
		fido.breed = "Golden Retriever";
		fido.age = 3;
		
		Dog scooby = new Dog();
		scooby.name = "Scooby";
		scooby.age = 7;
		scooby.breed = "Great Dane";
	}
}
