package cydeoAlgorithmTasks;

public class AlterCase {

    public static void main(String[] args) {

        String str = "We are the world 5";

        System.out.println(alter(str));
        System.out.println(alter2(str));

    }


    public static String alter(String input){
        input = input.toLowerCase();
        StringBuilder result = new StringBuilder();
        int alternateIndex = 0; //This variable is used to keep track of the position of letters (characters) in the input string, where spaces and non-letter characters are ignored.

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == ' ' || ! Character.isLetter(ch) ){
                result.append(ch);
                continue;
            } else alternateIndex++;

            if (alternateIndex % 2 != 0) {
               ch = Character.toUpperCase(ch);
               result.append(ch);
            } else result.append(ch);
        }

        return result.toString();
    }

    public static String alter2(String input) {
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                result.append(capitalizeNext ? Character.toUpperCase(ch) : ch);
                capitalizeNext = !capitalizeNext;
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

}
/*
Given a path of input file which includes sentence(s), write a program that reads alternates the case of every
alphabetic character, starting with uppercase. Spaces and non-alphabetical characters should be added to the
final output as is, i.e. they should not be taken into account when alternating between upper/lowercase.
Input: Your program should read lines from file as a standard input. Each line contains a sentence. Assume all
characters are ASCII.
Output: For each sentence from standard input, return a string which contains a sentence in each line such that
the first character is uppercase, the next character is lowercase and so on.
Test 1
Test Input: We are the world
Expected Output: We ArE tHe WoRlD
 */