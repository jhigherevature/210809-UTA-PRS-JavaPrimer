package methods;

public class VarArgs {
	public static void main(String[] args) {
		int[] values = {100, 509, 580, 3243, 93};
		takeArray(values);		
//		takeArray(1,7,887,234);
		/*
		 * Varargs (variable arguments list) is a feature
		 * of java that allows you to pass an arbitrary number
		 * of arguments (0 to many) when invoking a method.
		 * Java will dynamically (during the runtime of your code)
		 * create a Array of that data
		 */
		takeVarArgs(values);
		takeVarArgs(99,43,55754,123);
		takeVarArgs();
	}
	
	public static void takeArray(int[] numbers) {
		System.out.println("takeArray Method");
		for (int i : numbers) {
			System.out.println(i);
		}
	}
	
	public static void takeVarArgs(int... variable) {
		System.out.println("takeVarArgs Method");
		for (int i : variable) {
			System.out.println(i);
		}
	}
}
