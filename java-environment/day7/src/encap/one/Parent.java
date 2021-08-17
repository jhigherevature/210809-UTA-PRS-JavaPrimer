package encap.one;

public class Parent {
	public String pub = "Public String";
	protected String pro = "Protected String";
	String def = "Default (package-private) String";
	private String pri = "Private String";
	
	public void printStrings() {
		System.out.println(pub);
		System.out.println(pro);
		System.out.println(def);
		System.out.println(pri);
	}
}
