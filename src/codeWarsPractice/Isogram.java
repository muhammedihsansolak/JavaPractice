package codeWarsPractice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Isogram {
    public static void main(String[] args) {

        String str = "thumbscrewjapingly";
        System.out.println(isIsogram(str));

    }


    public static boolean  isIsogram(String str) {
        if (str.isEmpty()) return true;
        String newStr = Arrays.stream(str.toLowerCase().split(""))
                .distinct()
                .collect(Collectors.joining(""));

        return newStr.equalsIgnoreCase(str);
    }

}
/*
An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.

Example: (Input --> Output)

"Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)

isIsogram "Dermatoglyphics" = true
isIsogram "moose" = false
isIsogram "aba" = false
 */