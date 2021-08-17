package encap.two;

import encap.one.Parent;

public class SimulatorTwo {
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.pub);
//		System.out.println(p.pro); // error - not visible
//		System.out.println(p.def); // error - not visible
//		System.out.println(p.pri); // error - not visible
	}
}
