package com.blz.snakeladder;

public class SnakeLadderGame {
    //CONSTANTS
    public static final int SNAKE = 1;
    public static final int LADDER = 2;
    public static final int TARGETPOSITION = 100;

    public static void main(String[] args) {

        //VARIABLES
        int currentPosition = 0;
        int dieCount = 0;

        while (currentPosition != TARGETPOSITION) {
            //VARIABLES
            int dieRoll = (int) Math.floor(Math.random() * 10) % 6 + 1;
            dieCount++;
            int chooseOption = (int) Math.floor(Math.random() * 10) % 3;

            switch (chooseOption) {
                case SNAKE -> {
                    currentPosition -= dieRoll;
                    currentPosition = Math.max(currentPosition, 0);
                    System.out.println("Snake option and player is at " + currentPosition);
                }
                case LADDER -> {
                    currentPosition += dieRoll;
                    currentPosition = currentPosition > 100 ? currentPosition -= dieRoll : currentPosition;
                    System.out.println("Ladder option and player is at " + currentPosition);
                }

                default -> {
                    currentPosition += 0;
                    System.out.println("No Play option and player is at " + currentPosition);

                }

            }
            System.out.println("Player won at " + currentPosition + " position");
            System.out.println("dice was rolled " + dieCount + " times");
        }

    }
}