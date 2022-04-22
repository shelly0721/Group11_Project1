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
    private ArrayList<Player> losers;//disqualified losing players

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
    
    /**
     * Declares the provided player as the winner of the game;
     * @param player 
     */
    public void declareWinner(Player player){
        player.addStreak();
        for(Player p: this.players){
            if(p != player){
                p.clearStreak();
            }
        }
    }
    
    /**
     * Adds the provided player to the total players in the game
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
//        System.out.println(deck.getCards().get(0));
        
        for(Player player: this.players){
            while(tempHand.getCards().size() < cardsDealt){
                deck.getCards().get(0).setPlayer(player);
                tempHand.add(deck.getCards().get(0));
                deck.getCards().remove(0);
            }
            player.getHand().addAll(tempHand.getCards());
            tempHand.getCards().clear();
        } 
    }
    

    /**
     * Displays the final winner and the current stats
     * of everyone else in the game
     */
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
     * Has each player play a card into the round and then find the winner
     */
    public void playRound(){
        
        this.checkForLosers();
        this.checkForWinner();
        this.discardToHand();
        ArrayList<PlayingCard> round = new ArrayList<>();
        for(Player player: this.players){
            round.add(player.playCard());
        }
        ArrayList<PlayingCard> max = new ArrayList<>();
        max.add(round.get(0));
        PlayingCard temp = max.get(0);
        max.clear();
        max.addAll(temp.compareCards(round));
        System.out.println(max);
        System.out.println(round);

        if(max.size() == 1){
            this.singleWinner(max.get(0), round);

        }
        else{
           this.warDuel(max, round);
        }
        
        //compare each card in round
        //the max card owner gets all the cards added to their discrad pile
        //and the losers have the cards removed
    }
    
    /**
     * Displays the scores for every player in the game
     */
    public void showScores(){
        for(Player player: this.getPlayers()){
            player.showScore();
        }
    }
    
    /**
     * Announces the winner of the provided round by the provided winning Card
     * updates scores
     * @param card
     * @param round 
     */
    public void singleWinner(PlayingCard card, ArrayList<PlayingCard> round){
        card.getPlayer().getDiscardPile().addAll(round);
        card.getPlayer().announceWin();
//        System.out.println(card.getPlayer().getDiscardPile().getCards());
        this.updateScores();
    }
    
    /**
     * Goes through the process of a war duel
     * @param warringCards 
     */
    public void warDuel(ArrayList<PlayingCard> warringCards, 
            ArrayList<PlayingCard> roundCards){
        
        this.checkForLosers();
        this.checkForWinner();
        this.discardToHand();
        War roundOfWar = new War(warringCards.size());
//        roundOfWar.addAll(warringCards);
        roundOfWar.showWar();
        ArrayList<Player> warPlayers = new ArrayList<>();
        for(PlayingCard card: warringCards){
            warPlayers.add(card.getPlayer());
            
        }
        for(Player player: warPlayers){
            roundOfWar.getCards().add(player.playCard());
        }
        ArrayList<PlayingCard> max = new ArrayList<>();
        max.add(roundOfWar.getCards().get(0));

        PlayingCard temp = max.get(0);
        max.clear();
        max.addAll(temp.compareCards(roundOfWar.getCards()));


        if(max.size() == 1){
            this.singleWinner(max.get(0), roundOfWar.getCards());
            this.singleWinner(max.get(0), roundCards);
        }
        else{
           roundCards.addAll(roundOfWar.getCards());
           this.warDuel(max, roundCards);
           this.updateScores();
        }
    }
    
    /**
     * Updates the scores for every player in the game
     */
    public void updateScores(){
        for(Player player: this.getPlayers()){
//            System.out.println(player.getDiscardPile().getCards());
            System.out.println(player.getHand().getCards().size());
            player.setScore();
        }
    }
    
    /**
     * checks through the score of each player in the game 
     * and declares a winner if needed
     * @return 
     */
    public String checkForWinner(){
        Player winner;
        for(Player player: this.getPlayers()){
            if(player.getScore() == 52){
                this.declareWinner(player);
                return player.getName();
            }
        }  
        return "";
    }
    
    public void checkForLosers(){
        Player loser;
        for(Player player: this.getPlayers()){
            if(player.getHand().getCards().size() == 0 &&
                    player.getDiscardPile().getCards().size() == 0){
                this.removeLosers(player);
            }
        }  
    }
    
    public void removeLosers(Player player){
        this.players.remove(player);
        this.losers.add(player);
        player.announceLoss();
    }
    
    public void discardToHand(){
        for(Player player: this.getPlayers()){
            if(player.getHand().getCards().size() == 0 &&
                    player.getDiscardPile().getCards().size() > 0){
                int score = player.getScore();
                player.getDiscardPile().shuffle();
                player.getHand().addAll(player.getDiscardPile().getCards());
                player.getDiscardPile().getCards().clear();
                this.updateScores();
            }
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

