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
	 * to the Player's inventory.
	 * 
	 */
	boolean freesAPrisoner;
	
	/*
	 * If this is true, the card can be stored in your inventory
	 * and used when a "bribable" card comes up.  (E.g. "Chocolate Bar"
	 * would be a bribe and could be used on an "Aggressive Guard" card
	 * which would be "bribable")
	 * 
	 */
	boolean bribe;
	
	/*
	 * If this is true the card can be used to free a prisoner when
	 * provided with a "bribe" card.  See "bribe" comment for description
	 * 
	 */
	boolean bribable;
	
	public Event(){
		
	}
	
}
