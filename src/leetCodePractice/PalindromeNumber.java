package leetCodePractice;

public class PalindromeNumber {

    public static void main(String[] args) {

    }

    public boolean isPalindrome(int x) {
        String str = x+"";
        String reverse = new StringBuilder(str).reverse().toString();
        return (str).equals(reverse);
    }


    /*
Given an integer x, return true if x is a  palindrome, and false otherwise.

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
     */
}
