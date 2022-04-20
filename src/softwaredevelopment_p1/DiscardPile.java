package softwaredevelopment_p1;

import java.util.Collections;

public class DiscardPile extends GroupOfCards {

    public DiscardPile(int size) {
        super(size);
    }
           
     public void addToWinner(Player player) {
    

    }
    
    public void showDeck() {
        System.out.println(getCards());
    }
    
    
    public void shuffleCards() {
        Collections.shuffle(getCards());
    
    }
}
