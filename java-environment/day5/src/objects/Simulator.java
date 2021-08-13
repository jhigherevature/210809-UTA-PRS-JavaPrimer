package objects;

/*
 * The '*' is known as a wild-card indicator. When you
 * use the Wildcard you are reference every class within
 * a particular package
 */
import animals.*;
/*
 * Java will import from two locations by default.
 * 1 - Classes within the same package
 * 2 - Classes that exist within the java.lang package in
 * 		the JRE
 * 
 * When code you want to use exists outside of one
 * of these two locations, you must include an import
 * statement OR you must use the fully qualified class name
 * (FQCN) >> package.declaration.ClassName 
 * every time you reference the class or its constructors
 */
public class Simulator {
	public static void main(String[] args) {
		Dog j = new Dog();
		
		Dog d = new Dog("Brian", "Bull Dog", 2, 60.0);
//		d.populateFields("Brian", "Bull Dog", 2, 60.0);

		Dog fido = new Dog("Fido", 3);
//		fido.populateFields("Fido", "Dalmation", 3, 75.0);
		
		System.out.println(d.name);
		System.out.println(d);
		System.out.println(fido.name);
		System.out.println(fido.breed);
		System.out.println(fido.age);
		System.out.println(fido.weight);
		System.out.println(fido);
		
		Cat c = new Cat();
		Shark s = new Shark();
	}
}
