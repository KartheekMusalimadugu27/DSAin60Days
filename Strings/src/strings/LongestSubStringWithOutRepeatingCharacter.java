package strings;


import java.util.HashMap;
import java.util.HashSet;

// Leetcode 3 //Sliding Window Example
public class LongestSubStringWithOutRepeatingCharacter {

    public static void main(String[] args) {
        System.out.println(lenOfLongestSubStringHashMap("abcabcbb"));
    }

    public static int lengthOfLongestSubString(String s) {

        int a_pointer = 0;
        int b_pointer = 0;
        int max = 0;

        HashSet<Character> hashSet = new HashSet<>();
        while (b_pointer < s.length()) {
            if (!hashSet.contains(s.charAt(b_pointer))) {
                hashSet.add(s.charAt(b_pointer));
                b_pointer++; //sliding the window
                max = Math.max(hashSet.size(), max);
            } else {
                hashSet.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }
        return max;

    }

    public static int lenOfLongestSubStringHashMap(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int ans = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (!hashMap.containsKey(ch)) {
                hashMap.put(ch, right);
            } else {
                left = Math.max(left, hashMap.get(ch) + 1);
                hashMap.put(ch, right);
            }
            ans = Math.max(ans, right - left + 1); // left to right
        }
        return ans;

    }

}

// Both takes TC:O(N) and SC:O(N)