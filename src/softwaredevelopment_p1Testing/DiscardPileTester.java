package softwaredevelopment_p1Testing;

import softwaredevelopment_p1.*;
import java.util.ArrayList;
import java.util.Collections;

public class DiscardPileTester extends GroupOfCardsTester {
   
    public DiscardPileTester(int size) {
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
    
    public boolean showDeck() {
        if(this.getCards().size() > 0){
            for(CardTester e: this.getCards()){
                //Uses toString method in CardTester
                System.out.println(e);
            return true;
              } 
           }
        return false; 
    }
    
    
    public void shuffleCards() {
        Collections.shuffle(getCards());
    
    }   

}
