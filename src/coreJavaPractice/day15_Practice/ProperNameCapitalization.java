package coreJavaPractice.day15_Practice;
import java.util.Scanner;
public class ProperNameCapitalization {

    public static void main(String[] args) {


            Scanner input = new Scanner(System.in);

            System.out.print("Enter your first name: ");
            String firstName = input.nextLine();
            System.out.print("Enter your last name: ");
            String lastName = input.nextLine();

            // Capitalize first letter of first name and make the rest lowercase
            firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();

            // Capitalize first letter of last name and make the rest lowercase
            lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

            System.out.println("Your proper name is: " + firstName + " " + lastName);
            input.close();




    }
}
