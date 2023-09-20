import Hangman.Commands.PlayGame;

public class Main {
    public static void main(String[] args) {

        boolean playAgain;

        do{
            PlayGame.playGame();
            playAgain = PlayGame.playAgain();
        } while(playAgain);

    }

}