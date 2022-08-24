package Patterns;

import java.util.Scanner;

public class Pattern28 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Provide number :");
        int n = input.nextInt();
        pattern28(n);

    }

    private static void pattern28(int n) {

        for (int row = 1; row <= 2*n; row++) {
            int totalColumnsInRow = row > n ? 2*n-row : row ;
            for (int col = 1; col <= totalColumnsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
