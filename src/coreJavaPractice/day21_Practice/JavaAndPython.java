package coreJavaPractice.day21_Practice;

public class JavaAndPython {

    public static void main(String[] args) {

        String str = "Java is fun. Java is cool. Python is fun. Python is cool ";

        String [] arr1 = str.split("\\.");

        int countJava = 0,
                countPyhton = 0;

        for (String each : arr1) {
            if (each.contains("Java")){
                countJava ++;
            } else if (each.contains("Python")) {
                countPyhton++;
            }
        }
        System.out.println("The word \"Java\" is " +countJava+ " times used.");
        System.out.println("The word \"Python\" is " +countPyhton+ " times used.");
    }
}
/*
6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)

 */