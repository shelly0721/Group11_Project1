package softwaredevelopment_p1;

import java.util.Collections;

public class War extends GroupOfCards {

   
    
    public War(int size) {
        super(size);
    }
    
    
    public int addToWinner () {
    
        return 3;
    }
    
    public void showDeck() {
    
    
    }
    
    
    public void shuffleCards() {       
        Collections.shuffle(getCards());                   
    }
  
}
