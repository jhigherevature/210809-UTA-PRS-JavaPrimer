package encap.one;

public class SimulatorOne {
	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.pub);
		System.out.println(p.pro);
		System.out.println(p.def);
//		System.out.println(p.pri); // error - not visible
	}
}
