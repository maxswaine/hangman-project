package Hangman.Commands;

public enum HangmanDifficulty {
    EASY(8), NORMAL(5), HARD(3);


    private final int lives;

    HangmanDifficulty(int lives) {
        this.lives = lives;
    }

    public int getLives() {
        return lives;
    }

}
