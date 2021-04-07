package cards;

public class Deck {
	
	private Card[] cards;
	
	private int lastCardIndx; 
	
	public Deck(int num)
	{
		cards = new Card[num * 4];
		
		int runner = 0;
		
		for(int i = 0; i < num; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				cards[runner] = new Card(i,j);
				runner++;
			}
		}
		
		//The last valid index is 1 before the runner 
		lastCardIndx = runner - 1;
	}
	
	public Deck(Deck from, int num)
	{
		// Hold the number of cards to take from the deck to the new one
		int numberOfCards = 0;
		
		//Check if the number of the cards in the "from" deck is bigger 
		if(from.getNumCards()  > num )
		{
			cards = new Card[num];
			numberOfCards = num;
		}
		else
		{
			cards = new Card[from.getNumCards()];
			numberOfCards = from.getNumCards();
		}
		
		int runner = 0;
		
		Card tempCard;
		
		while( numberOfCards > 0)
		{
			tempCard = from.takeOne();
			cards[runner] = tempCard;
			runner++;
			numberOfCards--;
		}
		
		lastCardIndx = runner - 1;
	}
	
	public Deck(Deck first, Deck second)
	{
		
		int deckTakeFrom = 0;
		
		int deckSize = first.getNumCards() + second.getNumCards();
		
	    cards = new Card[deckSize];
	    
	    Card tempCard = first.takeOne(); 
	    while(tempCard != null)
	    {
	    	cards[deckTakeFrom] = tempCard;
	    	
	    	deckTakeFrom++;
	    	
	    	// Toggle where cards will be taken 
	    	
	    	if(deckTakeFrom % 2 == 0)
	    	{
	    		tempCard = first.takeOne(); 
	    	}
	    	else
	    	{
	    		tempCard = second.takeOne(); 
	    	}
	    }
	    
	    //Finish the other cards if exist 
	    if(first.getNumCards() > 0)
	    {
	    	tempCard = first.takeOne(); 
	    	while(tempCard != null)
	    	{
	    		cards[deckTakeFrom] = tempCard;
	    		tempCard = first.takeOne();
	    		deckTakeFrom++;
	    	}
	    }
	    else if (second.getNumCards() > 0)
	    {
	    	tempCard = second.takeOne(); 
	    	while(tempCard != null)
	    	{
	    		cards[deckTakeFrom] = tempCard;
	    		tempCard = second.takeOne();
	    		deckTakeFrom++;
	    	}
	    }
	    
	    // The last valid index, avoiding over flow 
	    lastCardIndx = deckTakeFrom -1;
	}
	
	public int getNumCards()
	{
		// Number of cards is the last valid index plus 1 
		return (lastCardIndx + 1);
	}
	
	public Card takeOne()
	{
		Card tmpC;
		
		if(lastCardIndx == 0)
		{
			if (cards[lastCardIndx] == null)
			{
			   tmpC = null;
			   // Set to minus then the number will be zero
			   lastCardIndx = -1;
			}
			else
			{
				tmpC = cards[lastCardIndx];
				cards[lastCardIndx] = null;
			}
		}
		else
		{
			 tmpC = cards[lastCardIndx];
			 cards[lastCardIndx] = null;
			 lastCardIndx--;
		}
		
		return tmpC;
	}
	
	public String toString()
	{
	   String s = "[";
	   
	   for (int i = 0; i <  lastCardIndx + 1 ; i++)
	   {
		   s += cards[i].toString();
		   
		   if (i == lastCardIndx)
			   s += "]";
		   else
			   s += ", ";
	   }
	   
	   return s;
	}
	
	public void sort()
	{
	  Card c; 
	  
	  for(int i = 0; i < lastCardIndx + 1; i++)
	  {
		  for(int j = i + 1; j < lastCardIndx + 1; j++)
		  {
			  if(cards[i].compareTo(cards[j]) > 0)
			  {
				  c = cards[i];
				  cards[i] = cards[j];
				  cards[j] = c;
			  }
		  }
	  }
	}

}
