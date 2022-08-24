package prime;

import java.util.Scanner;

public class IsPrimeBoolean {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i = 2; i <= number; i++) {
            System.out.println(i + " " + isPrime(i));
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int divisor = 2;
        while (divisor * divisor <= n) {
            if (n % divisor == 0) {
                return false;
            }
            divisor++;
        }
        return true;
    }

}
