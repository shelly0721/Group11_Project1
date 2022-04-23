package softwaredevelopment_p1Testing;

import softwaredevelopment_p1.*;

/**
 *
 * @author Group_11
 */
/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class PlayerTester {

    private String name; //the unique name for this player
    private int winStreak;
    private int score;
    private HandTester hand;
    private DiscardPileTester discard;

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public PlayerTester(String name) {
        this.setName(name);
        this.hand = new HandTester(0);
        this.discard = new DiscardPileTester(0);
        this.score = 0;
        this.winStreak = 0;
        
    }

    /**
     * @return the player name
     */
    public String getName() {
        return name;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param name the player name to set
     */
    public void setName(String name) {
        if(!name.isBlank()){
            this.name = name;
        }
    }

    /**
     * The method to be overridden when you subclass the Player class with your specific type of Player and filled in
     * with logic to play your game.
//     */
//    public PlayingCardTester playCard(){
//        return this.hand.playTopCard();
//    }
    public void setScore(){
        int temp = 0;
        if(this.getDiscardPile().getCards().size() == 0 && this.score > 0){
            temp = this.getHand().getCards().size();
        }
//        System.out.printf("I'm in the method :> %d\n", this.discard.getSize());
        this.score = this.discard.getCards().size()+temp;
    }
    
    /**
     * gives the score value for the player
     * @return 
     */
    public int getScore(){
        return this.score;
    }
    /**
     * gives the score value for the player
     * @return 
     */
    public void showScore(){
        System.out.printf("%s's score is: %d\n", this.getName(), this.getScore());
    }
    
    /**
     * In the event of a loss the player's streak gets reset
     */
    public void clearStreak(){
        this.winStreak = 0;
    }
    
    /**
     * In the event of a win the player's streak increases by one
     */
    public void addStreak(){
        this.winStreak++;
    }
    
    /**
     * return the win streak value for the player
     * @return 
     */
    public int getStreak(){
        return this.winStreak;
    }
    
    public void addToHand(PlayingCardTester card){
        this.hand.add(card);
    }

    public HandTester getHand(){
        return this.hand;
    }
    
    public DiscardPileTester getDiscardPile(){
        return this.discard;
    }
    
    public PlayingCardTester playCard(){
        return this.hand.playTopCard();
    }
    
    public void announceWin(){
        System.out.printf("%s won that round!\n", this.getName());
    }
    
    public void announceLoss(){
        System.out.printf("%s lost in that round!\n", this.getName());
    }
}
