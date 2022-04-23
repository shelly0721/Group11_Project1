/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package softwaredevelopment_p1Testing;

import softwaredevelopment_p1.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Dani
 */
public class PlayingCardTester extends CardTester implements Comparable{
    private int value;
    private String suit;
    private PlayerTester player;
    
    //For toString method
    private String[] cardValues = {"0","0","2","3","4","5","6","7","8","9","10","Jack", "Queen", "King","Ace"};
    
    public PlayingCardTester(int value, String suit){
        super();
        this.value = value;
        this.suit = suit;
    }
    
    public String getValue(){
        return cardValues[this.value];
    }
    
    public String getsuit(){
        return this.suit;
    }
    
    @Override
    public int compareTo(Object o){
        if(o instanceof PlayingCardTester){
            if(this.value>((PlayingCardTester)o).value){
                return 1;
            }
            else if (this.value<((PlayingCardTester)o).value){
                return -1;
            }
            else{
                return 0;
            }
        }
        else{
            return -10;
        }
    }
    
    //To use
    //take one card and compare it with a list of other cards
    //the method will return a list with the highest cards
    //it can return both if they are equal
    public ArrayList<PlayingCardTester> compareCards(ArrayList<PlayingCardTester> cardPile){
        ArrayList<PlayingCardTester> result = new ArrayList();
//        cardPile.add(this);
        Collections.sort(cardPile);
        Collections.reverse(cardPile);
        PlayingCardTester first = cardPile.get(0);
        for(int i = 1; i<cardPile.size(); i++){
            if(cardPile.get(i).value==(first.value)){
                result.add(cardPile.get(i));
            }
        }
        result.add(first);
        return result;
    }
    
    public PlayerTester getPlayer(){
        return player;
    }
    
    public void setPlayer(PlayerTester p){
        this.player = p;
    }
    
        /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    //This method is used in GroupOfCards
    @Override
    public String toString(){
        return cardValues[this.value] + " of " + this.suit;
    }
    
}
