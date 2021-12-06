package com.codewithtejas.easy;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static int firstNonRepeatingCharacter(String string){
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (map.get(ch) == 1) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        String input = "abcdacd";
        System.out.println(firstNonRepeatingCharacter(input));
    }
}
