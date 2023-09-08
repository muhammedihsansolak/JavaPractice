package coreJavaPractice.day28_Practice;

import java.util.ArrayList;

public class SetTheLAstElement {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers);//[1, 2, 3, 4, 5]

        numbers.set(numbers.size() -1 , 0);

        System.out.println(numbers);//[1, 2, 3, 4, 0]

    }
}
/*
1. write a program that can set the last element of the Integer arraylist to zero
	            ex:
	                list = [1,2,3,4,5];
	                output: [1,2,3,4,0];
 */