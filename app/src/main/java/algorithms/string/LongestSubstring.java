package algorithms.string;

import java.util.HashMap;
import java.util.Map;

class LongestSubstring {


    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> counts = new HashMap<>();
        int max = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            counts.put(c, counts.getOrDefault(c, 0) + 1);
            while (left <= right && counts.getOrDefault(c, 0) > 1) {
                counts.put(s.charAt(left), counts.get(s.charAt(left)) - 1);
                left++;
            }
            max = Math.max(max, right - left + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew")); //3
    }

}