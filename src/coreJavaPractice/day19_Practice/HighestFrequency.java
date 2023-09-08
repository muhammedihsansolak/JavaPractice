package coreJavaPractice.day19_Practice;

public class HighestFrequency {
    public static void main(String[] args) {

        String str = "abcnnbn";
        char highestChar =' ';
        int frequency = 0;


        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char ch = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {

                char each = str.charAt(j);
                if (ch == each){
                    count++;
                }

            }
            if (count > frequency){
                frequency = count;
                highestChar = ch;
            }
        }
        System.out.println("The character with the highest frequency is: " +highestChar);






    }
}
//6.  Write a program that can find the character that has the highest frequency from a string