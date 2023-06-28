package day09_Practice;

public class AgeGroups {

    public static void main(String[] args) {


        int age = 71;
        String ageGroup;

        if (age >= 1 && age <= 1) {
            ageGroup = "Infant";
        } else if (age >= 3 && age <= 5) {
            ageGroup = "Toddler";
        } else if (age >= 6 && age <= 9) {
            ageGroup = "Kid";
        } else if (age >= 10 && age <= 12) {
            ageGroup = "Pre-Teen";
        } else if (age >= 13 && age <= 17) {
            ageGroup = "Teenager";
        } else if (age >= 18 && age <= 20) {
            ageGroup = "Young Adult";
        } else if (age >= 21 && age <= 39) {
            ageGroup = "Adult";
        } else if (age >= 40 && age <= 49) {
            ageGroup = "Young Middle-Aged Adult";
        } else if (age >= 50 && age <= 54) {
            ageGroup = "Middle-Aged Adult";
        } else if (age >= 55 && age <= 64) {
            ageGroup = "Very Young Senior Citizen";
        } else if (age >= 65 && age <= 74) {
            ageGroup = "Young Senior Citizen";
        } else if (age >= 75 && age <= 84) {
            ageGroup = "Senior Citizen";
        } else {
            ageGroup = "Old Senior Citizen";
        }
        System.out.println(ageGroup);


    }

}
/*
Create a class called AgeGroups, and write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)
 */