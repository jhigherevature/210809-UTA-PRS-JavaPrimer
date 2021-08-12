package collect.input;

import java.util.Scanner;

public class ScannerExample {
	/*
	 * Stream is an entity that reads information/data from
	 * a 'source' location, and then outputs some information
	 * to a 'target' location.
	 */
	public static void main(String[] args) {
		System.out.println("BEGINNING OF APPLICATION");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hello World!");
		
		String input = scan.next();
		System.out.println("Your input was: " +  input);
		
		// Only close the scanner when you are COMPLETELY done with it
		scan.close();
		
		Scanner scan2 = new Scanner(System.in);
		
		int menuSelection = scan2.nextInt();
		System.out.println("Your menuSelection: " + menuSelection);
		
		System.out.println("END OF APPLICATION");
		scan2.close();
	}
}
