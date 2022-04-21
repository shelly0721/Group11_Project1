package softwaredevelopment_p1;

import java.util.ArrayList;
import java.util.Collections;

public class War extends GroupOfCards {

  private ArrayList<Card> temp = new ArrayList<>(); 
    
    public War(int size) {
        super(size);
    }
    
    
   public void addToWinner (Player player) { 
       
        player.getDiscardPile().addAll(this.getCards());
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

    public void shuffleCards() {       
        Collections.shuffle(getCards());                   
    }
  
    public void showWar() {
        System.out.println("War!!!!");
    }
}

    
    public void shuffleCards() {       
        Collections.shuffle(getCards());                   
    }
  
    public void showWar() {
        System.out.println("War!!!!");
    }
}
