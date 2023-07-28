package codeWarsPractice;

import java.util.List;
import java.util.stream.Collectors;

public class CountTheSmileyFaces {





    public static int countSmileys(List<String> arr) {
        if (arr.isEmpty()) return 0;
        arr = arr.stream().filter(p -> p.length()<4).collect(Collectors.toList());
        int count = 0;
        for (String each : arr) {
            if (each.length() == 2){
                if ( (each.charAt(0) == ':' || each.charAt(0) == ';') && ( each.charAt(1) == ')' || each.charAt(1) == 'D' ) ) count++;
            } else if (each.length() == 3) {
                if ( (each.charAt(0) == ':' || each.charAt(0) == ';') && (each.charAt(1) == '-' || each.charAt(1) == '~') && ( each.charAt(2) == ')' || each.charAt(2) == 'D' ) ) count++;
            }
        }
        return count;
    }

}
/*
Given an array (arr) as an argument complete the function countSmileys that should return the total number of smiling faces.

Rules for a smiling face:

Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
Every smiling face must have a smiling mouth that should be marked with either ) or D
No additional characters are allowed except for those mentioned.

Valid smiley face examples: :) :D ;-D :~)
Invalid smiley faces: ;( :> :} :]

Example
countSmileys([':)', ';(', ';}', ':-D']);       // should return 2;
countSmileys([';D', ':-(', ':-)', ';~)']);     // should return 3;
countSmileys([';]', ':[', ';*', ':$', ';-D']); // should return 1;
 */