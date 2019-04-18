/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bowling;

import java.util.ArrayList;
import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author DELL
 */
public class TenPinGameTest {

    public TenPinGameTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    private static final int MAX_FRAMES = 10;

    @Test
    public void testMixFrames() {
        List<Frame> frames = new ArrayList<>(MAX_FRAMES);
        int totalScore = 0;

        frames.add(new Bowling.Frame(10, 0));
        frames.add(new Bowling.Frame(7, 1));
        frames.add(new Bowling.Frame(9, 1));
        frames.add(new Bowling.Frame(8, 1));
        frames.add(new Bowling.Frame(10, 0));
        frames.add(new Bowling.Frame(7, 1));
        frames.add(new Bowling.Frame(9, 1));
        frames.add(new Bowling.Frame(8, 1));
        frames.add(new Bowling.Frame(6, 4));
        frames.add(new Bowling.Frame(9, 1, 10));

        totalScore = new TenPinGame(frames).calculateScoresForFrames();

        assert totalScore == 145;
    }

    @Test
    public void testAllStrikes() {
        List<Frame> frames = new ArrayList<>(MAX_FRAMES);
        int totalScore = 0;

        frames.add(new Bowling.Frame(10, 0));
        frames.add(new Bowling.Frame(10, 0));
        frames.add(new Bowling.Frame(10, 0));
        frames.add(new Bowling.Frame(10, 0));
        frames.add(new Bowling.Frame(10, 0));
        frames.add(new Bowling.Frame(10, 0));
        frames.add(new Bowling.Frame(10, 0));
        frames.add(new Bowling.Frame(10, 0));
        frames.add(new Bowling.Frame(10, 0));
        frames.add(new Bowling.Frame(10, 10, 10));

        totalScore = new TenPinGame(frames).calculateScoresForFrames();

        assert totalScore == 300;
    }

    @Test
    public void testAllSpares() {
        List<Frame> frames = new ArrayList<>(MAX_FRAMES);
        int totalScore = 0;

        frames.add(new Bowling.Frame(9, 1));
        frames.add(new Bowling.Frame(9, 1));
        frames.add(new Bowling.Frame(9, 1));
        frames.add(new Bowling.Frame(9, 1));
        frames.add(new Bowling.Frame(9, 1));
        frames.add(new Bowling.Frame(9, 1));
        frames.add(new Bowling.Frame(9, 1));
        frames.add(new Bowling.Frame(9, 1));
        frames.add(new Bowling.Frame(9, 1));
        frames.add(new Bowling.Frame(9, 1, 10));

        totalScore = new TenPinGame(frames).calculateScoresForFrames();

        assert totalScore == 191;
    }

    @Test
    public void testSparesStrikes() {
        List<Frame> frames = new ArrayList<>(MAX_FRAMES);
        int totalScore = 0;

        frames.add(new Frame(10, 0));
        frames.add(new Frame(9, 1));
        frames.add(new Frame(10, 0));
        frames.add(new Frame(9, 1));
        frames.add(new Frame(10, 0));
        frames.add(new Frame(9, 1));
        frames.add(new Frame(10, 0));
        frames.add(new Frame(9, 1));
        frames.add(new Frame(10, 0));
        frames.add(new Frame(9, 1, 10));

        totalScore = new TenPinGame(frames).calculateScoresForFrames();

        assert totalScore == 200;
    }

    @Test
    public void testExceedFrameLimit() {
        boolean thrown = false;
        try {
            List<Frame> frames = new ArrayList<>(MAX_FRAMES);

            frames.add(new Frame(10, 0));
            frames.add(new Frame(9, 1));
            frames.add(new Frame(10, 0));
            frames.add(new Frame(9, 1));
            frames.add(new Frame(10, 0));
            frames.add(new Frame(9, 1));
            frames.add(new Frame(10, 0));
            frames.add(new Frame(9, 1));
            frames.add(new Frame(10, 0));
            frames.add(new Frame(10, 0));
            frames.add(new Frame(9, 1, 10));

            TenPinGame tenPinGame = new TenPinGame(frames);
        } catch (RuntimeException e) {
            thrown = true;
        }

        assert thrown;
    }

}
