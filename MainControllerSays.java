package main;

import java.util.HashMap;

import model.StudyCards;

public class MainControllerSays {
	public static HashMap<String, StudyCards> commands = new HashMap<String, String>();
	/*
	 * The above will need to be changed WHEN i figure out how to get each portion of the code to work.
	 */

	public void handleCommand(String input) {
		// Populate our HashMap with three commands.
		commands.put("study", studyCollection(input));
		commands.put("create card", "You will create a card now.");
		commands.put("create topic", "You will create a topic now.");
		
		/*
		 * This portion of the code will change once we have something to pass the data too! For now, 
		 * It will just print out what the command says.
		 */
		System.out.println(commands.get(input));
	}
}
