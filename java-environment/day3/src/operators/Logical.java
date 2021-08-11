package operators;

public class Logical {
	public static void main(String[] args) {
		/*
		 * Logical AND and Logical OR operators
		 * are used to compare two boolean expressions
		 * and return a single boolean expression based
		 * on those operand values
		 */
//		System.out.println(true & true); // true
//		System.out.println(true & false); // false
//		System.out.println(false & true); // false
//		System.out.println(false & false); // false
//		
//		System.out.println(true | true); // true
//		System.out.println(true | false); // true
//		System.out.println(false | true); // true
//		System.out.println(false | false); // false
		System.out.println("Normal 'AND'");
		System.out.println(printThenReturnFalse() & printThenReturnTrue());
		System.out.println("Shortcut 'AND'");
		System.out.println(printThenReturnFalse() && printThenReturnTrue());

		System.out.println("Normal 'OR'");
		System.out.println(printThenReturnTrue() | printThenReturnFalse());
		System.out.println("Shortcut 'OR'");
		System.out.println(printThenReturnTrue() || printThenReturnFalse());
	}
	
	public static boolean printThenReturnTrue() {
		System.out.println("This Returns True");
		return true;
	}
	
	public static boolean printThenReturnFalse() {
		System.out.println("This Returns False");
		return false;
	}
}
