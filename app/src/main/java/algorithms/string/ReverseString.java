package algorithms.string;

class ReverseString {

    public static boolean isPalindrome(String word){
        int left = 0;
        int right = word.length()-1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        char[] x = reverseString(s);
        System.out.println(x);
    }

    private static char[] reverseString(char[] s) {
        int i = 0;
        int j = s.length -1;
        while (i < j) {
            char left = s[i];
            char right = s[j];
            s[i] = right;
            s[j] = left;
            i++;
            j--;
        }
        return s;
    }

}