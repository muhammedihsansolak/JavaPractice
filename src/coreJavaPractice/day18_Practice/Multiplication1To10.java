package coreJavaPractice.day18_Practice;

public class Multiplication1To10 {
    public static void main(String[] args) {

        int a = 1;
        int b = 1;

        for (int j = 0; j < 10; j++) {

            for (int i = 0; i < 10; i++) {
                System.out.print(a + " x " + b + " = " + (a * b)+"    ");
                a++;
            }
            a = 1;
            System.out.println();
            b++;
        }



    }
}
