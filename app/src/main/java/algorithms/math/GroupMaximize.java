package algorithms.math;

import java.util.ArrayList;
import java.util.List;


class GroupMaximize {

    public static int arrayPairSum(int[] nums) {

        // parse into groups
        // add the minimum of each group together
        // add this result to list
        // return max from list

        List<Integer[]> pairs = new ArrayList<>();
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                Integer[] pair = {nums[i],nums[j]};
                System.out.println(pair[0] + "," + pair[1]);
                pairs.add(pair);
            }
        }


        return 0;

    }

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
        arrayPairSum(nums);
    }


}