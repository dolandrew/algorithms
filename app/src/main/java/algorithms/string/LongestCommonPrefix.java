package algorithms.string;

class LongestCommonPrefix {



    public static void main(String[] args) {
        String[] arg = {"cir", "car"};
        System.out.println(longestCommonPrefix(arg));
    }

    public static String longestCommonPrefix(String[] strs) {
        String ans = "";
        String compare = null;
        if (strs.length == 1) {
            return strs[0];
        }
        boolean over = false;
        int i = 0;
        while (!over){
            for (int j = 0; j < strs.length; j++) {
                String word = strs[j];
                if (word.length() <= i) {
                    return ans;
                }
                String letter = ""+word.charAt(i);
                if (compare != null) {
                    if (!letter.equals(compare)) {
                        compare = null;
                        over = true;
                        break;
                    }
                }
                compare = letter;
            }
            if (compare != null) {
                ans += compare;
                compare = null;
            }
            i++;
        }
        return ans;
    }

}