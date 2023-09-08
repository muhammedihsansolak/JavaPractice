package coreJavaPractice.day15_Practice;
import java.util.Scanner;
public class FrequencyOfAGivenWord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a sentence : ");
        String sentence = scan.nextLine();
        //"Java is my favorite, Java is fun, Java is the best";

        System.out.print("Enter a word to search : ");
        String givenWord = scan.next();
        //"Java"

        int count = 0;

        for (int i = 0; i <= sentence.length() - givenWord.length(); i++) {
            // word.length is subtracted from the sentence.length
            // So, while iterating one by one, loop will give enough room to search
            // whether the last characters of the sentence equals to the given word.
            // Otherwise loop will be out of range.

            //create a word each time
            String newWord = sentence.substring(i, i + givenWord.length());

            // and then check whether equals (IgnoreCase) to given word
            if (newWord.equalsIgnoreCase(givenWord)) {
                count++;    // OR count +=1
            }

        }

        System.out.println("The frequency of \""+givenWord+"\" within the sentence is " + count);
        scan.close();
    }
}
/*
4. write a program that can return the frequency of the a word Java from the sentence
        Ex: sentence = "Java Java";
            output:   2
 */

