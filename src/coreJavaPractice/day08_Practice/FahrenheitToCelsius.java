package coreJavaPractice.day08_Practice;

public class FahrenheitToCelsius {
/*
Write a Java program to convert temperature from Fahrenheit to Celsius degree
        - Input a degree in Fahrenheit: 212

                            Formula :         C = (5(F-32))/9

        - Expected Output:
                            212.0 degree Fahrenheit is equal to 100.0 in Celsius
 */
    public static void main(String[] args) {


        double fahrenheit = 212;
        double celsius = (5*(fahrenheit-32))/9;
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " +
                celsius + " in Celsius.");


    }


}
