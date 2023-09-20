package Hangman.Commands;

import java.util.Scanner;

public class Lives {
    private String[] chooseDifficulty = new String[]{"Easy", "Normal", "Hard"};
    private int lives;

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void loseOneLife() {
        lives--;
    }


    public void printDifficulties() {
        System.out.println("Choose your difficulty: ");
        for (int i = 0; i < chooseDifficulty.length; i++) {
            System.out.println((i + 1) + ": " + chooseDifficulty[i]);
        }

    }
    public HangmanDifficulty setDifficulty() {
        Scanner getInteger = new Scanner(System.in);
        int commandInteger;

        do {
            while (!getInteger.hasNextInt()) {
                System.out.println("Please enter a valid integer.");
                getInteger.next();
            }
            commandInteger = getInteger.nextInt();
        } while (commandInteger < 1 || commandInteger > chooseDifficulty.length);

        switch (commandInteger) {
            case 1:
                return HangmanDifficulty.EASY;
            case 2:
                return HangmanDifficulty.NORMAL;
            case 3:
                return HangmanDifficulty.HARD;
            default:
                return null;
        }
    }
}

