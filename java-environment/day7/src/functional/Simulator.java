package functional;

public class Simulator {
	public static void main(String[] args) {
		HelloWorldInterface hwi = new HelloWorldClass();
		hwi.sayHello();
		
		HelloWorldInterface throwAway = () -> {
			System.out.println("Hello World - Lambda!");
		};
		throwAway.sayHello();
		
		PrintInputInterface pi = (String input) -> {
			System.out.println("Your input was: " + input);
		};
		pi.printInput("Revature!");
		
		PrintInputInterface piTwo = (input) -> {
			System.out.println("PiTwo : your input: " + input);
		};
		piTwo.printInput("Joseph");
	}
}
