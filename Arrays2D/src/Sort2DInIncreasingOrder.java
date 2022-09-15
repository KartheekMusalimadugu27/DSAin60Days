import java.util.Scanner;

public class Sort2DInIncreasingOrder {

    // using bubble sort to sort 2D array
// sort 2D array same as it is in a 1D array of size n * m
    public static void sort(int arr[][]) {
        int row, col, temp;
        int rowSize = arr.length;
        int colSize = arr[0].length;
        for (row = 0; row < rowSize * colSize - 1; ++row) {
            for (col = 0; col < rowSize * colSize - 1 - row; ++col) {
                if (arr[col / colSize][col % colSize] > arr[(col + 1) / colSize][(col + 1) % colSize]) {
                    temp = arr[(col + 1) / colSize][(col + 1) %colSize];
                    arr[(col + 1) / colSize][(col + 1) % colSize] = arr[col / colSize][col % colSize];
                    arr[col / colSize][col % colSize] = temp;
                }
            }
        }
    }

    public static void print(int arr[][]) {

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{5, 12, 17, 12, 23},
                {1, 2, 4, 6, 8},
                {21, 14, 7, 19, 27},
                {3, 18, 9, 15, 25}
        };
        System.out.println("Array Before Sorting is : ");
        print(arr);
        sort(arr);
        System.out.println("Array After Sorting is : ");
        print(arr);
    }

}
