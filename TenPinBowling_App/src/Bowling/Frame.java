/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bowling;

/**
 *
 * @author Lakshmi Saketh
 */
public class Frame {

    public Frame() {
    }

    private int firstRollScore;
    private int secondRollScore;
    private int lastRolledScore;
    private final int MAX_SCORE_PER_FRAME = 10;
    private int frameScore = 0;
    private int bonusScore = 0;

    /**
     * A normal Frame with two rolls
     *
     * @param firstRollScore  first roll score
     * @param secondRollScore second roll score
     */
    public Frame(int firstRollScore, int secondRollScore) {
        this.firstRollScore = firstRollScore;
        this.secondRollScore = secondRollScore;
        this.frameScore = firstRollScore + secondRollScore;

        if (this.frameScore > 10) {
            throw new RuntimeException("In between Frame Score Exceeded");
        }
    }

    /**
     * A Frame which is normally the last frame with three rolls
     *
     * @param firstRollScore  first roll score
     * @param secondRollScore second roll score
     * @param lastRolledScore third roll score/last roll score
     */
    public Frame(int firstRollScore, int secondRollScore, int lastRolledScore) {
        this.firstRollScore = firstRollScore;
        this.secondRollScore = secondRollScore;
        this.lastRolledScore = lastRolledScore;
        this.frameScore = firstRollScore + secondRollScore + lastRolledScore;

        if (this.frameScore > 30) {
            throw new RuntimeException("Last Frame Score Exceeded");
        }
    }

    /**
     * @return first roll score of the frame
     */
    public int getFirstRollScore() {
        return this.firstRollScore;
    }

    /**
     * @return second roll score of the frame
     */
    public int getSecondRollScore() {
        return this.secondRollScore;
    }

    /**
     * @return the frame score : firstcsore + secondscore
     */
    public int getFrameScore() {
        return this.frameScore;
    }

    /**
     * @param bonusScore return the bonus score, set only for non last frames.
     */
    public void setBonusScore(int bonusScore) {
        if (this.lastRolledScore != 0) {
            this.bonusScore = 0;
        } else {
            this.bonusScore = bonusScore;
        }
    }

    /**
     * @return get the bonus score of the frame
     */
    public int getBonusScore() {
        return this.bonusScore;
    }

    /**
     * @return total score of the frame
     */
    public int getTotalScore() {
        return getFrameScore() + getBonusScore();
    }

    /**
     * @return true if the frame is a strike, otherwise false
     */
    public boolean isFrameStrike() {
        return firstRollScore == MAX_SCORE_PER_FRAME;
    }

    /**
     * @return true if the frame is a spare, otherwise false
     */
    public boolean isFrameSpare() {
        return !isFrameStrike() && firstRollScore + secondRollScore == MAX_SCORE_PER_FRAME;
    }
}