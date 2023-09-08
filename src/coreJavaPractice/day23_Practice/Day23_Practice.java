package coreJavaPractice.day23_Practice;
import java.util.Arrays;
public class Day23_Practice {

    public static void main(String[] args) {

        eligibleToAlcohol(24);//Eligible to buy alcohol
        System.out.println("-------------------");
        eligibleToVote(24 ,false);//Not eligible to vote
        System.out.println("-------------------");
        gradeBasedScore(85);//B
        System.out.println("-------------------");
        areaOfCircle(10);//Area of the circle is: 314.0
        System.out.println("-------------------");
        dollarToEuro(50);//The $50.0 is 54.50000000000001 Euro
        System.out.println("-------------------");
        posOrNegOrZero(0);//Zero
        System.out.println("-------------------");
        printEachChar("Muhammed");
        System.out.println("-------------------");
        int[] numbers = {1,2,3,4,5};
        printEachElement(numbers);
        System.out.println("-------------------");
        calculator(10,20,'%');//Invalid operator
        System.out.println("-------------------");
        nameFormat("MUHammed" , "solaK");//Muhammed Solak
        System.out.println("-------------------");
        isAnagram("listen", "silent");//Anagram

    }

    //create a method that can check if a person is eligible to buy alcohol
    public static void eligibleToAlcohol(int age){
        if (age>= 21){
            System.out.println("Eligible to buy alcohol");
        }else {
            System.out.println("NOT eligible to buy alcohol");
        }
    }

    //create a method that can check if a person is eligible to vote
    public static void eligibleToVote(int age, boolean isUSCitizen){
        if (age >= 18 && isUSCitizen){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not eligible to vote");
        }
    }

    //create a method that can calculate the grade of the student based on the score
    public static void gradeBasedScore(int score){
        String result = "";
        if (score<0 || score>100){
            System.err.println("Invalid score");
        }else {
            result = (score>= 90)? "A" :(score>=80)? "B" :(score>=70)? "C" :(score>=60)? "D" : "Failed";
        }
        System.out.println(result);
    }

    //create a method that can calculate the area of a circle
    public static void areaOfCircle(double radious){
        double area = radious * radious * 3.14;
        System.out.println("Area of the circle is: "+ area);
    }

    //create a method that can convert dollar to euro
    public static void dollarToEuro(double dollar){
        double euro = dollar * 1.09;
        System.out.println("The $"+ dollar+" is "+euro+" Euro");
    }

    //create a method that can if the given integer is positive, negative or zero
    public static void posOrNegOrZero(int number){
        String result = "";
        result = (number>0)? "Positive" :(number<0)? "Negative" : "Zero";
        System.out.println(result);
    }

    //create a method named printEachChar that can print each characters of a string
    public static void printEachChar(String str){

        char arr[] = str.toCharArray();
        for (char c : arr) {
            System.out.println(c);
        }

    }

    //create a method named printEachElement that can print each element of an integer array
    public static void printEachElement(int[] arrayName ){
        for (int i : arrayName) {
            System.out.println(i);
        }

    }

    //create a method named calculator that passes three arguments (num1, num2, mathOperator), prints the calculation result
    public static void calculator(int num1, int num2, char operator){
        int result = 0;
        switch (operator){
            case '+':
               result = num1+num2;
               break;
            case'-':
                result = num1 - num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case'*':
                result = num1 * num2;
                break;
            default:
                System.out.println("Invalid operator");
        }
        System.out.println(result);
    }

    //write a method that can print out the full name of a person in regular format
    public static void nameFormat(String firstName, String lastName){

        String firstCharOfFirst = firstName.substring(0,1).toUpperCase();
        String restOfFirst = firstName.substring(1).toLowerCase();
        firstName = firstCharOfFirst+restOfFirst;

        String firstCharOfLast = lastName.substring(0,1).toUpperCase();
        String restOfLast = lastName.substring(1).toLowerCase();
        lastName = firstCharOfLast+restOfLast;
        System.out.println(firstName+" "+ lastName);
    }

    //create a method that can check if two strings are anagram
    public static void isAnagram(String str1, String str2){
        char[] arr1 = str1.toCharArray();
        Arrays.sort(arr1);

        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr2);
        if (Arrays.equals(arr1,arr2)){
            System.out.println("Anagram");
        }else {
            System.out.println("Not anagram");
        }
    }

}
