package day17_Practice;

import java.util.Scanner;
public class LogIn {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username:");
        String userName = scan.next();
        System.out.println("Enter your password:");
        String password = scan.next();

        if (userName.equals("Cydeo") && password.equals("Cydeo123")) {
            System.out.println("Logged In");
        } else {
            for (int i = 0; i < 3; i++) {

                System.out.println("Invalid username or password. please re-enter");
                System.out.println("Enter your username:");
                userName = scan.next();
                System.out.println("Enter your password:");
                password = scan.next();
                if (userName.equals("Cydeo") && password.equals("Cydeo123")) {
                    System.out.println("Logged In");
                    break;
                }
            }
        }
        if (!(userName.equals("Cydeo") && password.equals("Cydeo123"))) {
            System.err.println("Account is locked! Reach support team.");
        }

        scan.close();
    }
}
/*
You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to
                 have three attempts to enter correct credentials and if all three attempts are failed,
                  then print "Your account is locked."
                  for(int i = 1; i <= 3; i++){

    		if(valid){
    			sout("Loged In")
    			break;
    		}

    		if( i==3){
    			sout(Your account is locked)
    		}
 */