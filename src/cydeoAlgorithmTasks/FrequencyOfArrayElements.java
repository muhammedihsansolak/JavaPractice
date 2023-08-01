package cydeoAlgorithmTasks;

import java.util.*;

public class FrequencyOfArrayElements {
    public static void main(String[] args) {
        String[] arr = {"Apple", "Banana", "Banana", "Cherry", "Apple"};
        System.out.println(frequency(arr));
    }

    public static Map<String, Integer> frequency(String[] arr) {
        List<String> list = Arrays.asList(arr);
        Map<String,Integer> map = new LinkedHashMap<>();

        for (String each : list) {
            map.put( each , Collections.frequency( list ,each ));
        }
       return map;
    }

}
/*
Question-4 Frequency of Array Elements
Write a function that takes a String array as parameter and returns a map object that
contains each element of array as key and their occurrence counts as value.
For calculating occurrence, array elements should be checked by regarding case sensitivity.
Order is not important.
EXAMPLE:
Input: {"Apple", "Banana", "apple", "Cherry", "Apple"}
Output: returning map elements: {Apple=2, apple=1, Cherry=1, Banana=1}

 */