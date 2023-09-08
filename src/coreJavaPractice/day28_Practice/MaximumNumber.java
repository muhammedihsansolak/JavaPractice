package coreJavaPractice.day28_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumNumber {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        int max = nums.get(0);

        for (Integer each : nums) {
            if (each>max){
                max = each;
            }
        }
        System.out.println(max);

    }
}
/*
5. Write a program that can find the maximum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				5
 */