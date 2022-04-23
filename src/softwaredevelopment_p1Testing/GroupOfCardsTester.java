/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package softwaredevelopment_p1Testing;

/**
 *
 * @author Group_11
 */
/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */


import softwaredevelopment_p1.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class GroupOfCardsTester {

    //The group of cards, stored in an ArrayList
    private ArrayList<PlayingCardTester> cards;
    private int size;//the size of the grouping

    public GroupOfCardsTester(int size) {
        this.cards = new ArrayList<PlayingCardTester>();
        this.size = size;
    }

     public boolean compareCards(CardTester card){
       return true; //holding statement 
    };
    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<PlayingCardTester> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void add(PlayingCardTester c){
        cards.add(c);
    }
    public void addAll(ArrayList<PlayingCardTester> manycards){
        cards.addAll(manycards);
    } 
    
    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the max size for the group of cards
     */
    public void setSize(int size) {
        this.size = size;
    }
    
    /**
     * Display the collection of cards
     */
    public boolean showDeck(){
        if(this.getCards().size() > 0){
            for(CardTester e: this.cards){
                //Uses toString method in CardTester
                System.out.println(e);
            return true;
              } 
           }
        return false;
    }
    /**
     * Adds this cards collection to the winning player
     */
    public void addToWinner(PlayerTester p1){
        //In player class hand is private so you cant access it to add cards to it.
        //We need an addToHand method in the player class.
        //p1.addToHand(cards);
        
        //A card cant be in two places in the same time so removing from this group after adding to player hand
        //cards.clear();
    }

}//end class
