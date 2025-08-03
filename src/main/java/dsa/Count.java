package dsa;

import java.util.LinkedHashMap;
import java.util.Map;

public class Count {
    public static void main(String[] args) {
        String input = "AAABBCCADDDD";
        Map<Character, Integer> outputMap = new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++) {

            outputMap.putIfAbsent(input.charAt(i), 0);
            outputMap.put(input.charAt(i), outputMap.get(input.charAt(i))+1);
        }

        for (Map.Entry<Character, Integer> characterIntegerEntry : outputMap.entrySet()) {
            System.out.print(String.valueOf(characterIntegerEntry.getKey())+characterIntegerEntry.getValue());
        }
    }
}
