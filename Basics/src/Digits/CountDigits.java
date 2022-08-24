package Digits;

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(countDigits(num));
    }

    public static int countDigits(int num) {

        if(num<0){
            num = num*-1;
        }

        if(num==0){
            return 1;
        }

        int digits = 0;
        while (num > 0) {
            num = num / 10;// num/=10
            digits++;
        }

        return digits;

    }


}
