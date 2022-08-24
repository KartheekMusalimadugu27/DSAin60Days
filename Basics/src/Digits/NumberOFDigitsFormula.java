package Digits;

import java.util.Scanner;

public class NumberOFDigitsFormula {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(countDigits(num));
    }

    public static int countDigits(int num) {
        if (num < 0) {
            num = num * -1;
        }

        if (num==0){
            num =1;
        }

        return (int)(Math.log10(num)) + 1;

    }


}
