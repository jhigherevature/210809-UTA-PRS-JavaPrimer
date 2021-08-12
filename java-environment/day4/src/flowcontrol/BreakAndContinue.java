package flowcontrol;

public class BreakAndContinue {
	public static void main(String[] args) {		
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//			if (i == 5) {
//				System.out.println("I is 5, lets stop here!");
//				break;
//			}
//		}
		
		System.out.println("BREAK STATEMENT:");
		for (char letter = 'A'; letter < 'E'; letter++) {
			for (int number = 0; number < 4; number++) {
				if (number == 2) {
					break;
				}
				System.out.println(letter + " : " + number);
			}
		}
		
		System.out.println("CONTINUE STATEMENT:");
		for (char letter = 'A'; letter < 'E'; letter++) {
			for (int number = 0; number < 4; number++) {
				if (number == 2) {
					continue;
				}
				System.out.println(letter + " : " + number);
			}
		}
		
		/*
		 * A label is an arbitrarily named identifier that
		 * can be placed on loops (and switch statements)
		 * that can allow you to dictate where you want the 
		 * logic for a break/continue statement to apply
		 */
		System.out.println("LABELS:");
		System.out.println("BREAK WITH LABEL:");
		alphabet : for (char letter = 'A'; letter < 'E'; letter++) {
			numeric : for (int number = 0; number < 4; number++) {
				if (number == 2) {
					break alphabet;
				}
				System.out.println(letter + " : " + number);
			}
		}
		
		System.out.println("CONTINUE WITH LABEL:");
		alphabet : for (char letter = 'A'; letter < 'E'; letter++) {
			numeric : for (int number = 0; number < 4; number++) {
				if (number == 2) {
					continue alphabet;
				}
				System.out.println(letter + " : " + number);
			}
		}
	}
}
