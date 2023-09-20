package Hangman.Commands;

import java.util.ArrayList;
import java.util.Random;

public class Words {
    private static ArrayList<String> words = new ArrayList<>();


    static {
        words.add("envelope");
        words.add("there");
        words.add("cat");
        words.add("impact");
        words.add("sugar");
        words.add("swipe");
        words.add("is");
        words.add("conspiracy");
        words.add("senior");
        words.add("lane");
        words.add("swim");
        words.add("incongruous");
        words.add("monster");
        words.add("cabin");
        words.add("tolerant");
        words.add("spokesperson");
        words.add("chord");
        words.add("bishop");
        words.add("beer");
        words.add("integrated");
        words.add("lack");
        words.add("exchange");
        words.add("candidate");
        words.add("noble");
        words.add("nology");
        words.add("craftsman");
        words.add("general");
        words.add("slime");
        words.add("sip");
        words.add("other");
        words.add("level");
        words.add("judgment");
        words.add("thirsty");
        words.add("absent");
        words.add("rate");
        words.add("painter");
        words.add("embox");
        words.add("monkey");
        words.add("pool");
        words.add("automatic");
        words.add("lobby");
        words.add("road");
        words.add("think");
        words.add("constituency");
        words.add("knowledge");
        words.add("notion");
        words.add("underline");
        words.add("season");
        words.add("electron");
        words.add("current");
        words.add("alive");
        words.add("stadium");
    }

    public static String generateWord() {
        Random rand = new Random();
        int randomIndex = rand.nextInt(words.size());
        return words.get(randomIndex);
    }

    public static ArrayList<Character> convertWordToArray(String generatedWord) {
        String wordToGuess = generateWord();
        ArrayList<Character> wordToArray = new ArrayList<>();
        for (int i = 0; i < wordToGuess.length(); i++) {
            wordToArray.add(wordToGuess.charAt(i));
        }
        return wordToArray;
    }
}
