package codeWarsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DuplicateEncoder {

    public static void main(String[] args) {
        String str = "Success";
        System.out.println(encode(str));
    }

    static String encode(String word){
        word = word.toLowerCase();
        List<String> list = new ArrayList<>(Arrays.asList(word.split("")));
        String result = "";

        for (int i = 0; i < list.size(); i++) {
            int frequency = Collections.frequency(list,list.get(i));
            if (frequency == 1){
                result += "(";
            }else {
                result += ")";
            }
        }
        return result;
    }

    static String encode2(String word){
        word = word.toLowerCase();
        String result = "";
        for (int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
        }
        return result;
    }
}
/*
The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if that character appears only once in the original string, or ")" if that character appears more than once in the original string. Ignore capitalization when determining if a character is a duplicate.

Examples
"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"
"(( @"     =>  "))(("
 */
