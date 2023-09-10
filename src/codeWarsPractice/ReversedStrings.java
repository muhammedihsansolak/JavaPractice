package codeWarsPractice;

public class ReversedStrings {

    public static String solution(String str) {
        StringBuilder s = new StringBuilder(str).reverse();
        return s.toString();
    }
}
/*
Complete the solution so that it reverses the string passed into it.

'world'  =>  'dlrow'
'word'   =>  'drow'
 */