package intergers;

// Leetcode 7
public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverse(-767676767));
    }


    public static int reverse(int x) {
        int ans = 0;

        while (x != 0) {
            int lastDigit = x % 10;

            if ((ans > Integer.MAX_VALUE/10) || (ans < Integer.MIN_VALUE/10)) {
                return 0;
            }

            ans = ans * 10 + lastDigit;
            x = x / 10;
        }

        return ans;
    }

}
