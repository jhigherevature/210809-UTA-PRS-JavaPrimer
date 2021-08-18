package examples;

/*
 * This example showcases movement forward/backward, but can
 * be much more robust. If you use the 'connections' array as
 * listed below, you can create a method that, for instance,
 * can take a direction as a string, and use flow control logic
 * to dictate returning a specific room from a larger collection
 * 
 * NOTE: You DONT have to stick with Arrays, you can use any
 * Datastructure in Java, Maps are popular
 */
public class Aisle {
	String aisleName;
	Aisle next;
	Aisle prev;	
	Aisle[] connections;
	Product[] products;
	
	public Aisle(String aisleName, Aisle next, Aisle prev, Product... products) {
		this.aisleName = aisleName;
		this.next = next;
		this.prev = prev;
		this.products = products;
	}
	
	public Aisle getConnectedAisle(String direction) {
		if (direction == "north")
			return connections[0];
		
		return this;
	}
	
	public Aisle moveForward () {
		return this.next;
	}
	public Aisle moveBackward() {
		return this.prev;
	}
	
	public void setNext(Aisle next) {
		this.next = next;
	}
	public void setPrev(Aisle prev) {
		this.prev = prev;
	}
}
