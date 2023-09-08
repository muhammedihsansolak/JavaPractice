package coreJavaPractice.day53_Practice;

import java.util.*;

public class HighestFrequency2 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("java","java","python","c#"));

        Map<String, Integer> result = new LinkedHashMap<>();

        for (String each : list) {
           result.put( each , Collections.frequency( list , each ) ) ;
        }
        System.out.println(result);


    }
}
/*
Write a program that can find the element that has the highest frequency in an arrayList
	        Note: Must use a map

	        Ex:
	            list: [java, java, python, c#]

	        output:
	            [java=2, python=1, c#=1]
	            element java has the highest frequency
 */