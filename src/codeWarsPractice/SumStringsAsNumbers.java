package codeWarsPractice;

import java.util.Arrays;

public class SumStringsAsNumbers {

    public static void main(String[] args) {
        String a = "47358457" , b = "467476";
        System.out.println(sumStrings(a, b));
    }
    //not working with big numbers
    public static String sumStrings(String a, String b) {
        Long i = (long) Integer.parseInt(a);
        Long j = (long) Integer.parseInt(b);
        return (i+j)+"";
    }

    public static String sumStrings2(String a, String b) {
        StringBuilder result = new StringBuilder();

        int carry = 0;
        int maxLength = Math.max(a.length(), b.length());

        for (int i = 0; i < maxLength || carry > 0; i++) {
            int digitA = i < a.length() ? a.charAt(a.length() - 1 - i) - '0' : 0;
            int digitB = i < b.length() ? b.charAt(b.length() - 1 - i) - '0' : 0;

            int sum = digitA + digitB + carry;
            result.insert(0, sum % 10);
            carry = sum / 10;
        }

        // Remove leading zeros
        while (result.length() > 1 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }

        return result.toString();
    }

}
/*
Given the string representations of two integers, return the string representation of the sum of those integers.

For example:

sumStrings('1','2') // => '3'
 */