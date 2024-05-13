public class Card{ // 3. Create Card class to represent a single card	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
  // 4. Give Card object characteristics by creating attributes	  	   	   	  	   	    	        	
  private String suit;	  	   	   	  	   	    	        	
  private String value;	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
  // 5. Create constructor method to feed Card object attributes	  	   	   	  	   	    	        	
  public Card(String value, String suit){	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
    // 6. Set current Card object attributes as parameters from new card instance	  	   	   	  	   	    	        	
    this.suit = suit;	  	   	   	  	   	    	        	
    this.value = value;	  	   	   	  	   	    	        	
  }	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
  // 7. Create getters and setters for the Card object	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
  public String getSuit(){	  	   	   	  	   	    	        	
     return this.suit;	  	   	   	  	   	    	        	
  }	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
  public String getValue(){	  	   	   	  	   	    	        	
     return this.value;	  	   	   	  	   	    	        	
  }	  	   	   	  	   	    	        	
	  	   	   	  	   	    	        	
}