package wrappers;

public class WrapperSimulator {
	public static void main(String[] args) {
		// int num = null;
		Integer num = null;
		
		/*
		 * Autoboxing : java will implicitly convert
		 * 		a primitive to a wrapper class representation
		 * 
		 * Unboxing : java will implicitly convert a wrapper
		 * 		to a primitive representation
		 */
		// Autoboxing
		int i = 9;
		Integer nine = i;
		System.out.println(i);	// 9
		System.out.println(nine); // 9
		
		// Unboxing
		Integer ten = 10;
		int j = ten;
	}
}
