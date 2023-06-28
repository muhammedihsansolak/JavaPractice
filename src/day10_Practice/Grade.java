package day10_Practice;

public class Grade {

    public static void main(String[] args) {

        char grade = 'E';
        String result = "";

        if ((grade == 'A') || (grade == 'B') || (grade == 'C') || (grade == 'D') || (grade == 'F')){
           result =  (grade == 'A')? "Excellent!!" :(grade == 'B')? "Great Job!" :(grade == 'C')? "Good" :(grade == 'D')? "Passed" : "Failed";
        }else {
            result = "Invalid grade";
        }
        System.out.println(result);


    }
}
/*
Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */