package algorithms.math;

class SquareRoot {

    /*
    Given a non-negative integer x, return the square root of x rounded down
    to the nearest integer. The returned integer should be non-negative as well.
     */

    private static int mySqrt(int x) {
        // binary search
        // handle base cases
        // starting from 0 and half + 1
        // test the midpoint
        // if its the answer, return it
        // else if mis is less than x/mid
        //  if one more would break the case
        //   then return mid
        //  else left is mid+1
        // else right is midpoint -1
        // loop ends
        // return mid

        if(x==0) return 0;
        if(x==1) return 1;
        int left = 0;
        int right = x;
        int mid = 0;
        while (left <= right) {
            mid = left + (right -left)/2;
            if (mid == x/mid) {
                return mid;
            } else if (mid < x/mid) {
                if((mid+1) > x/(mid+1)){
                    return mid;
                }
                left = mid + 1;

            } else {

                right = mid -1;
            }
        }
        return mid;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(4));
    }


}