package examples;

public class Simulator {
	public static void main(String[] args) {
		// Creating a store to move within
		Store store = new Store();
		
		// call the init method first to create the store
		store.init();
		
		// Player will exist here
		Customer player = new Customer();
		
		// Establish the starting location for the player
		player.setCurrentLocation(store.getFirstAisle());
		
		/*
		 * GATHER INPUT...
		 */
	}
	
	public void changePlayerLocation(Customer player) {
		/*
		 * if/else statement to determine which direction to move
		 */
		
		// Movement based on player's current location. In this case, forward
		Aisle targetLocation = player.getCurrentLocation().moveForward();

		// Move player to the targetLocation...in this case Forward!
		player.setCurrentLocation(targetLocation);
		
		
	}
}
