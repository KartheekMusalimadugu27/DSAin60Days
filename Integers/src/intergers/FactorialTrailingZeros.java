package intergers;
// Leetcode 172
public class FactorialTrailingZeros {

    public static void main(String[] args) {
        System.out.println(trailingZeros(30));
    }

    public static int trailingZeros(int n){

        int count=0;
        for (int i = 5; i <=n ; i*=5) {
            count = count + n/i;
        }
        return count;
    }
}

// n/3 + n/9 + n/27 + ..... --> to find out the number 3 in a factorial

// n/5 + n/25 + n/625 ... ---> to find out the number of trailing zeros formula

// TC : O(logn base5) SC:O(1)