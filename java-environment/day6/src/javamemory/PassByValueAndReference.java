package javamemory;

/*
 * In programming languages there are two ways that variables
 * can be used to manipulate information. Either, a programming
 * language is pass-by-value, or a language can use 
 * pass-by-reference. 
 * 
 * Pass-by-value : When arguments are used for a method/function
 * 	Only the information contained within the variable
 * 	is used, not the variable itself.
 * 
 * Pass-by-reference : When arguments are used for a method/function
 * 	the variable itself can be manipulated.
 */
public class PassByValueAndReference {
	public static void main(String[] args) {
		System.out.println("Primitives:");
		int value = 5;
		System.out.println(value); // 5
		/*
		 * Primitive variables in java have a clear
		 * distinction for java as a pass-by-value language
		 * as we do not manipulate any aspects of variables
		 * that are used as arguments...
		 */
		System.out.println(changeValue(value)); // 15
		System.out.println(value); // 5 
		// To change the info stored in the variable value:
		value = changeValue(value);		
		
		/*
		 * JAVA IS A PASS-BY-VALUE LANGUAGE. IT DOES NOT
		 * USE PASS-BY-REFERENCE ALTHOUGH, OBJECTS LOOK LIKE
		 * THEY DO...
		 */
		System.out.println("Objects:");
		Data d = new Data(10);
		System.out.println(d.value); // 10
		changeData(d);
		System.out.println(d.value); // ??
		
		String word = "Hello";
		System.out.println(word.hashCode());
		System.out.println(word.hashCode());
		word = word + "s";
		System.out.println(word.hashCode());
		/*
		 * Hashing : Using an algorithm to generate a
		 * 		numerical value to represent some type
		 * 		of information.
		 * 	A "Good" Hash should:
		 * 		Produce a unique value for any given data
		 * 		Be Deterministic (if you perform a hash on the same info, you should get the same result)
		 * 		Should not be 'easy' to 'solve'
		 * 		The value produced should be the same 'length' for any number given
		 */
	}
	
	/*
	 * Variable Scope, means that we can have variables
	 * that exist in isolation from one another...
	 * 
	 * When we enter a new scope and create a variable
	 * that variable only exists within that scope.
	 */
	public static int changeValue(int value) {
		return value += 10;
	}
	
	public static Data changeData(Data d) {
		d.value = 99;
		return d;
	}
}
