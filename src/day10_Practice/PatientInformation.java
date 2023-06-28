package day10_Practice;
import java.util.Scanner;
public class PatientInformation {

    public static void main(String[] args) {
        //Enter your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!\nPlease enter your personal information");

        System.out.println("Enter your first name");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();

        // this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        String email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        String street = scan.nextLine();

        // continue for city
        System.out.println("Enter your city");
        String city = scan.nextLine();

        System.out.println("Enter your state");
        String state = scan.next();

        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();

        System.out.println("Enter your work phone number");
        long workPhomeNumber = scan.nextLong();

        System.out.println("Enter your personal phone number");
        long personalPhoneNumber = scan.nextLong();

        System.out.println("Enter your age");
        int age = scan.nextInt();

        System.out.println("Enter your height");
        double height = scan.nextDouble();

        System.out.println("Enter your weight");
        double weight = scan.nextDouble();

        System.out.println("Are you married?");
        boolean isMarried = scan.nextBoolean();

        String contact = "Contact: work phone number: "+workPhomeNumber+", personal phone number: "+personalPhoneNumber+", email: " +email;

        String fullName = "Full name: " + firstName +" " + lastName;

        String address = street +", "+ city +", " + state + ", " + zipCode;

        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        System.out.println("Enter your last name");
        System.out.println("Enter your email");
        System.out.println("Enter your street");
        System.out.println("Enter your city");
        System.out.println("Enter your state");
        System.out.println("Enter your zip code");
        System.out.println("Enter your work phone number");
        System.out.println("Enter your personal phone number");
        System.out.println("Enter your age");
        System.out.println("Enter your height");
        System.out.println("Enter your weight");
        System.out.println("Are you married?");
        System.out.println();
        System.out.println("Patient personal information \n"+fullName+"\nAddress: "+
                address+"\n"+contact+"\nAge: "+age+"\nHeight: "+ height+ "\nWeight: "+ weight+
                "\nMarried: "+ isMarried);

scan.close();

    }
}
