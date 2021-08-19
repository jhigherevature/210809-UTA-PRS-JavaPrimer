package generics;

public class Simulator {
	public static void main(String[] args) {
		GenericClass<Integer> gc_Integer = new GenericClass<Integer>(20);
		GenericClass<String> gc_String = new GenericClass<String>("Hello");
	}
}
