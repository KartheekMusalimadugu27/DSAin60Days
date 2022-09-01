
//Leetcode 704
//https://leetcode.com/problems/binary-search/
public class SearchUsingBinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 8, 12, 14, 17};
        int target = 17;
        System.out.println(binarySearch(arr,target));
    }

    // return the index
    // return -1 if it does not exist
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }

}
