package coreJavaPractice.day18_Practice;

public class PrintAShapeWithNestedLoop {

    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) {    // outer loop for number of rows
            for (int j = 1; j <= i; j++) {  // inner loop for printing stars
                System.out.print("* ");
            }
            System.out.println();   // move to next line after each row
        }
/*
The outer loop controls the number of rows and the inner loop controls the number of stars
printed on each row. The inner loop starts from 1 and goes up to the current row number (i),
printing a star on each iteration. After printing all the stars on a row, the inner loop
terminates and the outer loop moves to the next row, which starts with one more star than
the previous row.
 */



    }
}
/*
Use a nested loop to print the following shape
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *
 */