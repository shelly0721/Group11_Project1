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
public class PlayerTest {
    
    public PlayerTest() {
    }

    /**
     * Test of getName method, of class PlayerTester.
     */
    @Test
    public void testGetNameGood() {
        System.out.println("testGetNameGood");
        PlayerTester player = new PlayerTester("Bob");
        assertEquals(player.getName(), "Bob");
    }
    
    /**
     * Test of getName method, of class PlayerTester.
     */
    @Test
    public void testGetNameBad() {
        System.out.println("testGetNameBad");
        PlayerTester player = new PlayerTester("");
        assertEquals(player.getName(), null);
    }

    /**
     * Test of getName method, of class PlayerTester.
     */
    @Test
    public void testGetNameBoundary() {
        System.out.println("testGetNameBoundary");
        PlayerTester player = new PlayerTester("1");
        assertEquals(player.getName(), "1");
    }
    /**
     * Test of setName method, of class PlayerTester.
     */
    @Test
    public void testSetName() {
    }

    /**
     * Test of setScore method, of class PlayerTester.
     */
    @Test
    public void testSetScore() {
    }

    /**
     * Test of getScore method, of class PlayerTester.
     */
    @Test
    public void testGetScore() {
    }

    /**
     * Test of showScore method, of class PlayerTester.
     */
    @Test
    public void testShowScore() {
    }

    /**
     * Test of clearStreak method, of class PlayerTester.
     */
    @Test
    public void testClearStreak() {
    }

    /**
     * Test of addStreak method, of class PlayerTester.
     */
    @Test
    public void testAddStreak() {
    }

    /**
     * Test of getStreak method, of class PlayerTester.
     */
    @Test
    public void testGetStreak() {
    }

    /**
     * Test of addToHand method, of class PlayerTester.
     */
    @Test
    public void testAddToHand() {
    }

    /**
     * Test of getHand method, of class PlayerTester.
     */
    @Test
    public void testGetHand() {
    }

    /**
     * Test of getDiscardPile method, of class PlayerTester.
     */
    @Test
    public void testGetDiscardPile() {
    }

    /**
     * Test of playCard method, of class PlayerTester.
     */
    @Test
    public void testPlayCard() {
    }

    /**
     * Test of announceWin method, of class PlayerTester.
     */
    @Test
    public void testAnnounceWin() {
    }

    /**
     * Test of announceLoss method, of class PlayerTester.
     */
    @Test
    public void testAnnounceLoss() {
    }
    
}
