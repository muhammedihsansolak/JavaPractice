package leetCodePractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        String str = "dvdf";
        System.out.println( lengthOfLongestSubstring(str) );
    }

    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Map<Character, Integer> chars = new HashMap<>();
        for (int right = 0, left = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            if (chars.containsKey(ch) && chars.get(ch) >= left){
                left = chars.get(ch) +1;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            chars.put(ch, right);
        }
        return maxLength;
    }


}
/*
Given a string s, find the length of the longest
substring
 without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */