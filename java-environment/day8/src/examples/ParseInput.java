package examples;

public class ParseInput {
	
	public static void parseInput(String[] command) {
		/*
		 * "move south"
		 */
		if (command[0].equalsIgnoreCase("move")) {
			// change player's location
			// if (command[1].equalsIgnoreCase("North")
			// else if (command...equals("South")
			/*
			 * Where are we currently? -> Players.getCurrentRoom();
			 * Where do we want to go? -> command[1] ==> "north"/"south"
			 * What is connected in that direction? -> String direction -> Room
			 * 
			 * player.setCurrentRoom( getCurrentRoom().getNorth()/.getSouth()  )
			 * 
			 */
		} else if (command[0].equalsIgnoreCase("flush")) {
			// flush the toilet....
		}
	}
}
