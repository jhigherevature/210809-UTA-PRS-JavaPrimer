package exceptions;

public class CalculatorInvoker {
	public static int callCalculator(int a, int b) {
		return Calculator.divide(a, b);
	}
}
