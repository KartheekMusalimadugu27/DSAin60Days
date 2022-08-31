package intergers;

// Not on Leetcode
public class NthRootOfX {

    public static void main(String[] args) {
        System.out.println(nthRootOfX(27.0,3));
    }

    //x = 27, n = 3 then 27Root3 = 3
    public static double nthRootOfX(double x, int n) {

        double left = 1.0;
        double right = x;
        double error = 0.001;

        while ((right - left) > error) {

            double mid = (left + right) / 2.0;
            if (multiply(mid, n) > x) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return left;
    }

    private static double multiply(double mid, int n) {
        double ans = 1.0;
        for (int i = 1; i <= n; i++) {
            ans = ans * mid;
        }
        return ans;
    }

}
