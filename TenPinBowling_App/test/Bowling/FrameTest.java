/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bowling;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DELL
 */
public class FrameTest {
    
    public FrameTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getFirstRollScore method, of class Frame.
     */
    @Test
    public void testGetFirstRollScore() {
        System.out.println("getFirstRollScore");
        Frame instance = null;
        int expResult = 0;
        int result = instance.getFirstRollScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSecondRollScore method, of class Frame.
     */
    @Test
    public void testGetSecondRollScore() {
        System.out.println("getSecondRollScore");
        Frame instance = null;
        int expResult = 0;
        int result = instance.getSecondRollScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFrameScore method, of class Frame.
     */
    @Test
    public void testGetFrameScore() {
        System.out.println("getFrameScore");
        Frame instance = null;
        int expResult = 0;
        int result = instance.getFrameScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBonusScore method, of class Frame.
     */
    @Test
    public void testSetBonusScore() {
        System.out.println("setBonusScore");
        int bonusScore = 0;
        Frame instance = null;
        instance.setBonusScore(bonusScore);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBonusScore method, of class Frame.
     */
    @Test
    public void testGetBonusScore() {
        System.out.println("getBonusScore");
        Frame instance = null;
        int expResult = 0;
        int result = instance.getBonusScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalScore method, of class Frame.
     */
    @Test
    public void testGetTotalScore() {
        System.out.println("getTotalScore");
        Frame instance = null;
        int expResult = 0;
        int result = instance.getTotalScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

   

   
    
     @Test
    public void testIsFrameStrike() {
        Frame frame = new Frame(10, 0);
        assert frame.isFrameStrike();
    }

    @Test
    public void testIsFrameSpare() {
        Frame frame = new Frame(9, 1);
        assert frame.isFrameSpare();
    }

    @Test
    public void testFrameScore() {
        Frame frame = new Frame(9, 1);
        assert frame.getFrameScore() == 10;

        Frame lastFrame = new Frame(9, 1, 10);
        assert lastFrame.getFrameScore() == 20;
    }

    @Test
    public void testTotalScore() {
        Frame frame = new Frame(9, 1);
        assert frame.getTotalScore() == 10;

        Frame lastFrame = new Frame(9, 1, 10);
        assert lastFrame.getTotalScore() == 20;
    }

    @Test
    public void testFrameAndBonusTotalScore() {
        Frame frame = new Frame(9, 1);
        frame.setBonusScore(9);
        assert frame.getTotalScore() == 19;

        Frame lastFrame = new Frame(9, 1, 10);
        lastFrame.setBonusScore(9);
        assert lastFrame.getTotalScore() != 29;
        assert lastFrame.getTotalScore() == 20;
    }

    @Test
    public void testInvalidFrameTest() {
        boolean thrown = false;
        try {
            Frame frame = new Frame(9, 11);
        } catch (RuntimeException e) {
            thrown = true;
        }
        assert thrown;
    }

    @Test
    public void testInvalidLastFrameTest() {
        boolean thrown = false;
        try {
            Frame frame = new Frame(10, 10, 11);
        } catch (RuntimeException e) {
            thrown = true;
        }
        assert thrown;
    }
    
}
