package codeWarsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MexicanWave {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(Arrays.toString(wave(str)));
    }


    public static String[] wave(String str) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            String[] arr = str.split("");
            if (arr[i].equals(" ")) continue;
            arr[i] = arr[i].toUpperCase();
            String s = String.join("", arr);
            result.add(s);
        }
        return result.toArray(new String[0]);

    }


}

/*
In this simple Kata your task is to create a function that turns a string into a Mexican Wave. You will be passed a string and you must return that string in an array where an uppercase letter is a person standing up.
Rules
 1.  The input string will always be lower case but maybe empty.

 2.  If the character in the string is whitespace then pass over it as if it was an empty seat
Example
wave("hello") => {"Hello", "hEllo", "heLlo", "helLo", "hellO"}
 */