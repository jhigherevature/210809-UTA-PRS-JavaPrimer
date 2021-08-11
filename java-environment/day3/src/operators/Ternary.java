package operators;

public class Ternary {
	public static void main(String[] args) {
		/*
		 * A Ternary operator is similar to and if-else
		 * statement, in that it is powered by a boolean
		 * condition, however, operators (including the
		 * ternary) return data!. The ternary allows you
		 * to determine two different expressions that can
		 * be returned based on some logic in your code.
		 * 
		 * Syntax for Ternay:
		 * 
		 * condition ? expr_returned_if_true : expr_returned_if_false 
		 */
		int a = (true ? 10 : 99); // assign 10 to a
		int b = (false ? 10 : 99); // assign 99 to b
		
		String s = (a > b) ? ("A is greater") : ("B is greater");
		
		int c = (a > b) ? (a * 25) : (b % a);
		
		Data dOne = new Data();
		Data dTwo = new Data();
		Data dThree = (a < b) ? dOne : dTwo;
		
		boolean isSuspended = false;
		String message = isSuspended ? "Your account has been suspended, please contact the admin" : "Welcome to the system";
		
		/*
		 * Ternarys return data! keep this in mind
		 */
//		int j = true ? System.out.println("Hello") : System.out.println("Goodbye");
//		int z = 10 + System.out.println("Hello");
		
		if (isSuspended) {
			System.out.println("Your account has been suspended, please contact the admin");
		} else {
			System.out.println("Welcome to the system");
		}
	}
}
