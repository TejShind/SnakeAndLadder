package com.blz.snakeladder;

public class SnakeLadderGame {
    //CONSTANTS
    public static final int SNAKE = 1;
    public static final int LADDER = 2;

    public static void main(String[] args) {

        //VARIABLES
        int currentPosition = 0;
        int dieRoll = (int) Math.floor(Math.random() * 10) % 6 + 1;
        int chooseOption = (int) Math.floor(Math.random() * 10) % 3;

        switch (chooseOption) {
            case SNAKE -> currentPosition -= dieRoll;
            case LADDER -> currentPosition += dieRoll;
            default -> {
                currentPosition += 0;
                System.out.println("NO PLAY");
            }

        }
        System.out.println("Player is at " + currentPosition + "  position");
    }
}

