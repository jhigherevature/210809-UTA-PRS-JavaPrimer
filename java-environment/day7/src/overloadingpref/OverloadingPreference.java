package overloadingpref;

public class OverloadingPreference {
	public static void main(String[] args) {
		method(5);
	}
	
	public static void method(int i) {
		System.out.println("Integer Primitive");
	}
	public static void method(long l) {
		System.out.println("Long primitive");
	}
	public static void method(int... nums) {
		System.out.println("Integer Var-Args");
	}	
}
