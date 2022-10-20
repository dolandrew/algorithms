package algorithms.string;

import java.util.HashMap;
import java.util.Map;

class RomanToInteger {

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int n = s.length();

        // edge case
        if (n == 1) {
            return map.get(s);
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            int curr = map.get(s.charAt(i));

            // if this the last character, just add it and done
            if (i == n -1) {
                return result + curr;
            }

            // otherwise get the next character's value
            int next = map.get(s.charAt(i+1));

            // if next character is smaller or equal , just add it
            if (curr >= next){
                result += curr;
            }// otherwise subtract it from the total
            else {
                result -= curr;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV")); //1994
//        System.out.println(romanToInt("LVIII")); //58
    }

}