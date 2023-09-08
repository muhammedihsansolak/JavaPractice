package coreJavaPractice.day21_Practice;

public class CountPalindrome {

    public static void main(String[] args) {

        String[] arr1 = {"anna", "level", "java", "mouse","tenet"};
        int count = 0;

        for (String each : arr1) {

            String eachReversed = "";
            for (int i = each.length() - 1; i >= 0; i--) {

                eachReversed += each.charAt(i);
            }
            if (each.equals(eachReversed)){
                count++;
            }
        }
        System.out.println(count);

    }
}
/*
4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
 */