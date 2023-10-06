package leetCodePractice;

public class MergeStringsAlternately {

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

    public static String mergeAlternately2(String word1, String word2) {

        String result = "";
        int p1 = 0;
        int p2 = 0;

        while (p1 < word1.length() && p2 < word2.length()){
            result += word1.charAt(p1++);
            result += word2.charAt(p2++);
        }
        if ( p1 != word1.length() ) result += word1.substring(p1);
        else if ( p2 != word2.length() ) result += word2.substring(p2);


        return result;
    }

    public String mergeAlternately3(String word1, String word2) {
        String result = "";
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                result+= word1.charAt(i);
            }
            if (i < word2.length()) {
                result+=word2.charAt(i);
            }
            i++;
        }
        return result;
    }

}
/*
You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.
 */