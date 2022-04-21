/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package softwaredevelopment_p1;

/**
 *
 * @author Group_11
 */
/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */


import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class GroupOfCards {

    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards;
    private int size;//the size of the grouping

    public GroupOfCards(int size) {
        this.cards = new ArrayList<Card>();
        this.size = size;
    }

     public boolean compareCards(Card card){
       return true; //holding statement 
    };
    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void add(Card c){
        cards.add(c);
    }
    public void addAll(ArrayList<Card> manycards){
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
    public void showDeck(){
        for(Card e: cards){
            //Uses toString method in Card
            System.out.println(e);
        }
    }
    /**
     * Adds this cards collection to the winning player
     */
    public void addToWinner(Player p1){
        //The players hand is private so you cant access it to add cards to it.
        //We need an addToHand method in the player class.
        //p1.addToHand(cards);
        
        //A card cant be in two places in the same time so removing from this group after adding to player hand
        //cards.clear();
    }

}//end class
