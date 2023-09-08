package coreJavaPractice.day53_Practice;

import java.util.*;

public class HighestFrequency {

    public static void main(String[] args) {

        String str = "eeeeeaaabbbbccccdd";

        String[] arr = str.split("");

        Map<String, Integer> result = new LinkedHashMap<>();

        for (String each : arr) {
            result.put(each, Collections.frequency(Arrays.asList(arr), each));
        }
        System.out.println(result);


        String highestChar = "";
        int highestFrequency = 0;

        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            if (entry.getValue() > highestFrequency) {
                highestChar = entry.getKey();
                highestFrequency = entry.getValue();
            }
        }
        System.out.println("String with the highest frequency: '" + highestChar + "' with " + highestFrequency + " occurrences");


    }
}
/*
Write a program that can find the character that has the highest frequency in a String
        Note: Must use a map

        Ex:
            str = "eeeeeaaabbbbccccdd"

        Output:
            {e=5, a=3, b=4, c=4, d=2 }
            character has the highest frequency
 */