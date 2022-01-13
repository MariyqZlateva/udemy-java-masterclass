package com.zlateva;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Final score was " + highScore);


        int position = calculateHighScoreTable(1000);
        displayHighScorePosition("Nick", position);

        position = calculateHighScoreTable(900);
        displayHighScorePosition("Rick", position);

        position = calculateHighScoreTable(100);
        displayHighScorePosition("Rick", position);

        position = calculateHighScoreTable(50);
        displayHighScorePosition("Rick", position);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playersName, int positionInTable) {
        System.out.println(playersName + " managed to get in to position " + positionInTable + " on the high score table");

    }

    public static int calculateHighScoreTable(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//        return 4;
//    }
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }

}
