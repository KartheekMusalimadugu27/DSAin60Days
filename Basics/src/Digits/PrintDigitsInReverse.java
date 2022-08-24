package Digits;

import java.util.Scanner;

public class PrintDigitsInReverse {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printDigitsReverse(n);
    }

    public static void printDigitsReverse(int num) {

        while (num > 0) {

            int digit = num % 10;
            num = num / 10;
            System.out.println(digit);

        }

    }

}
