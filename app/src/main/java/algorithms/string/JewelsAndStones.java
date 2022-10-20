package algorithms.string;

class JewelsAndStones {
    /*
    You're given strings jewels representing the types of stones that are jewels,
    and stones representing the stones you have. Each character in stones is a
    type of stone you have. You want to know how many of the stones you have are
    also jewels.

    Letters are case sensitive, so "a" is considered a different type of stone
    from "A".
     */

    public static int numJewelsInStones(String jewels, String stones) {
        int ans = 0;
        for (char c : stones.toCharArray()) {
            if (jewels.indexOf(c) >= 0) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb")); //3
    }

}