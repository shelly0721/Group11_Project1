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

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *  @author dancye
 *  @author Paul Bonenfant Jan 2020
 *
 */
public class Game {

    private final String name="War" ;//the title of the game
    private ArrayList<Player> players;// the players of the game
    private War war = new War(0);

    public Game() {
//        this.name = name;
        players = new ArrayList();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the players of this game
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
    
    public void declareWinner(Player player){
        player.addStreak();
        for(Player p: this.players){
            if(p != player){
                p.clearStreak();
            }
        }
    }
    
    /**
     * Goes through the series of prompts required for a new player to be 
     * created
     * @param player
     */
    public void registerPlayer(Player player){
        if(!(this.players.contains(player))){
            this.players.add(player);
        }
    }
    
    /**
     * Evenly deals cards to the number of players in the game
     */
    public void dealCards(){
        CardFactory cf = new CardFactory();
        GroupOfCards deck = cf.getDeck();
        deck.shuffle();
        int cardsDealt = deck.getSize() / this.players.size();
        GroupOfCards tempHand = new GroupOfCards(cardsDealt);
        System.out.println(deck.getCards().get(0));
        
        for(Player player: this.players){
            while(tempHand.getCards().size() < cardsDealt){
                tempHand.add(deck.getCards().get(0));
                deck.getCards().remove(0);
            }
            player.getHand().addAll(tempHand.getCards());
            tempHand.getCards().clear();
        } 
    }
    
    //displays the winner and the current stats of everyone else in the game
    public void displayWinner(){
        int max = 0;
        Player winner=this.players.get(0);
        for(Player player: this.players){
            if(player.getScore() > max){
                max=player.getScore();
                winner = player;
            }
        }
        System.out.printf("The winner of this game of war is %s \n"
                , winner.getName());
        winner.showScore();
    }
    
    /**
     * Displays the name of the player whose turn is next
     */
    public void playRound(){
        ArrayList<PlayingCard> round = new ArrayList<>();
        for(Player player: this.players){
//            round.add(player.playCard());
        }
        
        //compare each card in round
        //the max card owner gets all the cards added to their discrad pile
        //and the losers have the cards removed
    }
    
    public void showScores(){
        for(Player player: this.getPlayers()){
            player.showScore();
        }
    }

//    /**
//     * Play the game. This might be one method or many method calls depending on your game.
//     */
//    public abstract void play();

//    /**
//     * When the game is over, use this method to declare and display a winning player.
//     */
//    public abstract void declareWinner();

}//end class

