package day10_Practice;

public class AgeGroups {

    public static void main(String[] args) {

        int age = 150;
        String result = "";

        if ((age>=0)&&(age<=150)){
           result =  (age<21)? "Teenager" :(age<55)? "Adult" : "Senior";
        }else {
            result = "invalid age";
        }
        System.out.println(result);


    }
}
/*
Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( >= 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */
