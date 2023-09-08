package coreJavaPractice.day28_Practice;

import java.util.Arrays;

public class SortedOrder_2 {

    public static void main(String[] args) {
        System.out.println(sortWord("abcd"));
        System.out.println(sortWord("abzy"));

    }

    public static boolean sortWord(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return (new String(chars)).equals(word);
    }
}
