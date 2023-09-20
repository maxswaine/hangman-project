package Hangman.Commands;

import java.util.ArrayList;
import java.util.Scanner;

public class CaptureGuess {
    private ArrayList<Character> guessArray = new ArrayList<>();

    public ArrayList<Character> captureGuess() {
        Scanner characterGuess = new Scanner(System.in);
        char charGuess = 0;

        while (true) {
            System.out.println("Guess a letter:");
            String guess = characterGuess.nextLine().toLowerCase();
            if (guess.length() != 1 || !guess.matches("[a-zA-Z]")) {
                System.out.println("Please input a valid, singular alphabet character");
            } else {
                charGuess = guess.charAt(0);
                if (guessArray.contains(charGuess)) {
                    System.out.println("You already guessed '" + charGuess + "'. Please guess again.");
                    System.out.println("Your guesses: " + guessArray);
                } else {
                    guessArray.add(charGuess);
                    System.out.println("Your guesses: " + guessArray);
                    break;
                }
            }
        }

        return guessArray;
    }
}
