package day21_Practice;

public class LongestPalindrome {

    public static void main(String[] args) {

        String[] arr = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String longest = "";
        for (String each : arr) {

            String reversed = "";
            for (int i = each.length() - 1; i >= 0; i--) {

                reversed += each.charAt(i);

            }
            if (each.equals(reversed) && each.length() > longest.length()) {
                longest = each;
            }
        }
        if (longest.length() == 0) {
            System.err.println("No palindrome");
        } else {
            System.out.println(longest);
        }
    }
}
/*
Task 4 :  For Each - Nested For

            Longest Palindrome

             Given a String array. Find the longest Palindrome String in your array.
                    Ex:
                    Input: ["java", "longer word", "civic", "apple", "racecar", "mom", "anna"] Output: racecar
                    Ex:
                    Input: ["abc", "dna", "kevin", "joe", "lamp"]
                    Output: No palindrome
 */