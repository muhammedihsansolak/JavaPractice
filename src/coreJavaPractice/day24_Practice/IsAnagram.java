package coreJavaPractice.day24_Practice;

import java.util.Arrays;

public class IsAnagram {

    public static void main(String[] args) {

        String str1 = "cba",
                str2 = "abc";
        isAnagram(str1, str2);

    }

    public static void isAnagram(String str1, String str2) {

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean isAnagram = Arrays.equals(arr1, arr2);
        System.out.println(isAnagram);
    }


}
//2. create a method named isAnagram that passes two String parameters, the method returns
// true if the given two strings are anagram, otherwise returns false