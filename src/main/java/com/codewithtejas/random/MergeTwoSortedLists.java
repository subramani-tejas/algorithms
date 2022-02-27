package com.codewithtejas.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        List<Integer> listOne = Arrays.asList(3, 7, 9, 12, 21);
        List<Integer> listTwo = Arrays.asList(6, 8, 15, 18, 27);

        System.out.println(merge(listOne, listTwo));
    }

    public static List<Integer> merge(List<Integer> listOne, List<Integer> listTwo) {
        int oneIndex = 0, twoIndex = 0, mergeIndex = 0;
        int oneLength = listOne.size(), twoLength = listTwo.size();
        List<Integer> merged = new ArrayList<>();

        while (oneIndex < oneLength && twoIndex < twoLength) {
            if (listOne.get(oneIndex) < listTwo.get(twoIndex))
                merged.add(mergeIndex++, listOne.get(oneIndex++));
            else merged.add(mergeIndex++, listTwo.get(twoIndex++));
        }

        while (oneIndex < oneLength)
            merged.add(mergeIndex++, listOne.get(oneIndex++));

        while (twoIndex < twoLength)
            merged.add(mergeIndex++, listTwo.get(twoIndex++));

        return merged;
    }
}
