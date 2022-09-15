import java.util.HashSet;

public class FirstRepeatingCharacter {

    public static void main(String[] args) {
        firstRepeatingChar("abc");
    }

    public static char firstRepeatingChar(String s) {

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                return c;
            } else {
                set.add(c);
            }
        }

        return '\0';
    }

}
