package algorithms.arrays;

class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int curr = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[curr] = nums[i];
                curr++;
            }
        }
        return curr;
    }

    public static void main(String[] args) {
        int[] heights = {13,10,35,24,76};
        System.out.println(removeElement(heights, 13));
    }

}