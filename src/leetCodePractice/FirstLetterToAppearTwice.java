package leetCodePractice;

import java.util.HashSet;
import java.util.Set;

public class FirstLetterToAppearTwice {
    public static void main(String[] args) {
        String str = "Muhammed";
        System.out.println(repeatedCharacter(str));
    }
    public static char repeatedCharacter(String s) {

        Set<Character> set = new HashSet<>();

        for (char each : s.toCharArray()) {
            if ( !set.add(each)) return each;
        }
        return ' ';
    }
}
/*
Given a string s consisting of lowercase English letters, return the first letter to appear twice.

Note:

A letter a appears twice before another letter b if the second occurrence of a is before the second occurrence of b.
s will contain at least one letter that appears twice.
 */