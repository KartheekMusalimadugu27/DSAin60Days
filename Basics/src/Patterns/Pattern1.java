package Patterns;

import java.util.Scanner;

//https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md
public class Pattern1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Provide the number of rows :");
        int n = input.nextInt();
        pattern1(n);

    }

    public static void pattern1(int n){

        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
