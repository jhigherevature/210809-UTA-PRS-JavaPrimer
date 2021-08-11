package operators;

public class Unary {
	public static void main(String[] args) {
		System.out.println("POST INCREMENT:");
		int post = 10;
		System.out.println(post); // print 10
		System.out.println(post++ + " : " + post); // print 10 : 11
		System.out.println(post); // print 11
		
		System.out.println("PRE INCREMENT:");
		int pre = 10;
		System.out.println(pre); // print 10
		System.out.println(++pre); // print 11
		System.out.println(pre); // print 11
		
		System.out.print("Same Line");
		System.out.print("Same Line");
		System.out.print("Same Line");
		System.out.println("\nNew Line");
		System.out.println("New Line");
		System.out.println("New Line");
		
		System.out.println(!true); // false
		System.out.println(!false); // true
	}
}
