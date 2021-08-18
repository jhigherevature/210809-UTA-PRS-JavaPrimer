package examples;

public class Customer {
	Aisle currentLocation;
	
	public Aisle getCurrentLocation() {
		return this.currentLocation;
	}
	
	public void setCurrentLocation(Aisle location) {
		currentLocation = location;
	}
}
