package cydeoAlgorithmTasks;

import java.util.*;

public class CountTheNumberOfDuplicatedChars {

    public static void main(String[] args) {
        String str = "ABBA";
        System.out.println(duplicated(str));
        System.out.println(duplicated2(str));
    }

    public static int duplicated(String str){
        String dummy = "";
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            String ch = str.charAt(i)+"";
            if (str.indexOf( ch ) != str.lastIndexOf( ch )){
                if (!dummy.contains(ch)) dummy += ch;
            }
        }
        return dummy.length();
    }

    public static int duplicated2(String str){
        str = str.toLowerCase();
        Map<String,Integer> map = new HashMap<>();

        List<String> list = new ArrayList<>(Arrays.asList(str.split("")));
        for (String each : list) {
            if (!map.containsKey(each)){
                map.put(each,Collections.frequency(list,each));
            }
        }
        int count = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue()>1)count++;
        }
        return count;
    }
}
/*
Question-1 Count the number of Duplicated Chars
Write a function that will return the count of distinct case-insensitive alphabetic characters
and numeric digits that occur more than once in the input string.
The input string can be assumed to contain only alphabets (both uppercase and lowercase)
and numeric digits.
Example:
"abcde" -> 0 # no characters repeats more than once.
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times.
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice.
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice.

 */