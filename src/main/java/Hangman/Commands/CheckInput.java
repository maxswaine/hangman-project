package Hangman.Commands;

import java.util.ArrayList;

public class CheckInput {

    private boolean gameOver = false;

    public boolean checkGameOver(ArrayList<Character> wordToGuess, ArrayList<Character> guessArray, int lives, String word) {
        if (guessArray.containsAll(wordToGuess)) {
            gameOver = true;
            System.out.println("You win!!");
        } else if (lives == 0) {
            gameOver = true;
            System.out.println("You lose, LOSER!");
            System.out.println("The word you were trying to guess was: "+ word);
        }
        return gameOver;
    }

    public boolean checkCorrectInput(ArrayList<Character> wordToGuess, char charGuess, ArrayList<Character> guessArray) {
        return wordToGuess.contains(charGuess);
    }
}

