package intergers;

// Leetcode 50
public class PowerOfXRaiseToN {

    public static void main(String[] args) {
        System.out.println(powerOfXRaisedToN(27, 3));
    }

    public static double powerOfXRaisedToN(double x, int n) {

        double ans = 1.0;

        long num = n;

        if (n < 0) {
            num = -1 * num;
        }
        while (num > 0) {
            if (num % 2 == 0) {
                x = x * x;
                num = num / 2;
            } else {
                ans = ans * x;
                num = num - 1;
            }
        }
        if (n < 0) {
            ans = (double) 1.0 / (double) ans;
        }
        return ans;


    }

}

/*
 *algo:
 *
 * if (n<0){
 *   n = -1 * n;
 * }
 *
 * ans =1
 *
 * if(n%2==0)
 *   x= x * x;
 *   n = n/2;
 * else
 *   ans = ans * x;
 *   n = n-1;
 *   ans = 1/ans
 *
 * */


// TC: O(logn) base2