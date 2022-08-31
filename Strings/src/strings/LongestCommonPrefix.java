package strings;

//Leetcode 14
public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
}


// index of string starts from 0 like an array, suppose "flower".substring(0,6) will give result -> "flower".
// it will exclude the 6th index and give the result.
// "flower".substring(0,5) --> "flowe"

// TC: O(m*n) and SC: O(1)
