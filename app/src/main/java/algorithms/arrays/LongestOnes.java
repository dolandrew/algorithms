package algorithms.arrays;

class LongestOnes {

    private static int longestOnes(int[] nums, int k) {
        // return the max window length that meets curr < k

        // initialize variables
        int left = 0;
        int ans = 0;
        int curr = 0;

        // handle corner case
        if (nums == null || nums.length ==0) {
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                curr++;
            }
            while (curr > k) {
                if (nums[left] == 0) {
                    curr--;
                }
                left++;
            }
            ans = Math.max(ans, i - left + 1);

        }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        System.out.println(longestOnes(nums, 3));
    }

}