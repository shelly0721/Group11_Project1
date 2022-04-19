package softwaredevelopment_p1;

import java.util.Collections;

public class DiscardPile extends GroupOfCards {

    public DiscardPile(int size) {
        super(size);
    }
    
    
    public void showWar() {
        System.out.println("War!!!!");
    }
    
     public int addToWinner () {
    
        return 3;
    }
    
    public void showDeck() {
        System.out.println(getCards());
    }
    
    
    public void shuffleCards() {
        Collections.shuffle(getCards());
    
    }
}
