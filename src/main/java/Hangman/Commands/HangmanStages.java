package Hangman.Commands;

import java.util.ArrayList;

public class HangmanStages {

    protected static final ArrayList<String> stages = new ArrayList<>();

    static {

        stages.add(
                "____\n" +
                        "|/   |\n" +
                        "|\n" +
                        "|\n" +
                        "|\n" +
                        "|\n" +
                        "|_____\n"
        );
        stages.add(
                "____\n" +
                        "|/   |\n" +
                        "|   (_) \n" +
                        "|\n" +
                        "|\n" +
                        "|\n" +
                        "|_____\n"
        );
        stages.add(
                "____\n" +
                        "|/   |\n" +
                        "|   (_) \n" +
                        "|    |\n" +
                        "|\n" +
                        "|\n" +
                        "|_____\n"
        );
        stages.add(
                "____\n" +
                        "|/   |\n" +
                        "|   (_) \n" +
                        "|   \\| \n" +
                        "|    |\n" +
                        "|\n" +
                        "|_____\n"
        );
        stages.add(
                "____\n" +
                        "|/   |\n" +
                        "|   (_) \n" +
                        "|   \\|/ \n" +
                        "|    |\n" +
                        "|\n" +
                        "|_____\n"
        );
        stages.add(
                "____\n" +
                        "|/   |\n" +
                        "|   (_) \n" +
                        "|   \\|/ \n" +
                        "|    |\n" +
                        "|   / \n" +
                        "|_____\n"
        );
        stages.add(
                "____\n" +
                        "|/   |\n" +
                        "|   (_) \n" +
                        "|   \\|/ \n" +
                        "|    |\n" +
                        "|   / \\\n" +
                        "|_____\n"
        );
        stages.add(
                "____\n" +
                        "|/   |\n" +
                        "|   (_) \n" +
                        "|   /|\\ \n" +
                        "|    |\n" +
                        "|   | |\n" +
                        "|_____\n"
        );
    }

    public static void printHangman(int lives) {
        int index = (stages.size() - 1) - lives;
        if (index >= 0 && index < stages.size()) {
            System.out.println(stages.get(index));
        } else {
            System.out.println("Invalid index");
        }
    }

    public static void printHangman(int lives, HangmanDifficulty difficulty){
        int adjustedLives = lives;
        switch(difficulty){

            case EASY:
                break;
            case NORMAL:
                adjustedLives += 1;
                break;
            case HARD:
                adjustedLives += 2;
                break;
        }
        int index = (stages.size() - 1) - adjustedLives;
        if (index >= 0 && adjustedLives < stages.size()) {
            System.out.println(stages.get(index));
        } else {
            System.out.println("Invalid index");
        }
    }

}
