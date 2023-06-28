package day19_Practice;

public class FirstDuplicatedCharacter2 {
    public static void main(String[] args) {

/*************************************TASK 1**************************************
 1. Write a program that can return the first duplicated character from a string
 **********************************************************************************/

        String str = "edxzabcdgefhT454jfkll";  // c is the first duplicated character.

        // Take the character (outer loop) and compare with the character that just standing next to it, inner loop don't goes any further than that

        for (int i = 0; i < str.length(); i++) {

            for (int j = i+1; j <= i+1; j++) {       // (CHECKS JUST THE CHAR JUST STANDING NEX TO i NOTHING ELSE)

                if(str.charAt(i)==str.charAt(j)){ // If the current and the following characters are SAME, loop finds first duplicated character.
                    System.out.println("\nThe first dublicated character is " + "\""+(str.charAt(i))+"\".");  // Print the character.
                    System.out.println("At the index of "+str.indexOf(str.charAt(i)) +" and " + (str.indexOf(str.charAt(i))+1)+".\n"); //
                    System.exit(0);         // Finding thr first duplicated character terminates the JVM
                }
            }

        }








    }
}
