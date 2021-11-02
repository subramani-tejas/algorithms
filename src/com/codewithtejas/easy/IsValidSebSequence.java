package com.codewithtejas.easy;

import java.util.*;

/*
 * Find if a sequence is a sub-sequence of an array
 * */
public class IsValidSebSequence {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int arrayIndex = 0;
        int sequenceIndex = 0;
        while (arrayIndex < array.size() && sequenceIndex < sequence.size()) {
            if (array.get(arrayIndex).equals(sequence.get(sequenceIndex)))
                sequenceIndex += 1;
            arrayIndex += 1;
        }
        return sequenceIndex == sequence.size();
    }

    public static void main(String[] args) {
        var array = Arrays.asList(1, 1, 1, 1, 1);
        var sequence = Arrays.asList(1, 1, 1);
        var result = isValidSubsequence(array, sequence);
        System.out.println(result);
    }
}
