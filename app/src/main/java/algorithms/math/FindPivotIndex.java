package algorithms.math;

class FindPivotIndex {

    public static int pivotIndex(int[] nums) {

        // 1, 7, 3, 6, 5, 6
        // 1, 8,11,17,22,28

        // 2, 1,-1
        // totals to 0

        // for all i from 1 to end of nums
        // if (i-1) == nums[nums.length] - nums[i]
        // else return -1

        int n = nums.length;
        int[] prefix = new int[n];
        prefix[0] = nums[0];
        int total = 0;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i-1] + nums[i];
            total += nums[i];
        }
        // check first index
        if (total == 0) {
            return total;
        }
        for (int i = 1; i < n; i++) {
            if (prefix[i-1] == prefix[n-1] - prefix[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        int[] nums = {9,6,4,2,3,5,7,0,1}; // -1
        int[] nums = {1,7,3,6,5,6}; // 3
        System.out.println(pivotIndex(nums));
    }


}