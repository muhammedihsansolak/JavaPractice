package coreJavaPractice.day10_Practice;
import java.util.Scanner;
public class SecondsConverter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter seconds:");
        int inputSeconds = scan.nextInt();
        int hours = 50;
        int minutes = 50;
        int seconds = 50;

        hours=inputSeconds/3600;
        minutes=(inputSeconds%3600)/60;
        seconds=((inputSeconds%3600)%60);
        System.out.println(hours+ " hours, " + minutes+ " minutes, and "+ seconds+" seconds");
        scan.close();
    }
}
