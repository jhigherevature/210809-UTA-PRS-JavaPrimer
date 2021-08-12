package methods;

import java.util.Scanner;

public class InputCollectorExample {
	
	public static void main(String[] args) {
		int menuSelection = (int)getInput();
	}
	
	public static double getInput() {
		Scanner scan = new Scanner(System.in);
		return scan.nextDouble();
	}
}
