package arrays;

import methods.Dog;

public class ArrayBasics {
	public static void main(String args[]) {
		/*
		 * Below shows the first method of creating arrays.
		 * Using the new keyword we can declare the size
		 * of our array, but none of the contents. This creates
		 * an 'empty' array
		 */
		int[] numArray = new int[5];
		String[] strArray = new String[5];
		
		System.out.println(numArray[0]);
		System.out.println(strArray[0]);
		
		/*
		 * The second method we can use to create an array
		 * is as follows. Still using the new keyword, we can
		 * declare a new Array object, but here, we can populate/
		 * initialize, the array with values.
		 */
		int[] numArrayTwo = new int[] {11,22,33,44,55};
		
		/*
		 * We can create anonymous arrays and assign them
		 * to an array reference variable, when creating the
		 * reference variable in that same line
		 */
		int[] numArrayThree = {(int)99.99,88,77,66,55,44,33,22,11};
		
		/*
		 * Arrays use an index, which is the numerical
		 * position of elements (data inside an array)
		 * within an array that is created. Indexing
		 * for Most programming languages and entities
		 * which are indexed start at 0.
		 */
		numArrayThree = new int[] {107,202,362,499};
		System.out.println(numArrayThree[0]); // 107
		System.out.println(numArrayThree[1]); // 202
		System.out.println(numArrayThree[2]); // 362
		System.out.println(numArrayThree[3]); // 499
		numArrayThree[0] = 5;
		System.out.println(numArrayThree[0]); // 5
//		System.out.println(numArrayThree[4]); // IndexOutOfBounds
		
		/*
		 * Length is a property of Arrays that tell us
		 * how many elements an array can hold.
		 * 
		 * The max index of an array will always be one less
		 * than the length of that array
		 */
		System.out.println("ArrayLength: " + numArrayThree.length); // 4
		System.out.println("Max Index: " + (numArrayThree.length - 1));
		
		/*
		 * Hashing (and hashcode) relate to the idea that
		 * we will convert some type of information into
		 * a numerical value (based on an algorithm) and that
		 * numerical value should uniquely identify the
		 * data we converted.
		 */
//		System.out.println(numArrayThree);
//		Object o = new Object();
//		System.out.println(o);
		
		/*
		 * Parsing allows us to look at discrete aspects
		 * of some piece of information and glean important
		 * details about that data and potentially produce
		 * logic or new output based on that examination.
		 */
		String ten = "10";
		int tenn = 10;
		tenn = Integer.parseInt(ten);
		
		
		Dog[] dogs = new Dog[4];
	}
}
