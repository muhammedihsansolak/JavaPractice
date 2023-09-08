package coreJavaPractice.day19_Practice;

public class IndexOfFirstUnique {
    public static void main(String[] args) {

        String str = "abcabchkku";


        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char ch = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {

                char each = str.charAt(j);
                if (each == ch){
                    count++;
                }
            }
            if (count == 1){
                System.out.println(str.indexOf(""+ch));
                break;
            }
        }
    }
}
//4. Write a program that can return the index number of the first unique character.