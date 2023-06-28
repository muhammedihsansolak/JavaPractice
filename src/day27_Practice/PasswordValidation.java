package day27_Practice;

import java.util.Scanner;

public class PasswordValidation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your password:");
        String password = scan.nextLine();

        if (password.length() < 8) {
            System.err.println("Password MUST be at least have 8 character");
            System.exit(0);
        } else if (isHaveBlank(password)) {
            System.err.println("Password should not contain space");
            System.exit(0);
        } else if (!isHaveUpperCase(password)) {
            System.err.println("Password should contain one upper case letter");
            System.exit(0);
        } else if (!isHaveLowerCase(password)) {
            System.err.println("Password should contain one lower case letter");
            System.exit(0);
        } else if (!isHaveSpecialCharacter(password)) {
            System.err.println("Password should contain one special characters");
            System.exit(0);
        } else if (!isHaveDigit(password)) {
            System.err.println("Password should at least contain a digit");
            System.exit(0);
        }
        System.out.println("Your password is valid!");

        scan.close();
    }

    public static boolean isHaveBlank(String str) {
        boolean result = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean isHaveUpperCase(String str) {
        boolean result = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean isHaveLowerCase(String str) {
        boolean result = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean isHaveSpecialCharacter(String str) {
        boolean result = false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetterOrDigit(str.charAt(i))) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean isHaveDigit(String str) {
        boolean result = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                result = true;
                break;
            }
        }
        return result;
    }

}
