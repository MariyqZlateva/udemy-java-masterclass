package com.zlateva;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        //        if (score < 5000 && score > 1000) {
        //            System.out.println("Your score was less than 5000 but greater than 1000");
        //        }else if(score < 1000){
        //            System.out.println("Your score is less than 1000");
        //        } else {
        //            System.out.println("Got here");
        //        }
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Final score was "+ finalScore );
        }
            score = 1000;
            levelCompleted = 8;
            bonus = 200;

        if (gameOver) {
            int secondScore = score + (levelCompleted * bonus);
            System.out.println("Second score was "+ secondScore );
        }
    }
}
