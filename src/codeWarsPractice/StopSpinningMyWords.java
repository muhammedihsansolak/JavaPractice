package codeWarsPractice;

public class StopSpinningMyWords {
    public static void main(String[] args) {
        String str = "Hey fellow warriors";
        System.out.println(spinWords(str));

        //join() method ->
        String str1 = "Muhammed",
                str2 = "Solak";

        System.out.println(String.join(" ", str1, str2));

    }


    public static String spinWords(String sentence) {
        String result = "";
        String[] arr = sentence.split(" ");
        for (String each : arr) {
            if (each.length()>=5){
                result += new StringBuilder(each).reverse().toString()+" ";
            }else {
                result+=each+" ";
            }
        }
        return result.trim();
    }
}
/*
Write a function that takes in a string of one or more words, and returns the same string, but with all five or more letter words reversed (Just like the name of this Kata). Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.

Examples:

spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
spinWords( "This is a test") => returns "This is a test"
spinWords( "This is another test" )=> returns "This is rehtona test"
 */