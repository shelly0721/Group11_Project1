/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package softwaredevelopment_p1;

import java.util.ArrayList;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;


/**
 *
 * @author douga
 */
public class PlayingCardTest {
    
    public PlayingCardTest() {
    }

    /**
     * Test of getValue method, of class PlayingCard.
     */
    @Test
    public void testGetValue() {
        PlayingCard card = new PlayingCard(5, "spades");
        String expResult = "5";
        String result = card.getValue();
        assertEquals(expResult, result);
    }

    /**
     * Test of getsuit method, of class PlayingCard.
     */
    @Test
    public void testGetsuit() {
        PlayingCard card = new PlayingCard(7, "clubs");
        String expResult = "clubs";
        String result = card.getsuit();
        assertEquals(expResult, result);
    }

    /**
     * Test of compareTo method, of class PlayingCard.
     */
    @Test
    public void testCompareToGood() {
        PlayingCard card1 = new PlayingCard(9, "clubs");
        PlayingCard card2 = new PlayingCard(6, "diamonds");
        int expResult = 1;
        int result = card1.compareTo(card2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCompareToBad() {
        PlayingCard card1 = new PlayingCard(2, "hearts");
        PlayingCard card2 = new PlayingCard(6, "spades");
        int expResult = -1;
        int result = card1.compareTo(card2);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCompareToBoundary() {
        PlayingCard card1 = new PlayingCard(6, "hearts");
        PlayingCard card2 = new PlayingCard(6, "diamonds");
        int expResult = 0;
        int result = card1.compareTo(card2);
        assertEquals(expResult, result);
    }

    /**
     * Test of compareCards method, of class PlayingCard.
     */
    @Test
    public void testCompareCardsGood() {
        PlayingCard card = new PlayingCard(5, "spades");
        PlayingCard card1 = new PlayingCard(3, "diamonds");
        PlayingCard card2 = new PlayingCard(8, "spades");
        PlayingCard card3 = new PlayingCard(8, "hearts");
        PlayingCard card4 = new PlayingCard(6, "clubs");
        ArrayList<PlayingCard> cardList = new ArrayList();
        cardList.add(card1);
        cardList.add(card2);
        cardList.add(card3);
        cardList.add(card4);
        ArrayList<PlayingCard> expResult = new ArrayList();
        expResult.add(card2);
        expResult.add(card3);
        ArrayList<PlayingCard> result = card.compareCards(cardList);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCompareCardsBad() {
        PlayingCard card = new PlayingCard(5, "spades");
        ArrayList<PlayingCard> cardList = new ArrayList();
        ArrayList<PlayingCard> expResult = new ArrayList();
        ArrayList<PlayingCard> result = card.compareCards(cardList);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCompareCardsBoundary() {
        PlayingCard card = new PlayingCard(5, "spades");
        PlayingCard card1 = new PlayingCard(5, "diamonds");
        ArrayList<PlayingCard> cardList = new ArrayList();
        cardList.add(card1);
        ArrayList<PlayingCard> expResult = new ArrayList();
        expResult.add(card1);
        ArrayList<PlayingCard> result = card.compareCards(cardList);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPlayer method, of class PlayingCard.
     */
    @Test
    public void testGetPlayerGood() {
        PlayingCard card = new PlayingCard(7, "clubs");
        Player player = new Player("Ali");
        card.setPlayer(player);
        Player expResult = player;
        Player result = card.getPlayer();
        assertEquals(expResult, result);
    }
    
    public void testGetPlayerBad() {
        PlayingCard card = new PlayingCard(7, "clubs");
        Player expResult = null;
        Player result = card.getPlayer();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPlayer method, of class PlayingCard.
     */
    @Test
    public void testSetPlayer() {
        PlayingCard card = new PlayingCard(7, "clubs");
        Player player = new Player("Ali");
        card.setPlayer(player);
        Player expResult = player;
        Player result = card.getPlayer();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class PlayingCard.
     */
    @Test
    public void testToString() {
        PlayingCard card = new PlayingCard(14, "diamonds");
        String expResult = "Ace of diamonds";
        String result = card.toString();
        assertEquals(expResult, result);
    }
    
}
