package softwaredevelopment_p1;

import java.util.ArrayList;
import java.util.Collections;

public class DiscardPile extends GroupOfCards {
   
    public DiscardPile(int size) {
        super(size);
    }
           
//    public void addToWinner (Player player) {   
//        for (int i = getCards().size()-1; i>0; i--) {
//            // move all cards in deck to temp, then remove it          
//            temp.add(getCards().get(0));
//            getCards().remove(0);  
//           
//        }
//    }
    
    public void showDeck() {
        /* this method is called both when cards are put into deck and when 
           cards are taken from the deck  */
         for(Card e: getCards()){
            //Uses toString method in Card
            System.out.println(e);
        }
    }  
    
    public void shuffleCards() {
        Collections.shuffle(getCards());
    }   
    
    public ArrayList<Card> getCard() {
        return getCards();
    }
   
    public ArrayList<Card> getTemp() {
            return temp;
    }
    
}
