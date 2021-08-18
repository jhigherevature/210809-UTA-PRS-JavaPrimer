package exceptions;

public class FinallyBlock {
	public static void main(String[] args) {
		try {
			recursive(1);
		} catch (StackOverflowError e) {
			e.printStackTrace();
			System.exit(0);
		} finally {
			System.out.println("FINALLY BLOCK RAN!!!");
			System.out.println("FINALLY BLOCK RAN!!!");
			System.out.println("FINALLY BLOCK RAN!!!");
		}
	}
	
	public static void recursive(int a) {
		recursive(++a);
	}
}
