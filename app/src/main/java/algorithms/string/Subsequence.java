package algorithms.string;

class Subsequence {



    public static void main(String[] args) {
        System.out.println(isSubsequence("ace", "abcde"));
    }

    private static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

}