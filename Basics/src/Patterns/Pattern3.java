package Patterns;

import java.util.Scanner;

public class Pattern3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Provide number :");
        int n = input.nextInt();
        pattern3(n);

    }

    private static void pattern3(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}


