package cydeoAlgorithmTasks;

import java.util.Arrays;
import java.util.Collections;

public class FirstNonRepeatingVowel {
    public static void main(String[] args) {

        String str = "iagooglee";
        System.out.println(firstNonRepeatingVowel(str));

    }

    public static int firstNonRepeatingVowel(String str) {
        int[] arr = new int[5];
        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            switch (ch){
                case 'a' -> arr[0]++;
                case 'e' -> arr[1]++;
                case 'i' -> arr[2]++;
                case 'u' -> arr[3]++;
                case 'o' -> arr[4]++;
            }
        }
        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            if (ch == 'a' && arr[0] == 1) return j;
            if (ch == 'e' && arr[1] == 1) return j;
            if (ch == 'i' && arr[2] == 1) return j;
            if (ch == 'u' && arr[3] == 1) return j;
            if (ch == 'o' && arr[4] == 1) return j;
        }
       return -1;
    }
}
/*
Given a string, write a method to find the first non-repeating vowel (a, e, i, o, u) in it and
return its index. If it doesn't exist, return -1. Assume that all the characters of the String is
lowercase.
( Do not use String class functions other than charAt() and length() )
 */