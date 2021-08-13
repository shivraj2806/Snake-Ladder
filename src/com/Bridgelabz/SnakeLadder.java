package com.Bridgelabz;

public class SnakeLadder{
    public static final int WINNING_POSITION = 100;
    public static int PLAYER_POSITION = 0;

    public static void main(String[] args) {
        int ladder = 1;
        int snake = 2;
        int noPlay = 3;
        System.out.println("Welcome to the Snake and Ladder Game");


        // Using while loop to repeat the game till player reaches exact winning
        // position Using Math.random to generate random numbers between 1 to 6

        while (PLAYER_POSITION < WINNING_POSITION) {
            int Dice = (int) (Math.random() * 6 + 1);
            System.out.println("The Player's die number is : " + Dice);


            //Using Math.random() function to generate random between 1 to 3 for user to
            //get options

            int playerCheck = (int) Math.floor(Math.random() * 3 + 1);

            switch (playerCheck) {
                case 1:
                    PLAYER_POSITION = PLAYER_POSITION + Dice;
                    System.out.println("The player position after ladder is :" + PLAYER_POSITION);
                    break;
                case 2:
                    PLAYER_POSITION = PLAYER_POSITION - Dice;
                    System.out.println("The player position after snake is :" + PLAYER_POSITION);
                    break;
                case 3:
                    PLAYER_POSITION = 0;
                    System.out.println("There is no play and the player position is :" + PLAYER_POSITION);


                    // The player position will be set to zero if the player goes below zero


                    if (PLAYER_POSITION < 0) {
                        System.out.println("You need to start again from starting position");
                        PLAYER_POSITION = 0;
                    }
            }

        }
    }
}