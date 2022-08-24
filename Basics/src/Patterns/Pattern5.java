package Patterns;

import java.util.Scanner;

public class Pattern5 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Provide number :");
        int n = input.nextInt();
        pattern5a(n);

    }

    private static void pattern5a(int n) {

        for (int row = 1; row <= 2*n; row++) {
            int totalColumnsInRow = row > n ? 2*n-row : row ;
            for (int col = 1; col <= totalColumnsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }

    private static void pattern5b(int n) {
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1; i<=n-1; i++){
            for(int j = n-1; j >= i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
