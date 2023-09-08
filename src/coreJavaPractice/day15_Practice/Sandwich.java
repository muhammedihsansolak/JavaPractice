package coreJavaPractice.day15_Practice;
import java.util.Scanner;
public class Sandwich {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();

        // Find the first and last occurrences of "bread"
        int firstIndex = str.indexOf("bread");
        int lastIndex = str.lastIndexOf("bread");

        // Check if there are at least two "bread" pieces
        if (firstIndex == -1 || lastIndex == -1 || firstIndex == lastIndex) {
            System.out.println("nothing");
        } else {
            // Extract the text between the "bread" pieces
            String result = str.substring(firstIndex + 5, lastIndex);
            System.out.println(result);
        }
    }
}
/*
### Use `String methods` and `if statements` to find what is inside of the sandwich.
 A sandwich is two pieces of bread with something between them. We want to see what is
 between our bread pieces. There will have only one input `str`. Inside of the `str` String
  we will look for the first occurrence of the text 'bread' and the last occurrence of the
   text 'bread'. Using those two points we will pull out the text between them.

> - If there is not two pieces of bread print the text: `nothing`

Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation, if statements
 */