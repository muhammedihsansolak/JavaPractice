package coreJavaPractice.day08_Practice;

public class practice {

    public static void main(String[] args) {

        byte age = 17;

        boolean isEligible = age >= 18;

        if(isEligible) {
            System.out.println("An " + age + " years old person is \"eligible\" to buy Cigarettes.");
        }

        if(!isEligible) {
            System.out.println("An " + age + " years old person is \"NOT eligible\" to buy Cigarettes.");
        }
    }
}
