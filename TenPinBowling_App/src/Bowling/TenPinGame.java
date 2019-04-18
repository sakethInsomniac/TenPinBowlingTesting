package Bowling;

import java.util.List;
 

/**
 * Class to create a TenPinGame
 */
public class TenPinGame {

    List<Frame> frames;
    int frameCounter = 0;
    final int MAX_SCORE = 300;

    /**
     * Constructor for TenPinGame
     *
     * @param frames no of frames for each TenPinGame
     */
    public TenPinGame(List<Frame> frames) {
        if (frames.size() > 10) {
            throw new RuntimeException("Execeeded the max frames limit");
        } else {
            this.frames = frames;
        }
    }

    /**
     * @return the current frame
     */
    public Frame getCurrentFrame() {
        return frames.get(frameCounter);
    }

    /**
     * @return the next frame of the current frame
     */
    Frame getNextFrame() {
        return frames.get(frameCounter + 1);
    }

    /**
     * @param i index of the frame to be retrieved
     * @return the frame with index i
     */
    Frame getIndexFrame(int i) {
        return frames.get(i);
    }

    /**
     * Calculate the total score of the Ten Pin Game
     *
     * @return
     */
    public int calculateScoresForFrames() {
        int totalScore = 0;

        for (frameCounter = 0; frameCounter < 9; frameCounter++) {
            if (getCurrentFrame().isFrameStrike()) {
                if (getNextFrame().isFrameStrike() && frameCounter < 8) {
                    getCurrentFrame().setBonusScore(getNextFrame().getFirstRollScore()
                            + getIndexFrame(frameCounter + 2).getFirstRollScore());
                } else {
                    getCurrentFrame().setBonusScore(getNextFrame().getFirstRollScore() + getNextFrame().getSecondRollScore());
                }
            } else if (getCurrentFrame().isFrameSpare()) {
                getCurrentFrame().setBonusScore(getNextFrame().getFirstRollScore());
            }

            totalScore += getCurrentFrame().getTotalScore();
        }

        totalScore += getCurrentFrame().getTotalScore();

        if (totalScore > MAX_SCORE) {
            throw new RuntimeException("Invalid final score " + totalScore);
        }

        return totalScore;
    }
}
