import java.util.HashMap;
import java.util.Stack;

// Leetcode 20
public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(validParentheses("(((("));
    }

    public static boolean validParentheses(String s) {

        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (map.containsKey(curr)) {
                char pop = stack.size() != 0 ? stack.pop() : '#';
                if (map.get(curr) != pop) {
                    return false;
                }
            } else {
                stack.push(curr);
            }
        }
        return stack.isEmpty();
    }

}
