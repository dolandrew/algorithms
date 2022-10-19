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

        // do this before moving right pointer
        for (int i = 0; i < nums.length; i++) {
            // check if left pointer is on 0
            if (nums[i] == 0) {
                // increment number of 0s
                curr++;
            }
            // while we have more 0s than allowed
            while (curr > k) {
                // if left pointer is on 0
                if (nums[left] == 0) {
                    // decrement number of 0s because
                    curr--;
                }
                // we are moving the left point forward
                left++;
            }
            // update answer to be length of window, if greater than existing
            ans = Math.max(ans, i - left + 1);

        }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        System.out.println(longestOnes(nums, 3));
    }

}