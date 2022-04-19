package softwaredevelopment_p1;

import java.util.Collections;

public class Hand extends GroupOfCards {
    
    
    public Hand(int size) {
        super(size);
    }
    
    /* This method is called after playsers dueled cards to show which player dueled 
       what card.  */  
    public void showDeck() {
        System.out.println();
    }
    
    /* This method is called after comparing the rank of cards dueled to deck from players' hand. 
       player dueling a card which has biggest number(=winner) gets all of cards from the deck.  */  
    /* So this method should know to whom the cards go. The cards are added to winners ArrayList.
       Also, it returns the number, "how many cards are the player having."
    */
     public int addToWinner (String playerName) {   
         
         
        return 3;
    }
    
   
    
    public void shuffleCards() {
         Collections.shuffle(getCards());
    
    }
}
