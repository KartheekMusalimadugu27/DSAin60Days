package prime;

import java.util.Scanner;

public class TLEPrimeNumber {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numberOfValues = scn.nextInt();

        for (int i = 0; i < numberOfValues; i++) {
            int eachValue = scn.nextInt();

            int count = 0;
            for (int div = 0; div <= eachValue; div++) {
                if (eachValue % div == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println("Prime");
            } else {
                System.out.println("NotPrime");
            }
        }
    }

}
