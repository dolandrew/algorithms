package algorithms.math;

class ReverseInteger {

    public static int reverse(int x) {
        String number = String.valueOf(x);
        StringBuilder sb = new StringBuilder(number);
        String reversed = sb.reverse().toString();

        long longNumber = Long.valueOf(reversed);
        if (longNumber > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) longNumber;
    }
    public static void main(String[] args) {
        System.out.println(reverse(1234889349));
    }


}