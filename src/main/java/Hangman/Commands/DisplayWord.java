package Hangman.Commands;

import java.util.ArrayList;

public class DisplayWord {
    ArrayList<Character> displayArray = new ArrayList<>();

    public ArrayList<Character> initialDisplay(ArrayList<Character> wordToGuess) {
        for (int i = 0; i < wordToGuess.size(); i++) {
            displayArray.add('_');
        }
        return displayArray;
    }

    public void displayWord(ArrayList<Character> wordToGuess, ArrayList<Character> userGuesses) {
        for (int i = 0; i < wordToGuess.size(); i++) {
            char currentChar = wordToGuess.get(i);
            if (userGuesses.contains(currentChar)) {
                displayArray.set(i, currentChar);
            }
        }

        System.out.println(displayArray);

    }
}
