package leetCodePractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class IsomorphicStrings {

    public static void main(String[] args) {
        String s = "paper";
        String t = "title";

        System.out.println(isIsomorphic(s, t));

    }
    /**
     * I putted every char in different maps. If any char added before, put method extracts the previous key's value. If extracted values are not some it means they are not isomorphic.
     * Within the loop, the code checks if the result of mapS.put(s.charAt(i), i) is equal to the result of mapT.put(t.charAt(i), i). The put method of a HashMap returns the previous value associated with the specified key or null if there was no mapping for the key. In this case, it's being used to store the index of the current character.
     */
    public static boolean isIsomorphic(String s, String t) {
        Map<Character,Integer> mapS = new HashMap<>();
        Map<Character,Integer> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
           if (!Objects.equals(mapS.put(s.charAt(i), i), mapT.put(t.charAt(i), i))) return false;
        }
        return true;
    }

    /**
     * If the characters have the same mapping, the code updates the mappings in both arrays. It sets arr[s.charAt(idx)] and arr2[t.charAt(idx)] to idx + 1. The +1 is used to distinguish between mapped characters and characters that have not been mapped yet.
     * After iterating through all characters in the strings, if no differences have been found between the mappings, the method returns true, indicating that the strings are isomorphic.
     */
    public boolean isIsomorphic2(String s, String t) {
        if(s.length() != t.length())
            return false;

        int[] arr = new int[256];
        int[] arr2 = new int[256];

        for(int idx = 0; idx < s.length(); idx++){

            if(arr[s.charAt(idx)] != arr2[t.charAt(idx)]) //If ASCII values are not same, it means there are different number of characters inside strings
                return false;

            // Insert each character of string s and t to maps
            arr[s.charAt(idx)] = idx + 1; //ASCII values increases
            arr2[t.charAt(idx)] = idx + 1;
        }
        return true;
    }

}
/*
Given two strings s and t, determine if they are isomorphic.

Two strings s and t are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.



Example 1:

Input: s = "egg", t = "add"
Output: true
Example 2:

Input: s = "foo", t = "bar"
Output: false
 */