package coreJavaPractice.day18_Practice;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aabccdeef";
        int count = 0;
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char a = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {

                char b = str.charAt(j);
                if (a == b){
                    count++;
                }
            }
            if (count == 1){
                result += a;
            }
        }

        System.out.println(result);





    }
}
/*
Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

            Hint: if you find out how to find the frequency of one character, then you can repeat it for the remaining characters to find the frequency.
            		if frequency of a character == 1  =========> unique
 */