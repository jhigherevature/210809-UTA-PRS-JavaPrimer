package operators;

public class Assignment {
	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		x += y;
		// x = x + y;
		System.out.println(x); // 15
		
		System.out.println(x = 3); // 3
		
		boolean bool = false;
		/*
		 * Be careful when using the assignment operator and
		 * comparisons with booleans. A single equals sign is
		 * for changing the value of variables... Below we are
		 * NOT comparing the current boolean value of the variable
		 * 'bool' with the boolean false, we are changing the
		 * value of bool to false
		 */
		if (bool = false) {
			System.out.println("The boolean was true");
		}
	}
}
