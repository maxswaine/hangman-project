package Hangman.Commands;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayGame {
    public static void playGame(){
        Hangman.Commands.CaptureGuess newGuess = new Hangman.Commands.CaptureGuess();
        Hangman.Commands.Lives setLives = new Hangman.Commands.Lives();
        Hangman.Commands.CheckInput checkInput = new Hangman.Commands.CheckInput();
        String wordToGuess = Words.generateWord();
        Hangman.Commands.DisplayWord displayWord = new Hangman.Commands.DisplayWord();
        ArrayList<Character> wordToGuessArray = Hangman.Commands.Words.convertWordToArray(wordToGuess);
        boolean gameOver;

        setLives.printDifficulties();
        int lives = setLives.setDifficulty();
        ArrayList<Character> initialDisplay = displayWord.initialDisplay(wordToGuessArray);
        System.out.println(initialDisplay);
        setLives.setLives(lives);
        do {
            ArrayList<Character> charGuess = newGuess.captureGuess();
            displayWord.displayWord(wordToGuessArray, charGuess);
            boolean correctInput = checkInput.checkCorrectInput(wordToGuessArray, charGuess.get(charGuess.size() -1 ), charGuess);
            if (!correctInput){
                setLives.loseOneLife();
                HangmanStages.printHangman(setLives.getLives());
            }
            System.out.println("Lives left: " + setLives.getLives());
            gameOver = checkInput.checkGameOver(wordToGuessArray, charGuess, setLives.getLives(), wordToGuess);
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
