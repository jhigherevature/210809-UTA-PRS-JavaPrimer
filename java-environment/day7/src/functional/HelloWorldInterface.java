package functional;

/*
 * A Functional Interface is an interface that only has
 * a single abstract method!
 */
@FunctionalInterface
public interface HelloWorldInterface {
	public void sayHello();
	
	/*
	 * How do you implement a method body in an
	 * interface?...
	 * 
	 * Not to be confused with the 'default' keyword of
	 * switch statement (or the 'default level of access' for
	 * access modifiers). The 'default keyword in interfaces
	 * allows you to define a method body in an interface.
	 * 
	 * NOTE: The default keyword is typically not used very 
	 * often, as it is a bit counter to how we typically use
	 * interfaces to begin with
	 */
	public default void sayGoodbye() { 
		System.out.println("Good Bye!");
	}
}
