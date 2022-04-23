package softwaredevelopment_p1Testing;

import softwaredevelopment_p1.*;
import java.util.Collections;

public class HandTester extends GroupOfCardsTester {
    
    
    public HandTester(int size) {
        super(size);
    }
    
   
     public boolean showDeck() {
        if(this.getCards().size() > 0){
        /* this method is called both when cards are put into deck and when 
           cards are taken from the deck  */
            for(CardTester e: getCards()) {
               //Uses toString method in CardTester
               System.out.println(e);
               return true;
           } 
        }
        return false;
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
    
     /* This method is for "Playing CardTester," for player putting a card to deck. 
        It removes the "card" in each players' ArrayList and returns that. 
     */
     public PlayingCardTester playTopCard() {
         if(this.getCards().size() > 0){
            PlayingCardTester temp = (PlayingCardTester) getCards().get(0);       
            getCards().remove(0);
            return temp;
         }
         return null;
     }
   
    
    public void shuffleCards() {
         Collections.shuffle(getCards());  
    }
}

