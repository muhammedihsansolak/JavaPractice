package coreJavaPractice.day02_Practice;

public class WhatILearnedToday {

    public static void main(String[] args) {


        System.out.println("Q1: What are JRE and Java compiler used for?");
        System.out.println("A1: JRE is Java Runtime Environment. JRE provides the class libraries ");
        System.out.println("and other resources that a specific Java program needs to run. Java code needed to ");
        System.out.println("compile in order to work. Compiling a java file");
        System.out.println("means to translate it into a bytecode file. Java compiler takes the ");
        System.out.println("text file work of a developer and compiles it into a platform-independent Java file.");


        System.out.println("Q2: What is the main method used for?");
        System.out.println("A2: The main() is the starting point for JVM (Java Virtual Machine) to start execution of a Java program. ");
        System.out.println("Without the main() method, JVM will not execute the program. In any Java program, the main() method is the starting ");
        System.out.println("point from where compiler starts program execution. So, the compiler needs to call the main() method. Java main() ");
        System.out.println("method is always static, so that compiler can call it without the creation of an object or before the creation " +
                "of an object of the class");

        System.out.println("Q3: What is the src folder used for?");
        System.out.println("A3: The source (src) folder is where code is written. The src stands for source." +
                "The /src folder comprises of the raw non-minified code." +
                "The /src folder is used to store the file with the primary purpose of reading (and/or editing) the code." +
                "The /src folder contains all the sources, i.e. the code which is required to be manipulated before it can be used." +
                "Depending on the project, the /src folder may contain only the pure sources, or the non-minified versions." +
                "So, the /src folder is primarily used to store the source code files before any minification.");

        System.out.println("Q4: What is the package used for?");
        System.out.println("A4: A package in Java is used to group related classes. Think of it as a folder in a file directory");

        System.out.println("Q5: What is the class used for?");
        System.out.println("A5: To create objects and to define object data types and methods. Classes are categories, and objects" +
                " are items within each category.");

        System.out.println("Q6: What is System.out.println  is used for?");
        System.out.println("A6: Java System. out. println() is used to print an argument that is passed to it");



    }
}
