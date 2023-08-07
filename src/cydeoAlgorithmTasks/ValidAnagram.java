package cydeoAlgorithmTasks;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        String str1 = "horse!é", str2 = "!éeshor";

        System.out.println(validAnagram(str1, str2));
    }

    public static boolean validAnagram(String s, String t){
        char[] arrS = s.toCharArray();
        char[] arrT = t.toCharArray();
        Arrays.sort(arrS);
        Arrays.sort(arrT);
        s = new String(arrS);
        t = new String(arrT);

        return s.equals(t);
    }
}
/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.
Constraints:
 1 <= s.length, t.length <= 5 * 104
 s and t consist of lowercase English letters.
Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to
such a case?
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
Output: false
 */