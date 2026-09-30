import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    public static Character firstNonRepeatingChar(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }

        Map<Character, Integer> countMap = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
        } 

        for (Map.Entry<Character,  Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("aabccdeff"));
        System.out.println(firstNonRepeatingChar("aabbcc"));
        System.out.println(firstNonRepeatingChar("abcabc"));
    }
}