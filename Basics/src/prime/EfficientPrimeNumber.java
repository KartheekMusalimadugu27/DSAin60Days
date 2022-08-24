package prime;

import java.util.Scanner;

// If p*q=n then at any time p,q cannot be together greater than sqrt(n).
public class EfficientPrimeNumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numberOfValues = scn.nextInt();


        for (int i = 0; i < numberOfValues; i++) {
            int eachValue = scn.nextInt();

            int count = 0;
            for (int div = 2; div * div <= eachValue; div++) {
                if (eachValue % div == 0) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.println("Prime");
            } else {
                System.out.println("NotPrime");
            }
        }
    }

}
