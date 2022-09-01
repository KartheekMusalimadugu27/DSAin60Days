package arrays;

import java.util.Arrays;
import java.util.HashMap;

// Leetcode 1
//https://leetcode.com/problems/two-sum/
public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 6, 9};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (prevMap.containsKey(nums[i])) {
                return new int[]{prevMap.get(num), i};
            }
            prevMap.put(diff, i);
        }
        return new int[]{};
    }

}
