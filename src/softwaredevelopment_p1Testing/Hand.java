package softwaredevelopment_p1Testing;

import softwaredevelopment_p1.*;
import java.util.Collections;

public class Hand extends GroupOfCards {
    
    
    public Hand(int size) {
        super(size);
    }
    
   
     public void showDeck() {
        if(this.getCards().size() > 0){
        /* this method is called both when cards are put into deck and when 
           cards are taken from the deck  */
            for(Card e: getCards()) {
               //Uses toString method in Card
               System.out.println(e);
           } 
        }
    }
    
    /* This method is called after comparing the rank of cards dueled to deck from players' hand. 
       The player dueling a card which has biggest number(=winner) gets all of cards from the deck.  */ 
    /* The cards is stored in "ArrayList<Card> temp," so take all of them. 
    /* Also, it returns the number, "how many cards are the player having." */
     
//     public int addToWinner (String player) { 
//                                   
//         for (int i = getTemp().size(); i > 0; i-- ) {
//             // temp contains the cards taken from deck.
//             // move them to winner hands.
//             getCards().add(getTemp().get(0));
//             getTemp().remove(0);                       // in this way, temp should be declared in GroupOfCard         
//         }                                              // so far, it declared in "DiscardPile" class.
//         return getCards().size();     
//    }
    
     /* This method is for "Playing Card," for player putting a card to deck. 
        It removes the "card" in each players' ArrayList and returns that. 
     */
     public PlayingCard playTopCard() {
         if(this.getCards().size() > 0){
            PlayingCard temp = (PlayingCard) getCards().get(0);       
            getCards().remove(0);
            return temp;
         }
         return null;
     }
   
    
    public void shuffleCards() {
         Collections.shuffle(getCards());  
    }
}

