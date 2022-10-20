package algorithms.maps;

import java.util.HashMap;
import java.util.Map;

class CountBalloons {

    public static int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : text.toCharArray()) {
            if ("balloon".indexOf(c) >= 0) {
                map.put(c, map.getOrDefault(c, 0) +1);
            }
        }

        if (map.size() < 5) {
            return 0;
        }

        int max = Math.min(map.getOrDefault('o', 0), map.getOrDefault('l', 0)) /2;

        for (Character c : map.keySet()) {
            max = Math.min(max, map.get(c));
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxNumberOfBalloons("leetcode"));
    }

}