/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package softwaredevelopment_p1;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nakamurasayaka
 */
public class GameTest {
    
    public GameTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of getName method, of class Game.
     */
    @Test
    public void testGetName() {
        System.out.println("getName Good");      
        Game instance = new Game();
        String expResult = "War";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    
    

    /**
     * Test of getPlayers method, of class Game.
     */
    @Test
    public void testGetPlayersGood() {
        System.out.println("getPlayers Good");
        Game instance = new Game();
        ArrayList<Player> player = new ArrayList<Player>();
        Player player1 = new Player("Player1");
        Player player2 = new Player("Player2");
        player.add(player1);
        player.add(player2);
        instance.registerPlayer(player1);
        instance.registerPlayer(player2);
       
        ArrayList<Player> expResult = player;
        ArrayList<Player> result = instance.getPlayers();

        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    
     @Test              // No need "bad?" becaue it always return "ArrayList<Player> player" unless it's declared (regardless it's null or not)
                        // the way below. Confirming if returned Array has nothing.
    public void testGetPlayersBad() {
        System.out.println("getPlayers Bad");
        Game instance = new Game();
        ArrayList<Player> player = new ArrayList<Player>();
        
//        Player player1 = new Player("Player1");  
//        Player player2 = new Player("Player2");             
//        instance.registerPlayer(player1);     
//        instance.registerPlayer(player2);
        
     //   ArrayList<Player> expResult = player;
    //    ArrayList<Player> result = instance.getPlayers();
        boolean expect = true;
        boolean result = (player.size()==0);

        assertEquals(expect, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
    
     @Test
    public void testGetPlayersBoundary() {
        System.out.println("getPlayers Boundary");
        Game instance = new Game();
        ArrayList<Player> player = new ArrayList<Player>();
        Player player1 = new Player("Player1");       
        player.add(player1);      
        instance.registerPlayer(player1);      
        ArrayList<Player> expResult = player;
        ArrayList<Player> result = instance.getPlayers();

        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    
    /**
     * Test of setPlayers method, of class Game.
     */
    @Test                                        //Only Good Pattern is fine?
    public void testSetPlayersGood() {
        System.out.println("setPlayers Good");
        Game instance = new Game();
        ArrayList<Player> player = new  ArrayList<Player>();   
        instance.setPlayers(player);
        assertEquals(instance.getPlayers(),player);
        
      

// TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of declareWinner method, of class Game.
     */
     @Test
    public void testDeclareWinnerGood() {
        System.out.println("declareWinner Good");
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");
        Player player3 = new Player("player3");
        Game instance = new Game();
        instance.declareWinner(player1);
        
        assertEquals(true,(player1.getStreak()==1 && player2.getStreak()==0 && player3.getStreak()==0));
        
        // TODO review the generated test code and remove the default call to fail.
   
    }
     @Test                
    public void testDeclareWinnerBad() {    // do we need that? 
        System.out.println("declareWinner Bad/ Do we need that?");
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");
        Game instance = new Game();
        instance.declareWinner(player1);
        instance.declareWinner(player2);
        
        assertEquals(false,(player1.getStreak()==1 && player2.getStreak()==0));
        
        // TODO review the generated test code and remove the default call to fail.
   
    }
    @Test
    public void testDeclareWinnerBoundary() {
        System.out.println("declareWinner");
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");
        Game instance = new Game();
        instance.declareWinner(player1);
        
        assertEquals(true,(player1.getStreak()==1 && player2.getStreak()==0));
        
        // TODO review the generated test code and remove the default call to fail.
   
    }
  
    
 
    

    /**
     * Test of registerPlayer method, of class Game.
     */
    @Test   //  it doesn't work...'
    public void testRegisterPlayerGood() {
        System.out.println("registerPlayerGood");
        ArrayList<Player> player = new ArrayList<Player>();
        Player player1 = new Player("player1");
        Game instance = new Game();
        instance.setPlayers(player);
   
        int size1 = player.size();
   
        instance.registerPlayer(player1);
        int size2 = player.size();
         System.out.println(size2);
       
        assertEquals(true, size1+1==size2);
    }

    
     @Test
    public void testRegisterPlayerBad() {
        System.out.println("registerPlayerBad");
        ArrayList<Player> players = new ArrayList<Player>();
        Player player1 = new Player("player1");
        Game instance = new Game();
        players.add(player1);
        int size1 = players.size();
         System.out.println(size1);
        instance.registerPlayer(player1);
        int size2 = players.size();
         System.out.println(size2);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(false, size1+1==size2);
    }
 
    
    /**
     * Test of dealCards method, of class Game.
     */
    @Test
    public void testDealCardsGood() {
        System.out.println("dealCards Good");
        Game instance = new Game();
        CardFactory cf = new CardFactory();
        GroupOfCards deck = cf.getDeck();
        ArrayList<Player>players = new ArrayList<Player>();
        Player player1 = new Player("player1");
        Player player2 = new Player("player2");
        players.add(player1);
        players.add(player2);
        int cardsDealt = deck.getSize()/players.size();
//        System.out.println(deck.getSize());  //-> 52
//        System.out.println(players.size());  // ->2
//        System.out.println(deck.getSize()/players.size());  // -> 26
//       
        instance.setPlayers(players);
        instance.dealCards();
   
        assertEquals(true, (cardsDealt==player1.getHand().getCards().size())
                && (cardsDealt==player2.getHand().getCards().size()));
    
    
        // TODO review the generated test code and remove the default call to fail.
       
    }

     @Test   // if no players, deal doesn't occur (=deck has 52 cards after executing this method)
    public void testDealCardsBad() {
        System.out.println("dealCards Bad");
        Game instance = new Game();
        CardFactory cf = new CardFactory();
        GroupOfCards deck = cf.getDeck();
        ArrayList<Player>players = new ArrayList<Player>();
        Player player1 = new Player("player1");
      //  Player player2 = new Player("player2");
        players.add(player1);
      //  players.add(player2);
//        System.out.println(deck.getSize());  //-> 52
//        System.out.println(players.size());  // ->2
//        System.out.println(deck.getSize()/players.size());  // -> 26
     
        instance.setPlayers(players);
        instance.dealCards();
   
        assertEquals(52,deck.getSize());
    
    
        // TODO review the generated test code and remove the default call to fail.
       
    }

  
    
    
    
    
    
    /**
     * Test of displayWinner method, of class Game.
     */
    @Test           
    public void testDisplayWinnerGood() {
        System.out.println("displayWinner Good");
        Game instance = new Game();
        CardFactory cf = new CardFactory();
        GroupOfCards deck = cf.getDeck();
        ArrayList<Player> players = new ArrayList<Player>();
        instance.setPlayers(players);
        Player player1 = new Player("player1");    
        Player player2 = new Player("player2");  
        Player winner = new Player("winner");  
        
        players.add(player1);
        players.add(player2);
        players.add(winner);
        
     //   player1.getDiscardPile().getCards().size();
       
        
        deck.getCards().get(0).setPlayer(player1);
        deck.getCards().get(0).setPlayer(winner);
      
        System.out.println(player1.getDiscardPile().getCards().size());
       
       
        player1.getDiscardPile().getCards().add(new PlayingCard(2,"clubs"));
        player1.getDiscardPile().getCards().add(new PlayingCard(3,"spades"));
        player1.getDiscardPile().getCards().add(new PlayingCard(4,"clubs"));
        player1.getDiscardPile().getCards().add(new PlayingCard(5,"spades"));
       
        player2.getDiscardPile().getCards().add(new PlayingCard(2,"hearts"));
        player2.getDiscardPile().getCards().add(new PlayingCard(3,"diamonds"));
        
        player1.setScore();
        player2.setScore();
      
        System.out.println(player1.getDiscardPile().getCards().size());
       
        player2.getHand();
        instance.displayWinner();
         
        assertEquals("player1", winner.getName());
        
         
    }

    
//      public void displayWinner(){
//        int max = 0;
//        Player winner=this.players.get(0);
//        for(Player player: this.players){
//            if(player.getScore() > max){
//                max=player.getScore();
//                winner = player;
//            }
//        }
//        System.out.printf("The winner of this game of war is %s \n"
//                , winner.getName());
//        winner.showScore();
//    }
//    
    
    
    /**
     * Test of playRound method, of class Game.
     */
    @Test
    public void testPlayRound() {
        System.out.println("playRound");
        Game instance = new Game();
        instance.playRound();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showScores method, of class Game.
     */
    @Test
    public void testShowScores() {
        System.out.println("showScores Good");
         System.out.println("displayWinner Good");
        Game instance = new Game();
        CardFactory cf = new CardFactory();
        GroupOfCards deck = cf.getDeck();
    //    DiscardPile pile = new DiscardPile(0);
        ArrayList<Player> players = new ArrayList<Player>();
        instance.setPlayers(players);
        Player player1 = new Player("player1");    
        Player player2 = new Player("player2");  
       
        player1.getDiscardPile().getCards().add(new PlayingCard(2,"clubs"));
        player1.getDiscardPile().getCards().add(new PlayingCard(3,"spades"));
        player1.getDiscardPile().getCards().add(new PlayingCard(4,"clubs"));
        player1.getDiscardPile().getCards().add(new PlayingCard(5,"spades"));
       
        player2.getDiscardPile().getCards().add(new PlayingCard(2,"hearts"));
        player2.getDiscardPile().getCards().add(new PlayingCard(3,"diamonds"));
        
        player1.setScore();
        player2.setScore();
      
        
        
        instance.showScores();
        
           assertEquals(true, player1.getScore()==4 && player2.getScore()==2);
       
        // TODO review the generated test code and remove the default call to fail.
       
    }

    
     
    /**
     * Test of singleWinner method, of class Game.
     */
    @Test
    public void testSingleWinner() {
        System.out.println("singleWinner");
        PlayingCard card = null;
        ArrayList<PlayingCard> round = null;
        Game instance = new Game();
        instance.singleWinner(card, round);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of warDuel method, of class Game.
     */
    @Test
    public void testWarDuel() {
        System.out.println("warDuel");
        ArrayList<PlayingCard> warringCards = null;
        ArrayList<PlayingCard> roundCards = null;
        Game instance = new Game();
        instance.warDuel(warringCards, roundCards);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateScores method, of class Game.
     */
    @Test
    public void testUpdateScores() {
        
        System.out.println("diupdateScores() Good / Doesn't work...");
        Game instance = new Game();
        CardFactory cf = new CardFactory();
  //      GroupOfCards deck = cf.getDeck();
        ArrayList<Player> players = new ArrayList<Player>();
        instance.setPlayers(players);
        Player player1 = new Player("player1");    
        
       
        player1.getDiscardPile().getCards().add(new PlayingCard(2,"clubs"));       
        player1.setScore();
       
        int before = player1.getScore();
        
        System.out.println(player1.getScore());
        
        player1.getDiscardPile().getCards().add(new PlayingCard(3,"spades"));
        player1.getDiscardPile().getCards().add(new PlayingCard(4,"clubs"));
        player1.getDiscardPile().getCards().add(new PlayingCard(5,"spades"));
       
        
        instance.updateScores();
        System.out.println(player1.getScore());
        assertEquals(true, player1.getScore() == (before + 3));
       
        // TODO review the generated test code and remove the default call to fail.
       
    }

    
    
    
    
    /**
     * Test of checkForWinner method, of class Game.
     */
    @Test
    public void testCheckForWinner() {
        System.out.println("checkForWinner");
        Game instance = new Game();
        String expResult = "";
        String result = instance.checkForWinner();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkForLosers method, of class Game.
     */
    @Test
    public void testCheckForLosersGood() {
        System.out.println("checkForLosers() Good");
        Game instance = new Game();
        CardFactory cf = new CardFactory();
        ArrayList<Player> players = new ArrayList<Player>();
        instance.setPlayers(players);
        Player player1 = new Player("player1");    
        player1.setScore();
        
        
        instance.checkForLosers();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(true, player1.getHand().getCards().size() == 0 &&
                    player1.getDiscardPile().getCards().size() == 0);
    }
    
    @Test
     public void testCheckForLosersBad() {
        System.out.println("checkForLosers() Bad");
        Game instance = new Game();
        CardFactory cf = new CardFactory();
        ArrayList<Player> players = new ArrayList<Player>();
        instance.setPlayers(players);
        Player player1 = new Player("player1");    
        player1.setScore();
        player1.getHand().getCards().add(new PlayingCard(2,"clubs"));
        player1.getDiscardPile().getCards().add(new PlayingCard(3,"spades"));
        
        instance.checkForLosers();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(false, player1.getHand().getCards().size() == 0 &&
                    player1.getDiscardPile().getCards().size() == 0);
    }
    
    
     
   
    /**
     * Test of removeLosers method, of class Game.
     */
    @Test
    public void testRemoveLosers() {
        System.out.println("removeLosers Good / Doesn't work...");
        Game instance = new Game();
        ArrayList<Player> players = new ArrayList<Player>();
        ArrayList<Player> losers = new ArrayList<Player>();
        instance.setPlayers(players);
        instance.setPlayers(losers);
       
        Player player1 = new Player("player1");        
        players.add(player1);
        instance.removeLosers(losers);
        // TODO review the generated test code and remove the default call to fail.
       assertEquals(true, (!players.contains(player1) && losers.contains(player1)));
                    
    
    }

    
    /**
     * Test of discardToHand method, of class Game.
     */
    @Test
    public void testDiscardToHandGood() {
        System.out.println("discardToHand Good");
        Game instance = new Game();
        ArrayList<Player> players = new ArrayList<Player>();
        instance.setPlayers(players);
        Player player1 = new Player("player1");        
        players.add(player1);
      
        player1.getDiscardPile().getCards().add(new PlayingCard(2,"clubs"));
        instance.discardToHand();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(true, player1.getHand().getCards().size() == 1);
    }
    
    
     @Test
    public void testDiscardToHandBad() {
        System.out.println("discardToHand Bad");
        Game instance = new Game();
        ArrayList<Player> players = new ArrayList<Player>();
        instance.setPlayers(players);
        Player player1 = new Player("player1");        
        players.add(player1);
         
        instance.discardToHand();
        
        assertEquals(false, player1.getHand().getCards().size() == 1);
    }
    
}