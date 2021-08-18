package exceptions;

public class Simulator {
	public static void main(String[] args) {
		try {
			System.out.println(sumOddNumbers(1,1));
		} catch (EvenNumberException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("This is the Finally Block!");
		}
	}
	
	public static int sumOddNumbers(int a, int b) 
			throws EvenNumberException {
		if (a % 2 == 0)
			throw new EvenNumberException("First Input was even");
		if (b % 2 == 0)
			throw new EvenNumberException("Second Input was even");
		
		return a + b;
	}
}
