package coreJavaPractice.day09_Practice;

public class CampusTime {

    public static void main(String[] args) {

        int time = 9;
        String openOrClosed;

        if (time >= 8 && time <= 23){
            openOrClosed = "Open";
        }else {
            openOrClosed = "Closed";
        }

        System.out.println(openOrClosed);


    }
}
/*
Create a class called CampusTime, an integer variable named time is given with a number between 1~24 has been initialized,
 write a program that can find out if the campus is open or not. Campus is open from 8 am(8) to 11 pm (23) If user enters
 a time within the open time they should see message: “open”  but if the time entered is outside of operating hours they
  should see: “ closed”
 */