package strings;

public class StringPool {
	public static void main(String[] args) {
		String str1 = "Hello World";
		String str2 = new String("Hello World");
		String str3 = "Hello World";
		System.out.println(str1 == str2);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str2));
		
		char[] wordOne = {'C','A','T'};
		String wordTwo = "CAT";
		
		/*
		 * The Split method allows for a simple and easy
		 * way to parse a String. The split method takes a
		 * String argument (either a regular expression or
		 * just a traditional string value) and will return
		 * an array of String objects by dividing the String
		 * using the argument as the deliminator.
		 */
		System.out.println("Splitting with a space:");
		String sentence = "Hello My Name Is Joseph";
		String[] words = sentence.split(" ");
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i]);
		}
		
		System.out.println("Splitting with the letter E");
		String[] usingE = sentence.split("e");
		for (String e : usingE) {
			System.out.println(e);
		}
		
		/*
		 * for (DATATYPE name : COLLECTION)
		 */
		for (String w : words) {
			System.out.println(w);
		}
		
		System.out.println(wordTwo.charAt(1)); // 'A'
		
		String letter = "A";
		char a = letter.charAt(0);
		
		String upper = "PIE";
		String lower = "pie";
		System.out.println(upper.equals(lower)); // false
		System.out.println(upper.equalsIgnoreCase(lower)); // true
		
		String pooled = "Pool";
		String unPooled = new String("Pool");
		System.out.println(pooled == unPooled); // false
		System.out.println(pooled == unPooled.intern()); // true
	}
}
