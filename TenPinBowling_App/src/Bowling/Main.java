/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bowling;

/**
 *
 * @author LakshmiSaketh
 */
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final int MAX_FRAMES = 10;

    public static void main(String[] args) {

        List<Bowling.Frame> frames = new ArrayList<>(MAX_FRAMES);
        int totalScore;

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

        TenPinGame tenPinGame = new TenPinGame(frames);
        totalScore = tenPinGame.calculateScoresForFrames();

        System.out.println("Total Score " + totalScore);
    }

}
