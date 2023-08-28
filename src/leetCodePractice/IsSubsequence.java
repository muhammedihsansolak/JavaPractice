package leetCodePractice;

import java.util.*;
import java.util.stream.Collectors;

public class IsSubsequence {

    public static void main(String[] args) {
        String s = "ace";
        String t = "abcde";

        System.out.println(isSubsequence(s, t));
    }

    /**
     * I defined two point. Started to iterate longer string which is T. if there are same letters in same sequence I updated my i value. Then I checked if i is equal to s length
     */
    public static boolean isSubsequence(String s, String t) {

        int i = 0, j = 0;
        while(i < s.length() && j < t.length()){
            if(s.charAt(i) == t.charAt(j)) i++;
            j++;
        }
        return i == s.length();

    }



    /*
    Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
     */
}
