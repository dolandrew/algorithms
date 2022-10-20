package algorithms.math;

import java.util.HashSet;
import java.util.Set;

class CountElements {

    public static int countElements(int[] arr) {
        Set<Integer> nums = new HashSet<>();
        int ans = 0;
        for (int i : arr) {
            nums.add(i);
        }
        for (int i = 0; i < arr.length; i++) {
            if (nums.contains(arr[i]+1)) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,3,3,5,5,7,7};
        System.out.println(countElements(nums));
    }


}