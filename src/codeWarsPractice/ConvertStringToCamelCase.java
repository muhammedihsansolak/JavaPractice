package codeWarsPractice;

import java.util.Arrays;

public class ConvertStringToCamelCase {
    public static void main(String[] args) {
        String str = "The_Stealth_Warrior";
        System.out.println(toCamelCase(str));
        System.out.println(toCamelCase2(str));
    }

    static String toCamelCase(String s) {
        String [] arr = new String[0];
        String result = "";
        if (s.contains("-")){
           arr = s.split("-");
        }else {
            arr = s.split("_");
        }

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                result += arr[i];
                continue;
            }
            arr[i] = (arr[i].charAt(0) + "").toUpperCase() + arr[i].substring(1);
            result += arr[i];
        }
        return result;
    }
    static String toCamelCase2(String str){
        String[] words = str.split("[-_]");
        return Arrays.stream(words, 1, words.length)
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .reduce(words[0], String::concat);
    }
    /*

This code defines a static method toCamelCase that takes a string str as input and converts it to camel case. In camel case, each word in the string (except the first word) starts with an uppercase letter, and all the words are concatenated without any separators.

Let's break down the code step by step:

String[] words = str.split("[-_]");: This line splits the input string str into an array of substrings using a regular expression as the separator. The regular expression "[-_]" specifies that the string should be split at either a hyphen (-) or an underscore (_). It effectively separates the input string into individual words based on these characters, and stores the words in the words array.

Arrays.stream(words, 1, words.length): This line converts the words array into a stream, starting from the second element (index 1) and ending at the last element (index words.length - 1). This is done because the first word in the camel case should remain unchanged, and we only want to capitalize the subsequent words.

.map(s -> s.substring(0, 1).toUpperCase() + s.substring(1)): This line maps each word in the stream to a new word that has its first letter capitalized. It uses the substring() method to get the first letter of the word (at index 0), converts it to uppercase using the toUpperCase() method, and then concatenates it with the rest of the word (starting from index 1).

.reduce(words[0], String::concat): This line reduces the stream of capitalized words into a single string by concatenating them using the concat() method. It starts with the first word in the original words array (words[0]) and then adds each capitalized word from the stream one by one.
     */


}

/*
Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"

"The_Stealth_Warrior" gets converted to "TheStealthWarrior"

"The_Stealth-Warrior" gets converted to "TheStealthWarrior"
 */