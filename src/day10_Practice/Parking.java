package day10_Practice;

public class Parking {

    public static void main(String[] args) {

        int hour = 10;
        double fee;


        if (hour>=0 && hour <=24) {
            fee = (hour >= 6 && hour <= 12) ?  7.50 : 15;
            System.out.println("You have " + hour + " hours ,you have to pay " + hour*fee);
        } else {
            System.out.println("Invalid Number");
        }

    }
}
/*
Task 7: Parking [ternary, relational]

    create a program that will define a time variable. Use a 24 hour format. Based on the given time determine the cost of parking in the city

        If the time is between 6-12:
            fee: 7.50

        if the time is between 13 - 23 or 0 - 5
            fee is 15
 */