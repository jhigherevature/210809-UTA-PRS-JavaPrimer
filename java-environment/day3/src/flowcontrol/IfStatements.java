package flowcontrol;

/*
 * Flow Control statements (as their name implies) are
 * statements which allow you to control the execution
 * flow (the order and specific lines you want to execute)
 * in your program.
 * 
 * The most basic flow control statement is an if/else
 * statement. This allows you to make a binary decision
 * on whether you want some line(s) of code to execute
 */
public class IfStatements {
	public static void main(String[] args) {
		int i = 10;
		if (i < 10) {
			System.out.println("Will not run!");
			System.out.println("This should Not run either!");
		}
		
		if (i <= 10) {
			System.out.println("I is less than or equal to 10");
		} else { 
			System.out.println("i is greater than 10");
		}
		
		/*
		 * if and else-if statement block are mutually
		 * exclusive. This means that only one of the
		 * if-statement conditions will result in the
		 * execution of code... This is important to
		 * keep in mind when creating programming logic!
		 * 
		 * If a more general condition, appears before a
		 * more specific one, then you might run into a
		 * bug in your logic!
		 */
		if (i > 0) {
			System.out.println("i is greater than 0");
		} else if (i < 5) {
			System.out.println("i is 5 or lower");
		} else if (i < 10) {
			System.out.println("i is 10 or lower");
		} else if (i < 15) {
			System.out.println("i is 15 or lower");
		} else {
			
		}
		
		int age = 15;
		boolean withParent = true;
		if (age >= 18) {
			System.out.println("You can play rated M games");
		} else if (age >= 13) {
			if (withParent) {
				System.out.println("You can play rated M games");
			} else {
				System.out.println("You can play rated T games");
			}
		} else if (age >= 10) {
			if (withParent) {
				System.out.println("You can play rated T games");
			} else {
				System.out.println("You can play E games");
			}
		}
	}
}
