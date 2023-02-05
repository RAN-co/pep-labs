import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        
        Map<Character, Integer> frequencyMap = new HashMap<>();
    char[] strArray = str.toCharArray();
    for (char c : strArray) {
        frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
    }
    char mostCommon = '\0';
    int maxFrequency = 0;
    for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
        if (entry.getValue() > maxFrequency) {
            mostCommon = entry.getKey();
            maxFrequency = entry.getValue();
        }
    }
        return mostCommon;
    }
}
