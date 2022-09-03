package Digits;

import java.util.Scanner;

public class PrintDigitsInTheOrderOfNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printDigitsWay2(n);
    }

    public static void printDigitsWay2(int n) {
        int nod = 0;
        int number = n;
        while (number != 0) {
            number = number / 10;
            nod++;
        }
        int div = (int) Math.pow(10, nod - 1);
        while (div != 0) {
            int q = n / div;
            System.out.println(q);
            n = n % div;
            div = div / 10;
        }
    }

}


