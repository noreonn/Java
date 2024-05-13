import java.util.ArrayList;	  	   	   	  	   	    	        	
import java.util.Random;	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
public class Deck{ // 2. Create Deck class top represent a deck of cards	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
  // 8. Give Deck object attribute of cards as array list of <Card> objects - import utils	  	   	   	  	   	    	        	
  private ArrayList<Card> cards;	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
  // 9. Create constructor method to feed Deck object attribute	  	   	   	  	   	    	        	
  public Deck(){	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
    // 10. Initialize current Deck object attribute (cards) as an array list of Card objects	  	   	   	  	   	    	        	
    this.cards = new ArrayList<Card>();	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
    // 17. Set initialize method to initialize the deck of cards upon instance of new deck	  	   	   	  	   	    	        	
    initialize();	  	   	   	  	   	    	        	
  }	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
  // 11. Create getter method to return array list of type Card to be populated with Card objects	  	   	   	  	   	    	        	
  public ArrayList<Card> getCards(){	  	   	   	  	   	    	        	
    return this.cards;	  	   	   	  	   	    	        	
  }	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
  // 12. Create initialize method to feed Card attribute values	  	   	   	  	   	    	        	
  public void initialize(){	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
    // 13. Create arrays of atrtribute values to feed the card attributes	  	   	   	  	   	    	        	
    String[] suits = {"Diamonds","Hearts","Clubs","Spades"};	  	   	   	  	   	    	        	
    String[] values = {"Ace","2", "3","4","5","6","7","8","9","10","Jack","Queen","King"};	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
    // 14. Create nested for each loop to set card attributes	  	   	   	  	   	    	        	
    for(String suit : suits){	  	   	   	  	   	    	        	
      for(String value : values){	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
        // 15. Create instance of new card for each combination of Card objects	  	   	   	  	   	    	        	
        Card newCard = new Card(value,suit);	  	   	   	  	   	    	        	
        // 16. Add created instances of new card to the array list of cards	  	   	   	  	   	    	        	
        cards.add(newCard);	  	   	   	  	   	    	        	
      }	  	   	   	  	   	    	        	
    }	  	   	   	  	   	    	        	
  }	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
  // 18. Create method to get five random cards by returning array list of chosen cards	  	   	   	  	   	    	        	
  public ArrayList<Card> getRandomCards(){	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
    // 19. Create new array list that will hold random cards	  	   	   	  	   	    	        	
    ArrayList<Card> randomCards = new ArrayList<Card>();	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
    // 20. Create random number generator - imports included	  	   	   	  	   	    	        	
    Random rand = new Random();	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
    // 21. Create while loop to add five random cards into random card array list	  	   	   	  	   	    	        	
    while(randomCards.size() < 5){	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
      // 22. Create  random index of the cards attribute array list	  	   	   	  	   	    	        	
      int index = rand.nextInt(cards.size());	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
      // 23. Create new instance of card randomly chosen from array list of cards	  	   	   	  	   	    	        	
      Card chosenCard = cards.get(index);	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
      // 24. If random cards do not already contain chosen card	  	   	   	  	   	    	        	
      if(!randomCards.contains(chosenCard)){	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
        // 25. Then add the chosen card into random cards array list	  	   	   	  	   	    	        	
        randomCards.add(chosenCard);	  	   	   	  	   	    	        	
      }	  	   	   	  	   	    	        	
    }	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
    // 26. Return array list of random cards	  	   	   	  	   	    	        	
    return randomCards;	  	   	   	  	   	    	        	
  }	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
}