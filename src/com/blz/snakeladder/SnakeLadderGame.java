package com.blz.snakeladder;

public class SnakeLadderGame {
    //CONSTANTS
    public static final int SNAKE = 1;
    public static final int LADDER = 2;
    public static final int TARGETPOSITION = 100;

    public static void main(String[] args) {

        //VARIABLES
        int currentPosition = 0;

        while (currentPosition != TARGETPOSITION) {
            //VARIABLES
            int dieRoll = (int) Math.floor(Math.random() * 10) % 6 + 1;
            int chooseOption = (int) Math.floor(Math.random() * 10) % 3;

            switch (chooseOption) {
                case SNAKE -> {
                    currentPosition -= dieRoll;
                    currentPosition = Math.max(currentPosition, 0);
                }

                case LADDER -> {
                    currentPosition += dieRoll;
                    currentPosition = currentPosition > 100 ? currentPosition -= dieRoll : currentPosition;
                }

                default -> {
                    currentPosition += 0;
                    System.out.println("NO PLAY");
                }

            }
            System.out.println("Player is at " + currentPosition + "  position");
        }
    }

}