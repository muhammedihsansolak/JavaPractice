package day21_Practice;

import java.util.Arrays;

public class CommonElements {

    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4,5};
        int [] arr2 = {4,5,6,7,8};

        int common = 0;

        for( int each1 : arr1){
            for (int each2 : arr2){
                if (each1 == each2){
                    common += 1;
                }
            }
        }
        System.out.println(Arrays.toString(arr1) + " and " + Arrays.toString(arr2) +
                " have " + common + " common elements.");
    }
}
/*
3. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
          MUST use for each loops
 */