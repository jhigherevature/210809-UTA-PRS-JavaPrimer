package operators;

public class Binary {
	public static void main(String[] args) {
		/*
		 * The Modulus (%) operator is useful when
		 * trying to determine if a number is even
		 * or odd, when used in combination with the
		 * number '2'. The value retruned from any
		 * number mod 2 will either be '0' (even) or
		 * 1 (odd)
		 */
		int x = 10;
		int y = 3;
		int z = 2;
		System.out.println(x % y); // 1
		System.out.println(x % z); // 0
		
		System.out.println(8 % 3); // 2
		
		System.out.println(10 > 10); // false
		System.out.println(10 >= 10); // true
		
		System.out.println(x == 10); // true
		System.out.println(x != 10); // false
	}
}
