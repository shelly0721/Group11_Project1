/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package softwaredevelopment_p1Testing;

import softwaredevelopment_p1.*;
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
     * Test of showDeck method, of class HandTester.
     */
    @Test
    public void testShowDeckGood() {
        System.out.println("testShowDeckGood");
        CardFactoryTester cf = new CardFactoryTester();
        GroupOfCardsTester deck = cf.getDeck();
        HandTester hand = new HandTester(0);
        //add multiple cards to HandTester
        hand.add(deck.getCards().get(0));

        //Top Card in the deck and playTopCard should still be the same card
        assertEquals(hand.showDeck(), true);
    }
    
        /**
     * Test of showDeck method, of class HandTester.
     */
    @Test
    public void testShowDeckBad() {
        System.out.println("testShowDeckGood");
        CardFactoryTester cf = new CardFactoryTester();
        GroupOfCardsTester deck = cf.getDeck();
        HandTester hand = new HandTester(0);
        //Top Card in the deck and playTopCard should still be the same card
        assertEquals(hand.showDeck(), false);
    }

    /**
     * Test of playTopCard method, of class HandTester.
     */
    @Test
    public void testPlayTopCardGood() {
        System.out.println("testPlayTopCardGood");
        CardFactoryTester cf = new CardFactoryTester();
        GroupOfCardsTester deck = cf.getDeck();
        HandTester hand = new HandTester(0);
        //add multiple cards to HandTester
        hand.add(deck.getCards().get(0));
        hand.add(deck.getCards().get(1));
        hand.add(deck.getCards().get(2));
        //Top Card in the deck and playTopCard should still be the same card
        assertEquals(hand.playTopCard(), deck.getCards().get(0));
    }
    /**
     * Test of playTopCard method, of class HandTester.
     */
    @Test
    public void testPlayTopCardBad() {
        System.out.println("testPlayTopCardBad");
        HandTester hand = new HandTester(0);
        
        //Top Card in the deck and playTopCard should still be the same card
        assertEquals(hand.playTopCard(), null);
    }
    
    /**
     * Test of playTopCard method, of class HandTester.
     */
    @Test
    public void testPlayTopCardBoundary() {
        System.out.println("testPlayTopCardBoundary");
        CardFactoryTester cf = new CardFactoryTester();
        GroupOfCardsTester deck = cf.getDeck();
        HandTester hand = new HandTester(0);
        //add multiple cards to HandTester
        hand.add(deck.getCards().get(0));

        //Top Card in the deck and playTopCard should still be the same card
        assertEquals(hand.playTopCard(), deck.getCards().get(0));
    }

    /**
     * Test of shuffleCards method, of class HandTester.
     */
    @Test
    public void testShuffleCards() {
    }
    
}
