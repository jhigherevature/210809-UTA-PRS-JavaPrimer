package designpatterns;

/*
 * A POJO ('Plain old Java Object') is a design pattern
 * that is used to represent a simple idea without adhering
 * to any conventions or rules aside from getting your code
 * to actually compile (rules that prevent your code from
 * running whatsoever).
 */
public class POJO {
	public String name;
	private int id;
	protected double amount;
	
	public void printInfo() {
		System.out.println("name is: " + name + ", amount is: " +  amount);
	}
}
