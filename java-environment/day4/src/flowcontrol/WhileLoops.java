package flowcontrol;

/*
 * While Loops are the most basic looping flow control
 * statement. While loops will repeat the associated line
 * (or block) of code, so long as a boolean condition is true.
 */
public class WhileLoops {
	public static void main(String[] args) {
		System.out.println("BEGINNING OF APPLICATION");
		int x = 100;
		System.out.println("WHILE LOOP:");
		while (x < 10) {
			System.out.println(x);
			x = x + 1;
		}
		
		System.out.println("DO-WHILE LOOP:");
		int y = 100;
		do {
			System.out.println(y);
			y = y + 1;
		} while(y < 10);
		System.out.println("END OF APPLICATION");
	}
}
