package day17_Practice;
import java.util.Scanner;
public class PrintVowels {
    public static void main(String[] args) {

        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        //WRITE YOUR CODE BELOW

        String result = "";

        for (int i = 0; i < word.length(); i++) {

            String ch =""+ word.charAt(i);
            if (ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u")){
                result += ch;
            }
        }
        System.out.println(result);

input.close();
    }
}
