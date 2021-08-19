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
	
	// 'exits' to other Aisles...
	Aisle[] connections;
	Product[] products;
	
	public Aisle(String aisleName, Aisle next, Aisle prev, Product... products) {
		this.aisleName = aisleName;
		this.next = next;
		this.prev = prev;
		this.products = products;
	}
	
	/*
	 * A way to return an aisle, using a (honestly arbitraty)
	 * method to determine a direction
	 */
	public Aisle getConnectedAisle(String direction) {
		// using if/else
		if (direction == "north")
			return connections[0];
		else if (direction == "south")
			return connections[1];
		
		// using switch
		switch (direction) {
		case "north":
			return connections[0];
		case "south":
			return connections[1];
		}
		
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
