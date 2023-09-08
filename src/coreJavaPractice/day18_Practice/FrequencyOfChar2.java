package coreJavaPractice.day18_Practice;
//WHEN TEHERE İS A DUPLİCATED CHAR THİS METHOD İS NOT CORRECT
public class FrequencyOfChar2 {
    public static void main(String[] args) {

        String str = "aabcccda";
        String result = "";

        while (str.length() > 0) {
            char c = str.charAt(0);
            int count = 1;

            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) == c) {
                    count++;
                } else {
                    break;
                }
            }

            result += c + "" + count;
            str = str.substring(count);
        }

        System.out.println(result);


    }
}
/*
Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1
 */