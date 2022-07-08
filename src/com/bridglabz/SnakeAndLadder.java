package com.bridglabz;

public class SnakeAndLadder {
    static final int LADDER=1;
    static final int SNAKE=2;
    static final int NO_PLAY=0;
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Game !");
        int Position=0;
        int dice=(int)(Math.random()*10)%6+1;
        System.out.println("dice "+dice);
        int OptionCheck=(int)(Math.random()*10)%3;
        System.out.println("Option "+OptionCheck);

        if(OptionCheck==LADDER){
            System.out.println("Ladder");
            Position+=dice;
        }
        else if (OptionCheck==SNAKE ) {
            System.out.println("Snake");
            Position-=dice;
        }
        else {
            System.out.println("No Play");
            Position=Position;
        }
        System.out.println("Position "+Position);
    }
}
