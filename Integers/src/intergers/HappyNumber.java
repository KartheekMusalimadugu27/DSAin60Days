package intergers;

import java.util.HashSet;

//https://leetcode.com/problems/happy-number/
public class HappyNumber {

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }


    public static boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet();
        while (n != 1) {
            int current = n;
            int sum = 0;
            while (current != 0) {
                int digit = current % 10;
                sum += digit * digit;
                current = current / 10;
            }
            if (seen.contains(sum)) {
                return false;
            }
            seen.add(sum);
            n = sum;
        }
        return true;
    }

}
