package Digits;

public class CountZerosInANumber {

    public static void main(String[] args) {
        System.out.println(count(30210004));
    }

    static int count(int num) {
        return helper(num, 0);
    }

    // special pattern, how to pass a value to above calls
    private static int helper(int num, int countNoOfZeros) {
        if (countNoOfZeros == 0) {
            return countNoOfZeros;
        }

        int rem = num % 10;
        if (rem == 0) {
            return helper(num / 10, countNoOfZeros + 1);
        }
        return helper(num / 10, countNoOfZeros);
    }

}
