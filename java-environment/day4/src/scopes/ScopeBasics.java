package scopes;

/*
 * Scopes indicate isolated levels in our program
 * which dictate where and for how long we have access
 * to certain variables.
 * 
 * Variables which are created within a particular scope
 * are lost, the moment we leave the context of that scope.
 * 
 * There are 4 levels of scope:
 * Static/Class - variables which will exist throughout
 * 		the entire lifetime of our program.
 * Instance/Object - variables which exist so long as we
 * 		have created an object and that object is accessible
 * 		through a reference variable pointing to that object
 * **Instance and Class scopes variables share the same pool
 * 		of variable names
 * 
 * Method - variables which are created within a method
 * 		and are lost once we exit the context/body of that
 * 		method. This includes a method's parameters
 * Block - variables which are created within flow control
 * 		statements within a method. Note that flow control
 * 		statements must be used within the body of a method!
 * ** Method and Block variables share the same pool of variable
 * 		names
 */
public class ScopeBasics {
	public static String stcWord;
	public String objWord;
	
	public int number;
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void nonStaticMethod(String mtdWord) {
		/*
		 * Variable shadowing prevents variables at a
		 * class/instance scope from being viewed, when you
		 * create a variable with the same name inside of
		 * a method.
		 */
		number = 0;
		
		/*
		 * The 'this' keyword can be used to distinguish
		 * between method scope and instance scope variables
		 * by examining the variables that exist at the
		 * object level
		 */
		this.number = 100;
		
		mtdWord = "Changed within method";
		
		if (true) {
			String blockWord = "Within If-Statement";
			System.out.println(blockWord);
		}
//		System.out.println(blockWord); // out of scope
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);	
		}
//		System.out.println(i); // out of scope
	}
	
	public static void main(String[] args) {
		String mainMethodWord = "Main Method Word";
		ScopeBasics sb = new ScopeBasics();
		sb.nonStaticMethod("Argument");
	}
}
