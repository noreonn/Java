import java.util.ArrayList;	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
public class CardPicker{ // 1. Create Main class for structure and code testing	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
  public static void main(String[] args){	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
    // 27. Create new instance of the deck class	  	   	   	  	   	    	        	
    Deck newDeck = new Deck();	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
    // 28. Create new array list of card type to store random cards	  	   	   	  	   	    	        	
    ArrayList<Card> myCards = newDeck.getRandomCards();	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
    // 29. For each new card object in my cards array list	  	   	   	  	   	    	        	
    for(Card newCard : myCards){	  	   	   	  	   	    	        	
      // 30. Print attributes of that new card	  	   	   	  	   	    	        	
      System.out.println(newCard.getValue()+" of "+newCard.getSuit());	  	   	   	  	   	    	        	
    }	  	   	   	  	   	    	        	
  }	  	   	   	  	   	    	        	
}