package intergers;

import java.util.HashSet;
import java.util.Set;

//Leetcode 136
public class SingleNumber {

    public static void main(String[] args) {

        int[] nums = {4,2,1,2,1};

        System.out.println(singleNumberConstantSpace(nums));

    }

    // TC:O(N), SC:O(N)
    public static int singleNumber(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <= nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        return set.iterator().next();
    }

    public static int singleNumberConstantSpace(int[] nums) {

        int ans = nums[0];

        for (int i = 1; i < nums.length ; i++) {

            ans = ans ^ nums[i];

        }

        return ans;
    
    }

}
