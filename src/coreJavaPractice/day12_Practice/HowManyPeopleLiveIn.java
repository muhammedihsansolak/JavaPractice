package coreJavaPractice.day12_Practice;

import java.util.Scanner;

public class HowManyPeopleLiveIn {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter how many people you are live with:");
        int howManyPeople = scan.nextInt();
        String result = "";

        if (howManyPeople<3){
            result = "Live with less than 3 people";
        } else if(howManyPeople>=3&&howManyPeople<=6){
            result = "Live with 3 - 6 people";
        } else if (howManyPeople>6) {
            result = "Live with \"more than 6 people";
        }
        System.out.println(result);

        scan.close();
    }
}
/*
Ask the user how many people they live with:
            if user lives with Less than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"
 */
