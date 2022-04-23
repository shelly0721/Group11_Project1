/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package softwaredevelopment_p1;

import static junit.framework.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nakamurasayaka
 */
public class WarTest {
    
    public WarTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of addToWinner method, of class War.
     */
    @Test
    public void testAddToWinnerGood() {
        System.out.println("testAddToWinner");
        CardFactory cf = new CardFactory();
        GroupOfCards deck = cf.getDeck();
        Player player = new Player("Name");
          
        assertEquals(true,(deck.getCards().size()>0 && player != null));
       
    }
    
    
    @Test
    public void testAddToWinnerBad() {
        System.out.println("testAddToWinner Bad");
        CardFactory cf = new CardFactory();
        GroupOfCards deck =cf.getDeck();
        Player player = null;
          
        assertEquals(true,(deck.getCards().size()>0 && player != null));
       
    }
    
    @Test
    public void testAddToWinnerBoundary() {
        System.out.println("testAddToWinner Boundary");
        CardFactory cf = new CardFactory();
        GroupOfCards deck = cf.getDeck();
        Player player = new Player("Name");
          
        assertEquals(true,(deck.getCards().size()>0 && player != null));
       
    }
    
    
    

    /**
     * Test of showDeck method, of class War.
     */
     public void testShowDeckGood() {
        System.out.println("testShowDeckGood");
        CardFactory cf = new CardFactory();
        GroupOfCards deck = cf.getDeck();
        
       
        
        assertEquals(true,(deck.getCards().size()>0));
    }
    
     @Test
    public void testShowDeckBad() {
        System.out.println("testShoeDeckGood");
        CardFactory cf = new CardFactory();
        GroupOfCards deck = null;
        assertEquals(false,(deck.getCards().size()>0));
    }
    
     @Test
    public void testShowDeckBoundary() {
        System.out.println("testShoeDeckGood");
        CardFactory cf = new CardFactory();
        GroupOfCards deck = new GroupOfCards(1);   
        assertEquals(false,(deck.getCards().size()>0));
       
    }

    /**
     * Test of shuffleCards method, of class War.
     */
    @Test
    public void testShuffleCardsGood() {
        System.out.println("testShuffleCardsGood");
        CardFactory cf = new CardFactory();
        GroupOfCards deck = cf.getDeck();
        Hand hand = new Hand(1);
        assertEquals(hand.playTopCard(), deck.getCards().get(0));
        
    }
    @Test
    public void testShuffleCardsBad() {
        System.out.println("testShuffleCardsBad");
        CardFactory cf = new CardFactory();
        GroupOfCards deck = cf.getDeck();
        Hand hand = new Hand(5);
        assertEquals(hand.playTopCard(), deck.getCards().get(0));
        
    }
    
     @Test
     public void testShuffleCardsBoundary() {
        System.out.println("testShuffleCardsBad");
        CardFactory cf = new CardFactory();
        GroupOfCards deck = cf.getDeck();
        Hand hand = new Hand(2);
        assertEquals(hand.playTopCard(), deck.getCards().get(0));
        
    }

    /**
     * Test of showWar method, of class War.
     */
    @Test
    public void testShowWarGood() {
       System.out.println("testShowWarGood");
        CardFactory cf = new CardFactory();
        GroupOfCards deck = cf.getDeck(); 
        deck.add(new PlayingCard(3,"hears"));
        deck.add(new PlayingCard(3,"spades"));
        deck.add(new PlayingCard(3,"clubs"));
        
        assertEquals(true,(deck.getCards().get(0).getValue().equals(deck.getCards().get(1).getValue()) 
                || deck.getCards().get(0).getValue().equals(deck.getCards().get(1).getValue())));
        
        
    }
     @Test
    public void testShowWarBad() {
       System.out.println("testShowWarBad");
        CardFactory cf = new CardFactory();
        GroupOfCards deck = cf.getDeck();  
        deck.add(new PlayingCard(1,"hears"));
        deck.add(new PlayingCard(2,"spades"));
        deck.add(new PlayingCard(3,"clubs"));
        
        assertEquals(false,(deck.getCards().get(0).getValue().equals(deck.getCards().get(1).getValue()) 
                || deck.getCards().get(0).getValue().equals(deck.getCards().get(1).getValue())));
              
    }
    
     @Test
    public void testShowWarBoundary() {
       System.out.println("testShowWarBad");
        CardFactory cf = new CardFactory();
        GroupOfCards deck = cf.getDeck();  
        deck.add(new PlayingCard(1,"hears"));
        deck.add(new PlayingCard(1,"spades"));
        deck.add(new PlayingCard(2,"clubs"));
        
        assertEquals(true,(deck.getCards().get(0).getValue().equals(deck.getCards().get(1).getValue()) 
                || deck.getCards().get(0).getValue().equals(deck.getCards().get(1).getValue())));
        
        
    }
    
    
}
