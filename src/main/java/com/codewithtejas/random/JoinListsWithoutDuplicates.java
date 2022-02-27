package com.codewithtejas.random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * [a b c d e]
 * [b d f g]
 *
 * return [a b c d e f g]
 *
 * */
public class JoinListsWithoutDuplicates<T> {

    public List<T> join(List<T> one, List<T> two) {
        Set<T> set = new HashSet<>(one);
        set.addAll(two);

        return new ArrayList<>(set);
    }
}
