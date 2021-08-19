package examples;

public class DogFetcher {

	public Dog[] allDogs;
	
	public Dog getDogByName(String name) {
		for (int i = 0; i < allDogs.length; i++) {
			if (name == allDogs[i].getName()) {
				return null; // return specific Dog 
			}	
		}
			
		return null;
	}
}
