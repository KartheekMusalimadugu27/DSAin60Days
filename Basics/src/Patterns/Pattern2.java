package Patterns;

import java.util.Scanner;

public class Pattern2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Provide number :");
        int n = input.nextInt();
        pattern2(n);

    }

    private static void pattern2(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {

                System.out.print("* ");
            }
            System.out.println();
        }



    }
}
