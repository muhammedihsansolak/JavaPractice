package leetCodePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] arr = {"flower","flow","flight"};
        String result = longestCommonPrefix(arr);
        System.out.println(result);

    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int c = 0;
        while(c < first.length())
        {
            if (first.charAt(c) == last.charAt(c))
                c++;
            else
                break;
        }
        return c == 0 ? "" : first.substring(0, c);
    }


    public static String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0) return "";

        Arrays.sort(strs);
        int i = 0;
        String firstWord = strs[0];
        String lastWord = strs[ strs.length - 1 ];

        while (i < firstWord.length()){
            if (firstWord.charAt(i) == lastWord.charAt(i)) i++;
            else break;
        }
        if (i == 0) return "";
        return firstWord.substring(0,i);
    }

}
/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
 */
