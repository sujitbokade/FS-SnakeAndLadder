package com.bridglabz;

public class SnakeAndLadder {
    static final int LADDER=1;
    static final int SNAKE=2;
    static final int NO_PLAY=0;
    static int die=0;
    static final int INITIAL_POSITION=0;
    static final int MAX_POSITION=100;
    static int player1position=0;
    static int player2position=0;

    public enum CurrentPlayer{
        PLAYER1,PLAYER2
    }
    static CurrentPlayer toss(){
        if((int)(Math.random()*10)%2 == 1){
            return CurrentPlayer.PLAYER1;
        }else {
            return CurrentPlayer.PLAYER2;
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Game !");
        CurrentPlayer currentPlayer=toss();
        while (player1position<100 && player2position<100){

            int dice=(int)(Math.random()*10)%6+1;
            int OptionCheck = (int) (Math.random() * 10) % 3;


        switch(OptionCheck){
            case LADDER:
                if (currentPlayer == CurrentPlayer.PLAYER1)
                {
                    player1position += dice;
                    if (player1position > MAX_POSITION) {
                        player1position -= dice;
                    }
                }
                else {
                    player2position += dice;
                    if (player2position > MAX_POSITION) {
                        player2position -= dice;
                    }
                }
                break;
            case SNAKE:
                if (currentPlayer == CurrentPlayer.PLAYER1) {
                    player1position -= dice;
                    if (player1position < INITIAL_POSITION) {
                        player1position = 0;
                    }
                }
                else {
                    player2position -= dice;
                    if (player2position < INITIAL_POSITION) {
                        player2position = 0;
                    }
                }
              currentPlayer=(currentPlayer==CurrentPlayer.PLAYER1)?CurrentPlayer.PLAYER2:CurrentPlayer.PLAYER1;
                break;
            case NO_PLAY:
                currentPlayer=(currentPlayer==CurrentPlayer.PLAYER1)?CurrentPlayer.PLAYER2:CurrentPlayer.PLAYER1;
                break;
            default:
        }
        System.out.println("Current position of player1 is: "+player1position);
        System.out.println("Current position of player2 is: "+player2position);
        die++;
    }
        System.out.println("Total number of times Die roll: "+die);
        System.out.println(currentPlayer + " is Winner ");
}
}