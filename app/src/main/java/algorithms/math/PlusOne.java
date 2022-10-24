package algorithms.math;

class PlusOne {

    /*
    You are given a large integer represented as an integer array digits,
    where each digits[i] is the ith digit of the integer.
    The digits are ordered from most significant to least significant in
    left-to-right order. The large integer does not contain any leading 0's.

    Increment the large integer by one and return the resulting array of digits.
     */

    private static int[] plusOne(int[] digits) {
        // move from the right to the left
        // if the number is not at 9
        // add 1 to the number and return
        // else it is a 9, thus now 0
        // if the loop finishes, array is all 0s
        // create new array result of length 1 longer
        // set first element to 1
        // return result

        // comparing integers with < is much faster than !=


        for (int i = digits.length-1; i>=0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        int[] result = new int[digits.length+1];
        result[0] = 1;
        return result;

    }

    public static void main(String[] args) {
        int[] digits = {9,9,9,9};
        int[] plusOne = plusOne(digits);
        for (int digit : plusOne) {
            System.out.println(digit); // 10000
        }
    }


}