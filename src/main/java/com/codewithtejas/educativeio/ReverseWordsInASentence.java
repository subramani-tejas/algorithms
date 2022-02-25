// https://www.educative.io/m/reverse-words-in-a-sentence

package com.codewithtejas.educativeio;

public class ReverseWordsInASentence {
    public static void main(String[] args) {
        String text = "Big Green";
        System.out.println(text);
        System.out.println(reverseWords(text));
    }

    public static String reverseWords(String sentence) {
        char[] reverseSentence = reverse(sentence.toCharArray(), 0, sentence.length() - 1);
        int pointer = 0;

        while (true) {
            if (reverseSentence[pointer] != ' ') {
                pointer++;
            } else {
                reverse(reverseSentence, 0, pointer - 1);
                reverse(reverseSentence, pointer + 1, reverseSentence.length - 1);
                break;
            }
        }

        return new String(reverseSentence);
    }

    public static char[] reverse(char[] word, int i, int j) {
        while (i < j) swap(word, i++, j--);
        return word;
    }

    public static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
