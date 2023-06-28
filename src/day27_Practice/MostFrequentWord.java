package day27_Practice;

import java.util.Arrays;

public class MostFrequentWord {

    public static void main(String[] args) {


    }

    public static String mostFrequentWord(String[] arr) {
        Arrays.sort(arr);
        int max = 0;
        String maxWord = "";

        for (String each : arr) {
            int count = 0;
            for (String each2 : arr) {
                if (each.equals(each2)){
                    count++;
                }
            }
            if (count>max){
                max = count;
                maxWord = each;
            }
        }
        return maxWord;
    }


}
/*
Write a Java method named mostFrequentWord that takes in an array of strings as a parameter and returns the most frequently occurring word in the array. If there is a tie, return the word that comes first alphabetically.
 */