package day08_Practice;

public class ConvertMinutesToYearsAndDays {

    /*
    write a Java program to convert minutes into a number of years and days.

     Input the number of minutes: 3456789
     Expected Output :
     3456789 minutes is approximately 6 years and 210 days
     */

    public static void main(String[] args) {

        int givenMinutes = 3456789;
        int years = givenMinutes / (60 * 24 * 365);
        int remainderFromYears = givenMinutes % (60 * 24 * 365);
        int days = remainderFromYears / (60 * 24);
        System.out.println(givenMinutes + " is approximately " + years + " years and " + days + " days.");


    }


}
