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
public class HandTest {
    
    public HandTest() {
    }
    /**
     * RETURNS VOID METHOD
     */
//    /**
//     * Test of showDeck method, of class Hand.
//     */
//    @Test
//    public void testShowDeckGood() {
//        System.out.println("testShoeDeckGood");
//        CardFactory cf = new CardFactory();
//        GroupOfCards deck = new GroupOfCards(52);
//        Hand hand = new Hand(0);
//        hand.add(deck.getCards().get(0));
//        //Printing method, only returns void
//    }
//    
//     @Test
//    public void testShowDeckBad() {
//        System.out.println("testShoeDeckGood");
//        CardFactory cf = new CardFactory();
//        GroupOfCards deck = null;
//        assertEquals(false,(deck.getCards().size()>0));
//    }
//    
//     @Test
//    public void testShowDeckBoundary() {
//        System.out.println("testShoeDeckGood");
//        CardFactory cf = new CardFactory();
//        GroupOfCards deck = new GroupOfCards(1);   
//        assertEquals(false,(deck.getCards().size()>0));
//       
//       
//        
//        assertEquals(true,(deck.getCards().size()>0));
//    }

    /**
     * Test of playTopCard method, of class Hand.
     */
    @Test
    public void testPlayTopCardGood() {
        System.out.println("testPlayTopCardGood");
        CardFactory cf = new CardFactory();
        GroupOfCards deck = cf.getDeck();
        Hand hand = new Hand(0);
        //add multiple cards to Hand
        hand.add(deck.getCards().get(0));
        hand.add(deck.getCards().get(1));
        hand.add(deck.getCards().get(2));
        //Top Card in the deck and playTopCard should still be the same card
        assertEquals(hand.playTopCard(), deck.getCards().get(0));
    }
    /**
     * Test of playTopCard method, of class Hand.
     */
    @Test
    public void testPlayTopCardBad() {
        System.out.println("testPlayTopCardBad");
        Hand hand = new Hand(0);
        
        //Top Card in the deck and playTopCard should still be the same card
        assertEquals(hand.playTopCard(), null);
    }
    
    /**
     * Test of playTopCard method, of class Hand.
     */
    @Test
    public void testPlayTopCardBoundary() {
        System.out.println("testPlayTopCardBoundary");
        CardFactory cf = new CardFactory();
        GroupOfCards deck = cf.getDeck();
        Hand hand = new Hand(0);
        //add multiple cards to Hand
        hand.add(deck.getCards().get(0));

        //Top Card in the deck and playTopCard should still be the same card
        assertEquals(hand.playTopCard(), deck.getCards().get(0));
    }

    /**
     * RETURNS VOID METHOD
     */
//    /**
//     * Test of shuffleCards method, of class Hand.
//     */
//    @Test
//    public void testShuffleCardsGood() {
//        System.out.println("testShuffleCardsGood");
//        CardFactory cf = new CardFactory();
//        GroupOfCards deck = cf.getDeck();
//        Hand hand = new Hand(1);
//        assertEquals(hand.playTopCard(), deck.getCards().get(0));
//        
//    }
//    @Test
//    public void testShuffleCardsBad() {
//        System.out.println("testShuffleCardsBad");
//        CardFactory cf = new CardFactory();
//        GroupOfCards deck = cf.getDeck();
//        Hand hand = new Hand(5);
//        assertEquals(hand.playTopCard(), deck.getCards().get(0));
//        
//    }
//    
//     @Test
//     public void testShuffleCardsBoundary() {
//        System.out.println("testShuffleCardsBad");
//        CardFactory cf = new CardFactory();
//        GroupOfCards deck = cf.getDeck();
//        Hand hand = new Hand(2);
//        assertEquals(hand.playTopCard(), deck.getCards().get(0));
//        
//    }
    
}
