package Fibonacci;

//This give StackOverFlow Error if large number
public class FibonacciUsingRecursion {

    public static void main(String[] args) {
        int ans = fibo(50);
        System.out.println(ans);
    }

    public static int fibo(int n) {
        //Base Condition
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

}
