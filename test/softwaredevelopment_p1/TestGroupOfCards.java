/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package softwaredevelopment_p1;

import java.util.ArrayList;
import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author aliab
 */
public class TestGroupOfCards {
    
    @Test
    public void testGetCardsGood(){
        GroupOfCards cards = new GroupOfCards(5);
        PlayingCard card1 = new PlayingCard(14, "diamonds");
        PlayingCard card2 = new PlayingCard(8, "hearts");
        PlayingCard card3 = new PlayingCard(5, "spades");
        PlayingCard card4 = new PlayingCard(7, "clubs");
        PlayingCard card5 = new PlayingCard(12, "hearts");
        ArrayList<PlayingCard> expResult = new ArrayList();
        expResult.add(card1);
        expResult.add(card2);
        expResult.add(card3);
        expResult.add(card4);
        expResult.add(card5);
        cards.addAll(expResult);
        ArrayList<PlayingCard> result = cards.getCards();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetCardsBad(){
        GroupOfCards cards = new GroupOfCards(0);
        ArrayList<PlayingCard> expResult = new ArrayList();
        ArrayList<PlayingCard> result = cards.getCards();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetCardsBoundary(){
        GroupOfCards cards = new GroupOfCards(1);
        PlayingCard card = new PlayingCard(5, "spades");
        cards.add(card);
        ArrayList<PlayingCard> expResult = new ArrayList();
        expResult.add(card);
        ArrayList<PlayingCard> result = cards.getCards();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetSizeGood(){
        GroupOfCards cards = new GroupOfCards(5);
        PlayingCard card1 = new PlayingCard(14, "diamonds");
        PlayingCard card2 = new PlayingCard(8, "hearts");
        PlayingCard card3 = new PlayingCard(5, "spades");
        PlayingCard card4 = new PlayingCard(7, "clubs");
        PlayingCard card5 = new PlayingCard(12, "hearts");
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        int expResult = 5;
        int result = cards.getSize();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetSizeBad(){
        GroupOfCards cards = new GroupOfCards(0);
        int expResult = 0;
        int result = cards.getSize();
        assertEquals(expResult, result);
    }
    
    @Test        
    public void testGetSizeBoundary(){
        GroupOfCards cards = new GroupOfCards(1);
        PlayingCard card = new PlayingCard(5, "diamond");
        cards.add(card);
        int expResult = 1;
        int result = cards.getSize();
        assertEquals(expResult, result);
    }
}
