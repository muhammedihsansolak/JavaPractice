package coreJavaPractice.day09_Practice;

public class MedianNumber {

    /*
    Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number
     */

    public static void main(String[] args) {

        int n1 = 1111,
                n2 = 34,
                n3 = 123;

        boolean n2IsMedian = (n2 > n1) && (n3 > n2);
        boolean n1IsMedian = (n1 > n2) && (n3 > n1);
        boolean n3IsMedian = (n3 > n2) && (n1 > n3);
        if (n2IsMedian) {
            System.out.println(n2 + " is the median number");
        } else if (n1IsMedian) {
            System.out.println(n1 + " is the median number");
        }else {
            System.out.println(n3 + " is the median number");
        }


    }


}
