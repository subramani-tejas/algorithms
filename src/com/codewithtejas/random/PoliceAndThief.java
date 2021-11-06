package com.codewithtejas.random;

import java.util.ArrayList;
import java.util.List;

/*
 * Given an array that has:
 * 1. Each element contains either Police or Thief
 * 2. Each policeman can catch only one thief
 * 3. A policeman cannot catch a thief who is more than K units away
 *
 * Find the maximum number of thieves that can be caught.
 * */
public class PoliceAndThief {

    public int catchThief(char[] array, int k) {
        List<Integer> police = new ArrayList<>();
        List<Integer> thief = new ArrayList<>();

        for (var i = 0; i < array.length; i++) {
            if (array[i] == 'p') police.add(i);
            else if (array[i] == 't') thief.add(i);
        }

        return catchThief(array, k, police, thief);
    }
    
    private int catchThief(char[] array, int k, List<Integer> police, List<Integer> thief) {
        int policeAt = 0, thiefAt = 0;
        int thievesCaught = 0;

        while (policeAt < police.size() && thiefAt < thief.size()){
            if (Math.abs(police.get(policeAt) - thief.get(thiefAt)) <= k){
                thievesCaught += 1; policeAt++; thiefAt++;
            }
            else if (police.get(policeAt) < thief.get(thiefAt)) policeAt++;
            else thiefAt++;
        }
        return thievesCaught;
    }

    public static void main(String[] args) {
        char[] array = {'t', 't', 'p', 'p', 't', 'p'}; // 3
        int k = 2;
        PoliceAndThief police = new PoliceAndThief();
        System.out.println("Thieves caught: " + police.catchThief(array, k));
    }
}
