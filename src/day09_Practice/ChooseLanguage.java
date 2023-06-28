package day09_Practice;

public class ChooseLanguage {
    /*
    Creata a class called ChooseLanguage, Given an integer variable named selection that has a number between 1~5, Write a program that can select the language based on the number that's given in selection and prints the following message:

		for 1: Hello, thank for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel
     */
    public static void main(String[] args) {

        int selection = 4;

        if (selection == 1) {
            System.out.println("Hello, thanks for your call");
        } else if (selection == 2) {
            System.out.println("Hola, gracias para llamar");
        } else if (selection == 3) {
            System.out.println("Merhaba, aradiginiz icin tesekkurler");
        } else if (selection == 4) {
            System.out.println("Privet, spasibo za vash zvonok");
        } else {
            System.out.println("Merci ,pour votre appel");
        }


    }
}
