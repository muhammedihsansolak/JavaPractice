package coreJavaPractice.day17_Practice;

import java.util.Scanner;

public class LogIn_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username:");
        String username = scan.next();
        System.out.println("Enter your password:");
        String password = scan.next();

        if (username.equals("Cydeo") && password.equals("Cydeo123")) {
            System.out.println("Logged In");
        } else {
            int attempt = 3;
            while (attempt >= 0){
                System.err.println("Invalid username or password. please re-enter.");
                System.out.println("Enter your username:");
                username = scan.next();
                System.out.println("Enter your password:");
                password = scan.next();
                if (username.equals("Cydeo") && password.equals("Cydeo123")){
                    System.out.println("Logged In");
                    System.exit(0);
                }else {
                    attempt--;
                }
            }
            System.err.println("3 Invalid Entry ==> YOUR ACCOUNT IS LOCKED");

        }
        scan.close();
    }
}
