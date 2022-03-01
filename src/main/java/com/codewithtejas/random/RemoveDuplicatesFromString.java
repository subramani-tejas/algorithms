// https://www.geeksforgeeks.org/remove-duplicates-from-a-given-string/

package com.codewithtejas.random;

import java.util.ArrayList;
import java.util.Arrays;
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

    public static String removeDuplicatesFunctional(char[] word) {
        int index = 0;
        for (int i = 0; i < word.length; i++) {
            int j;
            for (j = 0; j < i; j++)
                if (word[i] == word[j]) break; // check current & previous

            if (j == i)
                word[index++] = word[i];
        }
        return String.valueOf(Arrays.copyOf(word, index));
    }
}
