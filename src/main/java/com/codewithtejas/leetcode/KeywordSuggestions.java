package com.codewithtejas.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class KeywordSuggestions {
    public static void main(String[] args) {
        List<String> repository = new ArrayList<>();
        repository.add("mobile");
        repository.add("mouse");
        repository.add("moneypot");
        repository.add("monitor");
        repository.add("mousepad");
        String customerQuery = "mouse";

        var res = searchSuggestions(repository, customerQuery);
        System.out.println(res);
    }

    private static List<List<String>> searchSuggestions(List<String> repository, String customerQuery) {
        List<List<String>> res = new ArrayList<>();

        for (int i = 0; i < customerQuery.length(); i++) {

            String s = customerQuery.substring(0, i + 1).toLowerCase();
            System.out.println(s);
            List<String> keywordsList = repository.stream()
                    .map(String::toLowerCase)
                    .filter(word -> word.startsWith(s))
                    .sorted()
                    .limit(3)
                    .toList();
            res.add(new ArrayList<>(keywordsList));
        }
        return res;
    }

}
