package scanners;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter: Morning, Noon or Night");
		String time = scan.next();
		int type = 0;

		switch (time.toLowerCase()) {
		case "morning":
			System.out.println("[1] - Casual\n"
					+ "[2] - Formal");
			type = scan.nextInt();
			chooseMorningGreeting(type);
			break;
		case "noon":
			System.out.println("Hello There!");
			break;
		case "night":
			System.out.println("Good Night!");
			break;
		default:
			System.out.println("Didn't quite get that, but have a great day!");
		}
	}
	
	public static void chooseMorningGreeting(int value) {
		if (value == 2)
			System.out.println("Good Morning to you sir");
		else if (value == 1) {
			System.out.println("Yo wut up broski");
		} else {
			System.out.println("Morning!");
		}
	}
}
