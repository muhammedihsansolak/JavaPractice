package leetCodePractice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class LengthOfLastWord {


    public static void main(String[] args) {
        String str = "Mıhammed Solak  ";
        System.out.println(lengthOfLastWord2(str));


    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        s = s.substring(s.lastIndexOf(" ")+1);
        return s.chars().filter(Character::isLetter).toArray().length;
    }
    

    public static int lengthOfLastWord2(String s) {
        s = s.trim();
        s = s.substring(s.lastIndexOf(" ")+1);
        char[] arr = s.toCharArray();
        IntStream stream = new String(arr).chars().filter(Character::isLetter);
        return stream.toArray().length;
    }

    public static int lengthOfLastWord3(String s) {
        int size = 0;

        for (int i = s.length()-1; i >= 0 ; i--) {
            if (s.charAt(i) != ' ') size++;
            else {
                if (size > 0) return size;
            }
        }
        return size;
    }


    /*
    Given a string s consisting of words and spaces, return the length of the last word in the string. A word is a maximal substring consisting of non-space characters only.



Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
     */
}
