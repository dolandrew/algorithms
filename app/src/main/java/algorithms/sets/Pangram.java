package algorithms.sets;

import java.util.HashSet;
import java.util.Set;

class Pangram {

    public static boolean checkIfPangram(String sentence) {
        Set<Character> letters = new HashSet<>();
        for (char c : sentence.toCharArray()) {
            letters.add(c);
        }
        return letters.size() >= 26;

    }

    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        System.out.println(checkIfPangram("leetcode"));
    }

}