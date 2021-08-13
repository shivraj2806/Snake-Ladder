package com.Bridgelabz;

public class SnakeLadder {
    public static void main(String[] args) {
        System.out.println("Welcome To Snake and Ladder Game");
        int start_Position=0;
        int ladder=1;
        int snake=2;
        int no_play=3;
        System.out.println("single player started at position 0"+start_Position);

        int Dice=(int)(Math.floor(Math.random()*10)% 6+1 );
        System.out.println("print random number"+Dice);

        int player_check=(int)(Math.floor(Math.random()*10)%3+1);
        switch(player_check){
            case 1:
                start_Position = start_Position + Dice;
                System.out.println("player position is"+start_Position);
                break;
            case 2:
                start_Position=start_Position-Dice;
                System.out.println("player position is:"+start_Position);
                break;
            case 3:
                start_Position=0;
                System.out.println("player position is:"+start_Position);


        }

    }
}
