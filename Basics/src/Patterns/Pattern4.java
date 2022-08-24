package Patterns;

import java.util.Scanner;

public class Pattern4 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Provide number :");
        int n = input.nextInt();
        pattern4(n);

    }

    private static void pattern4(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }


    }
}
