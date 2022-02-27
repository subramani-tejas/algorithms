// https://www.geeksforgeeks.org/remove-duplicates-from-a-given-string/

package com.codewithtejas.random;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromString {

    public static String removeDuplicatesInWord(String word) {
        List<Character> wordWithoutDuplicates = new ArrayList<>();

        for (char character : word.toCharArray())
            if (!wordWithoutDuplicates.contains(character))
                wordWithoutDuplicates.add(character);

        return wordWithoutDuplicates.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
