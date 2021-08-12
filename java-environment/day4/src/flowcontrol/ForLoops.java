package flowcontrol;

public class ForLoops {
	/*
	 * For loops are the most common looping structure
	 * to use when you want to perform actions utilizing
	 * some type of data structure.
	 * 
	 * For Loop Syntax:
	 * for (initilization; condition; modification) {
	 * }
	 * initialization : A statement that will execute one
	 * 		time BEFORE our for loop runs
	 * condition : A boolean statement that will determine
	 * 		whether or not we will repeat execution of
	 * 		our loop. This is evaluated at the start of
	 * 		each looping cycle. By default, the condition
	 * 		is treated as 'true'.
	 * modification : A statement that will execute at the
	 * 		end of each of our looping cycles. Typically
	 * 		this statement will change a variable that is
	 * 		created during the initialization step
	 */
	public static void main(String[] args) {
		System.out.println("BEGINNING OF APPLICATION");
		for (int x = 0; x < 10; x = x + 1) {
			System.out.println(x);
		}
		
		int[] numbers = new int[] {55,66,33,77,88};
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println("NORMAL FOR-LOOP:");
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		/*
		 * Enhanced for-loop uses a slightly different
		 * syntax to a normal for-loop. Instead of an
		 * initialization, condition and modification
		 * we instead declare a variable whose datatype
		 * matches the collection, and then we state
		 * the collection itself after a colon.
		 */
		System.out.println("ENHANCED FOR-LOOP:");
		for (int n : numbers) {
			System.out.println(n);
		}
		
		System.out.println(numbers);
		
		int[][] twoDee = new int[][] {{1,2,3},{4,5,6}};
		for (int[] tD : twoDee) {
			for (int t : tD) {
				System.out.println(t);
			}
		}
		
//		for ( ; ; ) {
//			System.out.println("Infinite!");
//		}
		
		System.out.println("END OF APPLICATION");
	}
}
