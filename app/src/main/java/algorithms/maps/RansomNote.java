package algorithms.maps;

import java.util.HashMap;
import java.util.Map;

class RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> r = new HashMap<>();
        for (Character c : ransomNote.toCharArray()) {
            r.put(c, r.getOrDefault(c, 0) + 1);
        }

        Map<Character, Integer> m = new HashMap<>();
        for (Character c : magazine.toCharArray()) {
            m.put(c, m.getOrDefault(c, 0) + 1);
        }

        // for every character in the ransom note
        for (Character c : r.keySet()) {
            // if the magazine has fewer instances
            // of this character than the ransom note
            // then we can't write the ransom note
            if (m.getOrDefault(c, 0) < r.getOrDefault(c, 0)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("a","b")); // false
        System.out.println(canConstruct("aa","ab")); // false
        System.out.println(canConstruct("aa","aab")); // true
    }

}