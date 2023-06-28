package day09_Practice;

public class FieldTrip {
    public static void main(String[] args) {

        int grade = 6;
        String result;

        if (grade == 1){
            result = "Grade - 1\nLocation - Apple orchard\nNumber of Groups - 3\nTeacher in charge - Ms. Smith";
        } else if (grade == 2) {
            result = "Grade - 2\nLocation - Zoo\nNumber of Groups - 7\nTeacher in charge - Mr. Lee";
        }else if (grade == 3){
            result = "Grade - 3\nLocation - Aquarium\nNumber of Groups - 5\nTeacher in charge - Ms. Wilson";
        } else if (grade == 4) {
            result = "Grade - 4\nLocation - Movie theater\nNumber of Groups - 2\nTeacher in charge - Ms. Reyes";
        } else if (grade == 5) {
            result = "Grade - 5\nLocation - Museum\nNumber of Groups - 5\nTeacher in charge - Ms. Lela";
        } else {
            result = "Grade - 6\nLocation - Six Flags\nNumber of Groups - 8\nTeacher in charge - Mr. Watt";
        }
        System.out.println(result);

    }
}
/*
Create a class called FieldTrip. Your school goes on a Field trip each year. The place you go will be based on your grade. Given a variable gradeNumber (1-6) figure out the details of your field trip. Print the information at the end.

    Data based on grade:

        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith

        grade - 2
        location - Zoo
        number of groups - 7
        teacher in charge - Mr. Lee

        grade - 3
        location - Aquarium
        number of groups - 5
        teacher in charge - Ms. Wilson

        grade - 4
        location - Movie theater
        number of groups - 2
        teacher in charge - Ms. Reyes

        grade - 5
        location - Museum
        number of groups - 5
        teacher in charge - Ms. Lela

        grade - 6
        location - Six Flags
        number of groups - 8
        teacher in charge - Mr. Watt
 */