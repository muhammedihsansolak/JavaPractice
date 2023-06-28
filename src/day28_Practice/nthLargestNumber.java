package day28_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class nthLargestNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 8, 8));
        int n = 5;

        for (int i = 1; i < n; i++) {
            list.removeIf(p -> Collections.max(list) == p);
        }
        System.out.println(Collections.max(list));


    }
}
/*
write a program that can return the nth largest number from an arraylist

			arraylist = {1,2,3,4,5,6,7, 7 ,8, 8}
			n = 5

			output:
				4
 */