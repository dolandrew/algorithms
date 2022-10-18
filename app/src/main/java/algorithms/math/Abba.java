package algorithms.math;

import java.util.HashMap;
import java.util.Map;

class Abba {

    public static boolean wordPattern(String pattern, String s) {
        Map<String, String> lettersToWords = new HashMap<>();
        Map<String, String> wordsToLetters = new HashMap<>();
        String[] words = s.split(" ");
        char[] characters = pattern.toCharArray();
        if (words.length != characters.length) {
            return false;
        }
        for (int i = 0; i < characters.length; i++) {
            String letter = characters[i] + "";
            String word = words[i];
            if (lettersToWords.get(letter) != null) {
                System.out.println(lettersToWords.get(letter));
                System.out.println(word);
                if (!word.equals(lettersToWords.get(letter))) {
                    return false;
                }
            } else {
                lettersToWords.put(letter, word);
            }
            if (wordsToLetters.get(word) != null) {
                System.out.println(lettersToWords.get(letter));
                System.out.println(word);
                if (!letter.equals(wordsToLetters.get(word))) {
                    return false;
                }
            } else {
                wordsToLetters.put(word, letter);
            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog dog dog dog"));
    }


}