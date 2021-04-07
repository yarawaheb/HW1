package cards;

public class Card {
     
	private int number;
	
	private int cardSuit;
	
	public Card(int num, int suit)
	{
		number = num;
		
		cardSuit = suit;
	}
	
    public int getNum()
    {
    	return number;
    }
    
    public int getSuit()
    {
    	return cardSuit;
    }
    
    public String toString()
    {
    	String result = null ;
    	switch(cardSuit)
    	{
    	   case 0 : // Clubs
    		   result = number + "C";
    	   break;
    	   
    	   case 1: // Diamonds
    		   result = number + "D";
    	   break;
    	   
    	   case 2 : // Hearts
    		   result = number + "H";
    	   break;
    	   
    	   case 3 : // Spades
    		   result = number + "S";
    	   break;
    	}
    	
    	return result;
    }
    
    public int compareTo(Card other)
    {
    	int result;
    	if(this.toString() == other.toString())
    	{
    		result =  0; 
    	}
    	else
    	{
    		if(this.number == other.getNum())
    		{
    			if(this.cardSuit > other.getSuit())
    			{
    				result = 1;
    			}
    			else
    			{
    				result = -1;
    			}
    		}
    		else if(this.number > other.getNum())
    		{
    			result = 1;
    		}
    		else
    		{
    			result = -1;
    		}
    	}
    	
    	return result;
    }
}
