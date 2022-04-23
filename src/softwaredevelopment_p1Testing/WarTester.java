package softwaredevelopment_p1Testing;

import softwaredevelopment_p1.*;
import java.util.ArrayList;
import java.util.Collections;

public class WarTester extends GroupOfCardsTester {

  private ArrayList<CardTester> temp = new ArrayList<>(); 
    
    public WarTester(int size) {
        super(size);
    }
    
    
   public void addToWinner (PlayerTester player) { 
       
        player.getDiscardPile().addAll(this.getCards());
        this.getCards().clear();
   }
          
            
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
  
    public void showWar() {
        System.out.println("War!!!!\n");
    }
}
