package codeWarsPractice;

public class GiveMeADiamond {
    


    public static String createDiamond(int size) {
        if (size % 2 == 0 || size < 1) {
            return null;
        }

        StringBuilder diamond = new StringBuilder();
        int mid = size / 2;

        // Upper half of the diamond
        for (int i = 0; i <= mid; i++) {
            for (int j = 0; j < mid - i; j++) {
                diamond.append(" "); // Add leading spaces
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                diamond.append("*"); // Add asterisks
            }
            diamond.append("\n"); // Move to the next line
        }

        // Lower half of the diamond (excluding the center line)
        for (int i = mid - 1; i >= 0; i--) {
            for (int j = 0; j < mid - i; j++) {
                diamond.append(" "); // Add leading spaces
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                diamond.append("*"); // Add asterisks
            }
            diamond.append("\n"); // Move to the next line
        }

        return diamond.toString();
    }
}
/*
You need to return a string that looks like a diamond shape when printed on the screen, using asterisk (*) characters. Trailing spaces should be removed, and every line must be terminated with a newline character (\n).

Return null/nil/None/... if the input is an even number or negative, as it is not possible to print a diamond of even or negative size.

Examples
A size 3 diamond:

 *
***
 *
 */