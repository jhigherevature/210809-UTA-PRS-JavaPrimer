package flowcontrol;

/*
 * Switch statements are another flow control statement
 * however they differ from if-else statements in two
 * major ways. One they are NOT powered by a boolean
 * condition directly, instead we evaluate an expression
 * against established 'cases'. These cases should match
 * the datatype of the expression that we are evaluating.
 * 
 * Secondly, switch statements are NOT mutually exclusive. 
 * specifically, switch statement exhibit what is known as
 * fall-through logic.
 * 
 * fall-through logic will cause the execution of code
 * within a switch statement in ALL CASES that follow a
 * matching case statement.
 * 
 * This fall-through logic will continue until we reach
 * a break statement or the end of the switch statement
 */
public class SwitchStatements {
	public static void main(String[] args) {
//		System.out.println( (char)97 ); // a
//		System.out.println( (int)'a' ); // 97
		
		char letter = 'A';
		switch (letter) {
		case 'A':
			System.out.println("A for Assembly!");
			break;
		case 'B':
			System.out.println("B for Binary!");
			break;
		default:
			System.out.println("Too many letters");
		case 'C':
			System.out.println("C for Compilation");
			break;
		}
	}
}
