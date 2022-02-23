package com.blz.snakeladder;

public class SnakeLadderGame {
    //CONSTANTS
    public static final int SNAKE = 1;
    public static final int LADDER = 2;
    public static int currentPosition = 0;
    public static final int TARGETPOSITION = 100;
    public static int dieCount = 0;
    private static String turn = "player1";

    public static void main(String[] args) {
        int currentPositionOfPlayer1 = currentPosition;
        int currentPositionOfPlayer2 = currentPosition;
        while (currentPositionOfPlayer1 < TARGETPOSITION && currentPositionOfPlayer2 < TARGETPOSITION) {
            dieCount++;
            if (turn.equals("player1")) {
                currentPositionOfPlayer1 = getPosition(currentPositionOfPlayer1);
                turn = "player2";
            } else {
                currentPositionOfPlayer2 = getPosition(currentPositionOfPlayer2);
                turn = "player1";
            }
        }
        System.out.println("Player1 is at " + currentPositionOfPlayer1 + " position and " + dieCount + " times dice was rolled");
        System.out.println("Player2 is at " + currentPositionOfPlayer2 + " position and " + dieCount + " times dice was rolled");
        if (currentPositionOfPlayer1 == TARGETPOSITION) {
            System.out.println("Player1 won the Game");
        } else {
            System.out.println("Player2 won the Game");
        }
    }

    private static int getPosition(int currentPosition) {
        int dieRoll = (int) Math.floor(Math.random() * 10) % 6 + 1;
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
                if (turn.equals("player1")) {
                    turn = "player1";
                    System.out.println("Player1 got the ladder");
                } else if (turn.equals("player2")) {
                    turn = "player2";
                    System.out.println("Player2 got the ladder");
                }
            }
        }
        return currentPosition;
    }
}