package day09_Practice;

public class CharacterIdentity {

    public static void main(String[] args) {

        char character = 1;

        if (character >= 48 && character <= 57) {
            System.out.println("Digit character");
        } else if ((character >= 65 && character <= 90) || (character >= 97 && character <= 122)) {
            System.out.println("Alphabetic character");
        }else {
            System.out.println("Special character");
        }


    }
}
/*
    Create a class called Character Identity, and write a program that can identify if the given character
    is a digit or Alphabetic Character(A~Z or a~Z) or a special character

            Ex:
                ch = '@'

            output:
                Special Character

            HINT: You may wanna check out the numbers of the chracters on ASCII table

     */