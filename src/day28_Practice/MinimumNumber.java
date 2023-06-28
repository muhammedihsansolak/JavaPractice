package day28_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumNumber {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        int min = nums.get(0);

        for (Integer each : nums) {
            if (each<min){
                min = each;
            }
        }
        System.out.println(min);


    }
}
/*
6. Write a program that can find the minimum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				1
 */