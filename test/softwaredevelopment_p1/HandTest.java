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
     * Test of showDeck method, of class Hand.
     */
    @Test
    public void testShowDeck() {
        
    }

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
     * Test of shuffleCards method, of class Hand.
     */
    @Test
    public void testShuffleCards() {
    }
    
}
