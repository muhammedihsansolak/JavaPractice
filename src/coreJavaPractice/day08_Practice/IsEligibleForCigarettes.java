package coreJavaPractice.day08_Practice;

public class IsEligibleForCigarettes {
    /*
    Given a number (byte) age, write a program that can check if the person is eligible to buy Cigarettes
     */
    public static void main(String[] args) {

        byte age = 17;
        boolean isEligibleForCigarettes = age >= 18;
        if (isEligibleForCigarettes){
            System.out.println("Eligible");
        }
        if (!isEligibleForCigarettes){
            System.out.println("Not Eligible");
        }

    }
}
