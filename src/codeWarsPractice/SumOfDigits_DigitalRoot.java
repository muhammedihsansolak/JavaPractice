package codeWarsPractice;

public class SumOfDigits_DigitalRoot {

    public static void main(String[] args) {

        System.out.println(digital_root(132189));

    }

    public static int digital_root(int n) {

        if ((n+"").length() == 1) return n;
        String str = n + "";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += Integer.parseInt(str.charAt(i)+"");
        }
        return digital_root(sum);
    }


    public static int digital_root2(int n) {
        return (1 + (n - 1) % 9);
    }


}
/*
Digital root is the recursive sum of all the digits in a number.

Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer.

Examples
    16  -->  1 + 6 = 7
   942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2
 */