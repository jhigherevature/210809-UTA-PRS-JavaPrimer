package examples;

public class Store {
	Aisle[] aisles;
	Aisle firstAisle;
	/*
	 * Initialization method : 
	 * 		Create Aisles & products.
	 * 		Establish connection between aisles
	 * 		Add products to aisles
	 */
	public void init() {
		Aisle breadAisle = new Aisle("Bread Aisle", null, null, null);
		aisles[0] = breadAisle;
		Aisle chipsAisle = new Aisle("Chips", null, null, null);
		aisles[1] = chipsAisle;
		
		/*
		 * Setting exits/connections for the aisles
		 */
		breadAisle.setNext(chipsAisle);
		chipsAisle.setPrev(breadAisle);
		
		firstAisle = breadAisle;
	}
	
	public Aisle getFirstAisle() {
		return firstAisle;
	}
}
