package methods;

public class MethodBasics {
	public static void main(String[] args) {
		/*
		 * Parameter - The placeholder variables that are
		 * 		declared and used when defining a method
		 * Argument - The information that you supply to
		 * 		a method when you are invoking it. The
		 * 		Argument should match the datatype of the
		 * 		parameter
		 */
		int sum = addFiveToInteger(20);
		System.out.println(sum); // 25
		
		for (int i = 0; i < 10; i++) {
			addFiveToInteger(i);
		}
	}
	
	public static void printMessage() {
		System.out.println("This is my message!");
	}
	
	public static boolean returnsBoolean() {
		return true;
	}
	
	public static int addFiveToInteger(int input) {
		return input + 5;
	}
}
