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
}
