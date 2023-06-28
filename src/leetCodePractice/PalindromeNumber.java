package leetCodePractice;

public class PalindromeNumber {

    public static void main(String[] args) {

        int a = -121;
        String str = a+"";
        String reversed = "";
        for (int i = str.length() -1 ; i >=0 ; i--) {
            reversed += str.charAt(i);
        }
        System.out.println( str.equals(reversed) );


    }






    /*
Given an integer x, return true if x is a  palindrome, and false otherwise.

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
     */
}
