package events;

import java.util.Scanner;

public class ChapterOneDecisions {
	
	Scanner scan = new Scanner(System.in);
	
	//TODO: Implement rough draft of dialog decisions,
	//Save decision, persist it all game and have it passed in story methods to provide different outcomes
	public String firstDialogOption(Scanner scan, String decision) {
		
		decision = scan.nextLine();
		
		if(decision.equalsIgnoreCase("1")) {
			
		}
		else {
			
		}
		
		return decision;
	}
}
