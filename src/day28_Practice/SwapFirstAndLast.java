package day28_Practice;

import java.util.ArrayList;

public class SwapFirstAndLast {

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println(numbers);//[1, 2, 3, 4, 5]

        int temp = numbers.get(0);

        numbers.set(0, numbers.get(numbers.size() -1));
        numbers.set( numbers.size() -1 , temp);

        System.out.println(numbers);
    }
}
/*
2. write a program that can swap the first and last elements of an integer arraylist
	            ex:
	                list = [1,2,3,4,5];
	                output: [5,2,3,4,1];
 */