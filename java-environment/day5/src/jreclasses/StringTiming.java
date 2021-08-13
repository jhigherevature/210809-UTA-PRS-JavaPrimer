package jreclasses;

public class StringTiming {
	public static int n = 350_000;
	
	public static void main(String[] args) {
		System.out.println("START OF APPLICATION");
//		StringBuilder sb = new StringBuilder("Hello");
//		System.out.println(sb);
//		sb.append(" World");
//		System.out.println(sb);
//		
//		String s = new String("Hello");
//		System.out.println(s);
//		s = s.concat(" World");
//		System.out.println(s);
//		
//		String w = "Hello";
//		System.out.println(w);
//		w = w + " World";
//		System.out.println(w);
		String one = "";
		String two = "";
		System.out.println(one = "a" + (two = "b"));	
		manyStrings();
		useStringBuilder();
		System.out.println("END OF APPLICATION");
	}

	public static void manyStrings() {
		String s = "a";
		long start = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			s = s.concat("a");
		}
		long end = System.currentTimeMillis();
		System.out.println("manyStrings Method took: " + (end - start) + "ms");
	}
	
	public static void useStringBuilder() {
		StringBuilder sb = new StringBuilder("a");
		long start = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		System.out.println("StringBuilder Method took: " + (end - start) + "ms");
	}
	
	/*
	 * StringBuffer is the same as StringBuilder however
	 * StringBuffer is synchronized. This means that
	 * StringBuffer is safer to use when you have multiple
	 * threads in an application.
	 * 
	 * A Thread is a part of your program that is running
	 * and performing some operations. For example, the
	 * main method creates what is known as the 'main thread'
	 */
	public static void useStringBuffer() {
		StringBuffer sb = new StringBuffer("a");
		long start = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		System.out.println("StringBuffer Method took: " + (end - start) + "ms");
	}
	
}
