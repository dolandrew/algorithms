package algorithms.searching;

class FirstBadVersion {

    private static int badVersion = 4;

    public static boolean isBadVersion(int version) {
        return version >= badVersion;
    }
    public static int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        int ans = 0;
        while (low <= high) {
            int index = low + (high-low)/2;
            if (isBadVersion(index)) {
                ans = index;
                high = index-1;
            } else {

                low = index +1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }

}