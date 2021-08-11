/*
 * The package declaration should be the first line
 * of every java class file (aside from potential code
 * comments).
 * 
 * The package declaration informs your java program
 * where the information for the classes exist in relation
 * to one another. This will be crucial for managing importing
 * data between classes
 */
package basics;

public class PrimitiveTypes {
	public static void main(String[] args) {
		/*
		 * When reaching the limit of a primitive datatypes
		 * container, and casting, we observe a subset of 
		 * binary digits to determine values
		 */
		byte b = (byte)1000;
		System.out.println(b);
		short s = 110;
		System.out.println(s);
		int i = 2000000;
		System.out.println(i);
		// The letter 'L' is required to represent longs
		// a lowercase 'L' looks like the number 1 and an
		// uppercase I, so typically you use a capital L
		long l = 20_000_000_000L;
		
		/*
		 * Though the following work, these are 
		 * obviously poor conventions when displaying
		 * numbers
		 */
		double bad = 10________000.0_0;
		double worse = 1_0_0_0_0.0_0;
		
		System.out.println(l);
		
		// The letter 'F' is required to represent floats
		float f = 3.14F;
		double d = 3.14;
		
		char c = 'C';
		
		boolean boolT = true;
		boolean boolF = false;
		
		int value = 1000; 
		// implicit upcasting...
		long bigger = value;
		
		// explicit downcasting...
		int smaller = (int)bigger;
	}
}
