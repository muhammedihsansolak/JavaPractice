package coreJavaPractice.day19_Practice;

public class FirstDuplicatedCharacter {
    public static void main(String[] args) {

        String str = "abcdeehhşş";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char ch = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {

                char each = str.charAt(j);
                if (ch == each){
                    count++;
                }

            }
            if (count == 2){
                System.out.println(""+ch+ch);
                break;
            }
        }
    }
}
/*
Write a program that can return the first duplicated character from a string
 */