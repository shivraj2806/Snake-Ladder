package com.Bridgelabz;

public class SnakeLadder {
    public static final int WINNING_POSITION = 100;
    public static int PLAYER_POSITION1 = 0;
    public static int PLAYER_POSITION2 = 0;

    public static void main(String[] args) {
        int count1 = 0;
        int count2 = 0;
        System.out.println("Welcome to the Snake and Ladder Game");

        /**
         * Using while loop to repeat the game till player reaches exact winning
         * position Using Math.random to generate random numbers between 1 to 6
         */
        while (PLAYER_POSITION1 != WINNING_POSITION && PLAYER_POSITION2 != WINNING_POSITION) {
            int Dice1 = (int) (Math.random() * 6 + 1);
            int Dice2 = (int) (Math.random() * 6 + 1);
            count1++;
            count2++;
            System.out.println("The Player's die number is : " + Dice1);
            System.out.println("The Player's die number is : " + Dice2);
            /**
             * Using Math.random() function to generate random between 1 to 3 for user to
             * get options
             */
            int playerCheck1 = (int) Math.floor(Math.random() * 3 + 1);
            int playerCheck2 = (int) Math.floor(Math.random() * 3 + 1);
            switch (playerCheck1) {
                case 0:
                    System.out.println("No play for player1");
                    System.out.println("");
                    break;

                case 1:
                    PLAYER_POSITION1 = PLAYER_POSITION1 + Dice1;

                    if (PLAYER_POSITION1 > WINNING_POSITION) {

                        PLAYER_POSITION1 = PLAYER_POSITION1 - Dice1;
                    }
                    System.out.println("Position of player1 after ladder is: " + PLAYER_POSITION1);
                    System.out.println("");
                    break;

                default:
                    PLAYER_POSITION1 = PLAYER_POSITION1 - Dice1;

                    // Player position will be set to 0, if position is less than 0.
                    if (PLAYER_POSITION1 < 0) {
                        PLAYER_POSITION1 = 0;
                    }
                    System.out.println("Position of player1 after snake  is: " + PLAYER_POSITION1);
                    System.out.println("");
                    break;

            }

            // options for player2
            switch (playerCheck2) {

                case 0:
                    System.out.println("No play for player2");
                    System.out.println("");
                    break;

                case 1:
                    PLAYER_POSITION2 = PLAYER_POSITION2 + Dice2;

                    if (PLAYER_POSITION2 > WINNING_POSITION) {

                        PLAYER_POSITION2 = PLAYER_POSITION2 - Dice2;
                    }
                    System.out.println("Position of player2 after ladder is: " + PLAYER_POSITION2);
                    System.out.println("");
                    break;

                default:
                    PLAYER_POSITION2 = PLAYER_POSITION2 - Dice2;

                    // Player position will be set to 0, if position is less than 0.
                    if (PLAYER_POSITION2 < 0) {
                        PLAYER_POSITION2 = 0;
                    }
                    System.out.println("Position of player2 after snake is: " + PLAYER_POSITION2);
                    System.out.println("");
                    break;
            }
        }

        if (PLAYER_POSITION1 == WINNING_POSITION) {
            System.out.println("Player1 is winner");
            System.out.println("Number of times die rolled by player1: " + count1);
        } else {
            System.out.println("Player2 is winner");
            System.out.println("Number of times die rolled by player1: " + count2);
        }
    }
}