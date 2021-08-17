package encap.two;

import encap.one.Parent;

public class Child extends Parent {
	public void printParentStrings() {
		Parent p = new Parent();
		System.out.println(p.pub);
		/*
		 * Protected means that you have access to a field/method
		 * in a child class, even if that child class exists in
		 * a separate package, AS IF YOU WROTE THAT FIELD ON
		 * THE CHILD CLASS AND MADE IT PRIVATE!
		 */
//		System.out.println(p.pro);
//		System.out.println(p.def);
//		System.out.println(p.pri);
	}
	
	public void printMyStrings() {
		System.out.println(this.pub);
		System.out.println(this.pro);
//		System.out.println(this.def); // error - not visible
	}
}
