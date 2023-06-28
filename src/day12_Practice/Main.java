package day12_Practice;

import java.util.*;

class Main1 {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner input = new Scanner(System.in);
        String version = input.nextLine();

        //WRITE YOUR CODE BELOW:
        String result = "";

        if (version.equals("a")) {
            result = "Cupcake";
        } else if (version.equals("1.6")) {
            result = "Donut";
        } else if (version.equals("2.1")) {
            result = "Eclair";
        } else if (version.equals("2.2")) {
            result = "Froyo";
        } else if (version.equals("2.3")) {
            result = "Gingerbread";
        } else if (version.equals("3.1") ) {
            result = "Honeycomb";
        } else if (version.equals("4.0") ) {
            result = "Ice Cream Sandwich";
        } else if (version.equals("4.1") ) {
            result = "Jelly Bean";
        } else if (version.equals("4.4") ) {
            result = "KitKat";
        } else if (version.equals("5.0") ) {
            result = "Lollipop";
        } else if (version.equals("8.0") ) {
            result = "Oreo";
        } else if (version.equals("9.0") ) {
            result = "Pie";
        } else {
            result = "Not a valid version";
        }
        System.out.println(result);
    }
}

