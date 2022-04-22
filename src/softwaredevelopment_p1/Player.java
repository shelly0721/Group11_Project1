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

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class Player {

    private String name; //the unique name for this player
    private int winStreak;
    private int score;
    private Hand hand;
    private DiscardPile discard;

    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public Player(String name) {
        this.name = name;
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
        this.name = name;
    }

    /**
     * The method to be overridden when you subclass the Player class with your specific type of Player and filled in
     * with logic to play your game.
//     */
//    public PlayingCard playCard(){
//        return this.hand.playTopCard();
//    }
    
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
        System.out.printf("%s's score is: %d", this.getName(), this.getScore());
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

}
