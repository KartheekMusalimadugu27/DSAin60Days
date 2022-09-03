package strings;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {

        System.out.println(groupAnagrams(new String[]{"eat", "ate", "tae", "cat","tac","car"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List<String>> map = new HashMap<>();
        for (String word : strs) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedKeyString = String.valueOf(charArray);
            if (!map.containsKey(sortedKeyString))
                map.put(sortedKeyString, new ArrayList<>());
            map.get(sortedKeyString).add(word);
        }
        return new ArrayList<>(map.values());
    }
    // TC: 0(n klogk)

}
