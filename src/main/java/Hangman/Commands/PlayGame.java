package Hangman.Commands;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayGame {
    public static void playGame(){
        CaptureGuess newGuess = new CaptureGuess();
        Lives setLives = new Lives();
        CheckInput checkInput = new CheckInput();
        String wordToGuess = Words.generateWord();
        DisplayWord displayWord = new DisplayWord();
        ArrayList<Character> wordToGuessArray = Words.convertWordToArray(wordToGuess);
        boolean gameOver;

        setLives.printDifficulties();
        HangmanDifficulty difficulty = setLives.setDifficulty();
        int lives = difficulty.getLives();
        System.out.println(wordToGuessArray.toString());
        ArrayList<Character> initialDisplay = displayWord.initialDisplay(wordToGuessArray);
        System.out.println(initialDisplay);
        setLives.setLives(lives);
        do {
            ArrayList<Character> charGuess = newGuess.captureGuess();
            displayWord.displayWord(wordToGuessArray, charGuess);
            boolean correctInput = checkInput.checkCorrectInput(wordToGuessArray, charGuess.get(charGuess.size() -1 ), charGuess);
            if (!correctInput){
                setLives.loseOneLife();
                HangmanStages.printHangman(setLives.getLives(), difficulty);
            }
            System.out.println("Lives left: " + setLives.getLives());
            gameOver = checkInput.checkGameOver(wordToGuessArray, charGuess, setLives.getLives());
        } while (!gameOver);
    }
    public static boolean playAgain(){
        Scanner scanner = new Scanner(System.in);
        String choice;
        do{
            System.out.println("Do you want to play again? (y/n)");
            choice = scanner.nextLine().toLowerCase();
        } while (!choice.equals("y") && !choice.equals("n"));
        if (choice.equals("y")){
            System.out.println("Okay lets do it!");
            return true;
        } else{
            System.out.println("Thanks for playing! See you next time");
            return false;
        }
    }
}
