package algorithms.string;

class AnotherSubsequenceApproach {

    public static void main(String[] args) {
        System.out.println(isSubsequence("ace", "abcde"));
    }

    public static boolean isSubsequence(String s, String t) {
        // edge cases
        if (s.length() == 0) {
            return true;
        }
        if (t.length() == 0) {
            return false;
        }
        // dump to char arrays
        char[] tchar = t.toCharArray();
        char[] schar = s.toCharArray();
        int right = 0;
        int n = s.length();
        // left and right pointers start at 0 index
        for (int left = 0; left < n; left++) {
            // check right pointer has not passed end of string
            if (right == t.length()) {
                return false;
            }
            // if the pointers point to different characters
            while (tchar[right++] != schar[left]) {
                // move the right pointer
                // check right pointer has not passed end of string
                if (right == t.length()) {
                    return false;
                }
            }
            // move the left pointer
        }
        // made it to the end of s sucessfully
        return true;
    }

}