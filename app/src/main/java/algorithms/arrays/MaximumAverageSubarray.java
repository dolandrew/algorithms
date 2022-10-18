package algorithms.arrays;

class MaximumAverageSubarray {

    public static double findMaxAverage(int[] nums, int k) {
        double curr = 0;
        for (int i = 0; i < k; i++) {
            curr += nums[i];
        }
        // total first four
        double j = k;
        curr = curr / j;
        double ans = curr;
        for (int i = k; i < nums.length; i++) {
            curr = curr + ((nums[i] - nums[i-k])/j);
            ans = Math.max(ans, curr);
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        System.out.println(findMaxAverage(nums, 4));
    }

}