package coreJavaPractice.day22_Practice;

public class abc {
    public static void main(String[] args) {
        String firstName = "MUHammed";
        String lastName = "solaK";

        String firstCharOfFirst = firstName.substring(0,1).toUpperCase();
        String restOfFirst = firstName.substring(1).toLowerCase();
        firstName = firstCharOfFirst+restOfFirst;

        String firstCharOfLast = lastName.substring(0,1).toUpperCase();
        String restOfLast = lastName.substring(1).toLowerCase();
        lastName = firstCharOfLast+restOfLast;
        System.out.println(firstName+" "+ lastName);
    }
}
