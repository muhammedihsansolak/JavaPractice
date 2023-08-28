package leetCodePractice;

public class MergeAlternately {

    public static void main(String[] args) {

        String word1 = "abcd";
        String word2 = "efg";

        System.out.println(mergeAlternately(word1, word2));
    }
    //bruteforce
    public static String mergeAlternately(String word1, String word2) {
        String result = "";

        if (word1.length() > word2.length()){
            for (int i = 0; i < word2.length(); i++) {
                result+= word1.charAt(i);
                result+= word2.charAt(i);
            }
            result += word1.substring(word2.length());
        } else if (word1.length() < word2.length()) {
            for (int i = 0; i < word1.length(); i++) {
                result+= word1.charAt(i);
                result+= word2.charAt(i);
            }
            result += word2.substring(word1.length());
        } else {
            for (int i = 0; i < word1.length(); i++) {
                result+= word1.charAt(i);
                result+= word2.charAt(i);
            }
        }
        return result;
    }


}
/*
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.
 */