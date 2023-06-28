package day10_Practice;

public class GradeLevel {

    public static void main(String[] args) {

        int gradeLevel = 22;
        String result = "";

        if (gradeLevel<=18 && gradeLevel>=1){
           result =  (gradeLevel>=1 && gradeLevel<=5)? "Elementary School" :(gradeLevel<=8)? "Middle School"
                    :(gradeLevel<=12)? "High School" :(gradeLevel<=16)? "College" : "Grad School";
        }else{
            System.out.println("Invalid grade level given");
        }

        System.out.println(result);


    }
}
/*
Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */