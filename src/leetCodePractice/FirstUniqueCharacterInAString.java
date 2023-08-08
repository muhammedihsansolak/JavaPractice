package leetCodePractice;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {

    }

    public static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (s.indexOf(ch) == s.lastIndexOf(ch)){
                return s.indexOf(ch);
            }
        }
        return -1;
    }
}
/*
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 */