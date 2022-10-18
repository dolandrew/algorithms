package algorithms.searching;

class BinarySearch {

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        while (low < high) {
            int index = (high + low) / 2;
            if (nums[index] < target) {
                low = index + 1;
            } else {
                high = index;
            }
        }
        return nums[high] == target ? high : -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
//        int[] nums = {-1,0,1};
//        int[] nums = {-1};
//        int[] nums = {-1,-1,-1};
        System.out.println(search(nums, 10));
    }

}