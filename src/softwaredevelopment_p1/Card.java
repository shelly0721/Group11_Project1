package softwaredevelopment_p1;

/**
 * @author Group_11
 */
/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 * @author dancye
 * 
 */
public abstract class Card  implements Comparable{
    //default modifier for child classes
    private int value;
    private String suit;
    
    //For toString method
    private String[] cardValues = {"0","0","2","3","4","5","6","7","8","9","10","Jack", "Queen", "King","Ace"};
    
    public Card(int value, String suit){
        this.value = value;
        this.suit = suit;
    }
    public int compareCard(Card c){
        if(this.value>c.value){
            return 1;
        }
        else if (this.value<c.value){
            return -1;
        }
        else{
            return 0;
        }
    }
    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
//    @Override
//    public abstract String toString();
    
    //This method is used in GroupOfCards
    @Override
    public String toString(){
        return cardValues[this.value] + " of " + this.suit;
    }
    
    /*
    The compare method above can check if a cards value is greater, less or equal!
    It also uses the comparable interface to compare objects
    
    PlayingCard has an error because its extending Card wich implements comparable interface
    and PlayingCard is not implementing compareTo method from the interface
    The CompareCard method above is an example of a compareTo method
    */ 
    public abstract boolean compareCards(Card card);
    
}