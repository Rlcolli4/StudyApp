package main;
//THis file is part of the "main" package.
import java.util.Scanner;

import model.StudyCards;

public class MainController {
	private static Scanner userInput;
	private static String input;
	private static int convertedInput;
	private static String topicInput;

	public static void main(String[] args){
		MainControllerSays handleInput = new MainControllerSays();
		
		StudyCards populateInitialCards = new StudyCards();
		
		userInput = new Scanner(System.in);
		
		System.out.print("Would you like to [Study], [Create Card], or [Create Topic]?: ");
		input = userInput.nextLine();
		//There is some sort of error here....
		String inputLower = input.toLowerCase();
		
			switch (inputLower){
			case "study": convertedInput = 1;
						  break;
			case "create card": convertedInput = 2;
						        break;
			case "create topic": convertedInput = 3;
								 break;
			}
			
			if (convertedInput == 1) {
				System.out.println("You have chosen to study your topics.");
				//System.out.print("What topic would you like to study?");
				handleInput.handleCommand(inputLower);
				/*Used for testing to make sure I was getting here.
				topicInput = userInput.nextLine();
				System.out.println(topicInput);	
				*/
			}
			else if (convertedInput == 2) {
				System.out.println("You have chosen to create a card.");
				//System.out.print("What topic would you like to add a card in?");
				handleInput.handleCommand(inputLower);
				/*Used for testing to make sure I was getting here.
				topicInput = userInput.nextLine();
				System.out.println(topicInput);
				*/
			}
			else if (convertedInput == 3) {
				System.out.println("You have chosen to create a new topic.");
				handleInput.handleCommand(inputLower);
			}
			else {
				System.out.println("Something happened, please restart the app and try again.");
			}
		
			
		
	}
}
