package softwaredevelopment_p1;

import java.util.Collections;

public class War extends GroupOfCards {

   
    
    public War(int size) {
        super(size);
    }
    
    
   public int addToWinner (String player) { 
        for (int i = getTemp().size(); i > 0; i-- ) {
             // temp contains the cards taken from deck.
             // move them to winner hands.
             getCards().add(getTemp().get(0));
             getTemp().remove(0);                       // in this way, temp should be declared in GroupOfCard         
         }                                              // so far, it declared in "DiscardPile" class.
         return getCards().size();      
        
    }
    
   public void showDeck() {
        /* this method is called both when cards are put into deck and when 
           cards are taken from the deck  */
         for(Card e: getCards()) {
            //Uses toString method in Card
            System.out.println(e);
        } 
    }
    
    
    public void shuffleCards() {       
        Collections.shuffle(getCards());                   
    }
  
    public void showWar() {
        System.out.println("War!!!!");
    }
}
