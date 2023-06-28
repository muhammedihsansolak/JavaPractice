package day15_Practice;
import java.util.Scanner;
public class ProperNameCapitalization2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();

        String[] nameParts = fullName.split(" ");

        // Capitalize first letter of first name and make the rest lowercase
        String firstName = nameParts[0].substring(0, 1).toUpperCase() + nameParts[0].substring(1).toLowerCase();

        // Capitalize first letter of last name and make the rest lowercase
        String lastName = nameParts[1].substring(0, 1).toUpperCase() + nameParts[1].substring(1).toLowerCase();

        System.out.println("Your proper name is: " + firstName + " " + lastName);
        input.close();

    }
}
