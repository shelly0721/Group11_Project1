package softwaredevelopment_p1;

import java.util.Collections;

public class War extends GroupOfCards {

   
    
    public War(int size) {
        super(size);
    }
    
    
    public void addToWinner(Player player) {
        player.getDiscardPile().addAll(this.getCards());
    }
    
    public void showDeck() {
    
    }
    
    
    public void shuffleCards() {       
        Collections.shuffle(getCards());                   
    }
  
    public void showWar() {
        System.out.println("War!!!!\n");
    }
}
