package lesson1_33.lesson31.Homework;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {

    public static Map countSymbols(String text) {
        Map<Character, Integer> map = new TreeMap();
        if (text == null) return map;

        for (char ch : text.toCharArray()) {
            if (map.containsKey(ch))
                map.put(ch, map.get(ch) + 1);
            else
                map.put(ch, 1);
        }

        return map;
    }

    public static Map words(String text) {
        Map<String, Integer> map = new HashMap<>();
        if (text == null) return map;

        String[] words = text.split(" ");

        for (String s : words) {
            if (map.containsKey(s))
                map.put(s, map.get(s) + 1);
            else if (s.length() > 2)
                map.put(s, 1);
        }

        return map;
    }

}
