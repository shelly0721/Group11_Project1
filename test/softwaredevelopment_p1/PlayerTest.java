/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package softwaredevelopment_p1;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author douga
 */
public class PlayerTest {
    
    public PlayerTest() {
    }

    /**
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetNameGood() {
        System.out.println("testGetNameGood");
        Player player = new Player("Bob");
        assertEquals(player.getName(), "Bob");
    }
    
    /**
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetNameBad() {
        System.out.println("testGetNameBad");
        Player player = new Player("");
        assertEquals(player.getName(), null);
    }

    /**
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetNameBoundary() {
        System.out.println("testGetNameBoundary");
        Player player = new Player("Bill");
        assertEquals(player.getName(),"Bill");
    }
    /**
     * Test of setName method, of class Player.
     */
    @Test
    public void testSetNameGood() {
        System.out.println("testSetName Good");
        Player instance = new Player("");
        instance.setName("player1");
        assertEquals("player1",instance.getName());
    }

    /**
     * Test of setScore method, of class Player.
     */
    @Test
    public void testSetScoreGood() {
        System.out.println("testSetName Good");
        Player instance = new Player("player1");
        
        instance.getDiscardPile().getCards().add(new PlayingCard(3,"Hearts"));
        instance.getDiscardPile().getCards().add(new PlayingCard(4,"Hearts"));
        instance.setScore();
        assertEquals(2 ,instance.getScore());
    }

    
   
    
    
    /**
     * Test of getScore method, of class Player.
     */
   
     @Test
    public void testGetScoreGood() {
        System.out.println("Test get score good");
        Player player1 = new Player("player1");      
        assertEquals(0, player1.getScore());
    }
    
 @Test
    public void testGetScoreBad() {
        System.out.println("Test get score bad");
        Player player1 = new Player("player1");
        assertEquals(player1.getScore(), 0);
    }
    
     @Test
    public void testGetScoreBoundary() {
        System.out.println("Test get score boundary");
   Player player1 = new Player("player1");
    assertEquals(player1.getScore(), 0);
    }
    
    /**
     * Test of showScore method, of class Player.
     */
    @Test
    public void testShowScoreGood() {
        System.out.println("Test showScore Good");
        Player instance = new Player("player1");
    
        assertEquals(true, instance.getName().equals("player1") && instance.getScore() == 0);
    }

    
    
    /**
     * Test of clearStreak method, of class Player.
     */
    @Test
    public void testClearStreakGood() {
        System.out.println("Test clearStreak Good");
        Player instance = new Player("player1");
        instance.addStreak();
        instance.addStreak();
        System.out.println(instance.getStreak());
        
        instance.clearStreak();
        assertEquals(true, instance.getStreak() == 0);
    }

      
        
    /**
     * Test of addStreak method, of class Player.
     */
    @Test
    public void testAddStreakGood() {      
        System.out.println("TestAddStreak Good");
        Player instance = new Player("player1");
        instance.addStreak();
   
        assertEquals(true, instance.getStreak() == 1);
    }

    /**
     * Test of getStreak method, of class Player.
     */
    @Test
    public void testGetStreakBad() {
        System.out.println("Test get streak bad");
        Player player1 = new Player("player1");
        assertEquals(0, player1.getStreak());
        
        
    }
    
     @Test

     public void testGetStreakBoundary() {
        System.out.println("Test get streak boundary");
        Player player1 = new Player("player1");
        assertEquals(0, player1.getStreak());
        
        
    }
    
     @Test
    public void testGetStreakGood() {
        System.out.println("Test get streak boundary");
        Player player1 = new Player("player1");
        assertEquals(0, player1.getStreak());
        
        
    }

    /**
     * Test of addToHand method, of class Player.
     */
    @Test
    public void testAddToHandGood() {
        System.out.println("TestAddToHand Good");
        Player instance = new Player("player1");
     
        instance.addToHand(new PlayingCard(3,"Heart"));
        instance.addToHand(new PlayingCard(4,"Heart"));
        
        assertEquals(true, instance.getHand().getCards().size() == 2);
    }
    
     

    /**
     * Test of getHand method, of class Player.
     */
    @Test
    public void testGetHand() {
        System.out.println("TestAddToHand Good");
        Player instance = new Player("player1");
        PlayingCard card = new PlayingCard(3,"Heart");
        instance.addToHand(card);
  
        assertEquals(card, instance.getHand().getCards().get(0));
    }

    /**
     * Test of getDiscardPile method, of class Player.
     */
    @Test
    public void testGetDiscardPile() {
        System.out.println("TestGetDiscardPile Good");
        Player instance = new Player("player1");
        PlayingCard card = new PlayingCard(3,"Heart");
        instance.getDiscardPile().getCards().add(card);
        instance.getDiscardPile();
  
        assertEquals(card, instance.getDiscardPile().getCards().get(0));
        
    }
    
    
    /**
     * Test of playCard method, of class Player.
     */
    @Test
    public void testPlayCardGood() {
        System.out.println("TestPlayCard Good");
        Player instance = new Player("player1");
      
        
        PlayingCard card = new PlayingCard(3,"Heart");
        PlayingCard card2 = new PlayingCard(4,"Heart");
        instance.getHand().getCards().add(card);
        instance.getHand().getCards().add(card2);
 
        instance.getDiscardPile();
  
        assertEquals(true, instance.getHand().getCards().get(0) == card);
        
    }

    
    
       
    /**
     * Test of announceWin method, of class Player.
     */
    @Test
    public void testAnnounceWinGood() {
        System.out.println("TestAnnounceWin Good");
        Player instance = new Player("player1");
        instance.announceWin();
        assertEquals("player1", instance.getName());
    }
    
       
    /**
     * Test of announceLoss method, of class Player.
     */
    @Test
    public void testAnnounceLoss() {
        System.out.println("TestAnnounceLoss Good");
        Player instance = new Player("player1");
        instance.announceLoss();
        assertEquals("player1", instance.getName());
    }
    

    
}
