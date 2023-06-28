package day19_Practice;

public class DisplayTwices {
    public static void main(String[] args) {

        String str = "abcabbhch";
        String result = "";


        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char ch = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {

                char each = str.charAt(j);
                if (ch == each){
                    count++;
                }
            }
            if (count == 2 && !(result.contains(ch+""))){
                result += ch;
            }

        }
        System.out.println(result);
    }
}
//Write a program that can display all the characters that appeared twice in the string.