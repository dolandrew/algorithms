package algorithms.arrays;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class LengthOfLongestSubstringTwoDistinct {

    public static int lengthOfLongestSubstringTwoDistinct(String s) {
        // initialize length variable
        int n = s.length();
        // handle edge case
        if (n < 3) {
            return n;
        }

        // initialize left and right pointers
        int left = 0;
        int right = 0;
        // a map to use to keep track of letters we've seen, most recent index
        Map<Character, Integer> letters = new HashMap<>();
        // the answer to return
        int ans = 0;
        // until right pointer reaches end of word
        while (right < n) {
            // keep track of letters and most recent index
            letters.put(s.charAt(right), right);
            // if more than 2 distinct characters
            if (letters.size() == 3) {
                // trim off the left most letter until its most recent index
                int index = Collections.min(letters.values());
                letters.remove(s.charAt(index));
                // move the left pointer to beyond recent index
                left = index + 1;
            }
            // update max if window length is greater than existing max
            ans = Math.max(ans, right - left + 1);
            // move the right pointer forward
            right++;
        }
        return ans;
    }

    public static void main(String[] args) {
//        String input = "eceba";
        String input = "ccaabbb";
        System.out.println(lengthOfLongestSubstringTwoDistinct(input));
    }

}