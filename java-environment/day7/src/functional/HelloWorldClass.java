package functional;

public class HelloWorldClass implements HelloWorldInterface {

	@Override
	public void sayHello() {
		System.out.println("Hello World - From Class!");
	}
}
