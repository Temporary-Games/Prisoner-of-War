package pow;

public class Event {

	//Names the card, such as "You find a chocolate bar!"
	String title;
	
	/* 
	 * How it affects the overall prison-guard anger.
	 * Can be positive or negative. Higher is angrier.
	 * 
	 */
	int guardAggression;
	
	/*
	 * If this is true, the event will display the title and
	 * instantly free a prisoner.  The card will not be added
	 * to the Player's inventory
	 * 
	 */
	boolean freesAPrisoner;
	boolean bribe;
	boolean bribable;
	
	public Event(){
		
	}
	
}
