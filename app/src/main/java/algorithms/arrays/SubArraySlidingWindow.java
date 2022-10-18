package algorithms.arrays;

class SubArraySlidingWindow {

    private static int findBestSubarray(int[] nums, int k) {
        int curr = 0;
        for (int i = 0; i < k; i++) {
            curr += nums[i];
        }

        int ans = curr;
        for (int i = k; i < nums.length; i++) {
            curr += nums[i] - nums[i - k];
            ans = Math.max(ans, curr);

        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4,7,8,9,3,2,6,7,8};
        System.out.println(findBestSubarray(nums, 4));
    }

}