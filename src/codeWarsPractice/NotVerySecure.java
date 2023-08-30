package codeWarsPractice;

import java.util.Arrays;

public class NotVerySecure {


    public static boolean alphanumeric(String s){
        char[] arr = s.toCharArray();

        if (arr.length<1) return false;

        for (char ch : arr) {
            if (!Character.isLetterOrDigit(ch) || Character.isWhitespace(ch))  return false;
            if (ch<48 || ch>122 || ch == 95) return false;
        }

        return true;
    }

    public static boolean alphanumeric1(String s) {
        return s.matches("[A-Za-z0-9]+");
    }

}
/*
In this example you have to validate if a user input string is alphanumeric. The given string is not nil/null/NULL/None, so you don't have to check that.

The string has the following conditions to be alphanumeric:

At least one character ("" is not valid)
Allowed characters are uppercase / lowercase latin letters and digits from 0 to 9
No whitespaces / underscore
 */