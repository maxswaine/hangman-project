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

    public int setDifficulty() {
        Scanner getInteger = new Scanner(System.in);
        int commandInteger;
        do {
            while (!getInteger.hasNextInt()) {
                System.out.println("Please enter a valid integer.");
                getInteger.next();
            }
            commandInteger = getInteger.nextInt();
        } while (commandInteger < 0 || commandInteger >= chooseDifficulty.length + 1);
        switch (commandInteger) {
            case 1:
                return 8;
            case 2:
                return 5;
            case 3:
                return 3;
            default:
                return 0;
        }
    }
}
