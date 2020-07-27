package Task4_Collection;
import java.util.*;

public class Test_quest2 {
    public static void main(String[] args) {
        String text = "On the Atlantic shore of the United States, much of the northern coast is rocky. But the middle and southern Atlantic coasts rise gently from the sea. The Appalachians, which run almost parallel to the east coast, are old mountains with many coal rich valleys between them To the west of the Appalachians, lie plateaus built up over the centuries from bits of stone that were washed down from the mountains and then cut into small hills by streams.";

        Map<Character, Integer> frequency = new TreeMap<>();

        for(char textChar: text.toLowerCase().toCharArray()){
            if(String.valueOf(textChar).matches("[a-z]")) {
                if(frequency.containsKey(textChar)){
                    frequency.replace(textChar, frequency.get(textChar) + 1);
                } else {
                    frequency.put(textChar, 1);
                }
            }
        }
        for (char charKey : frequency.keySet()){
            System.out.println(charKey + ": " + frequency.get(charKey));
        }
    }
}
