package algorithms.arrays;

class MinStartValue {

    public static int minStartValue(int[] nums) {
        int startValue = 1;

        boolean found = false;
        while (!found) {
            int sum = startValue;
            for (int i = 0; i <= nums.length; i++) {
                if (i == nums.length) {
                    return startValue;
                }
                sum += nums[i];
                if (sum < 1) {
                    startValue++;
                    break;
                }
            }
        }
        return startValue;
    }

    public static void main(String[] args) {
        int[] heights = {1,2};
        System.out.println(minStartValue(heights));
    }

}