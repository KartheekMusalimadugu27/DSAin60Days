import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class OccurrenceOfCharInString {

    public static void main(String[] args) {
            printCharacterOccurrence("iamkartheek");
    }


    public static void printCharacterOccurrence(String s){

        HashMap<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }

        for(Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey() +"-"+entry.getValue());
        }
    }
}
