package coreJavaPractice.day22_Practice;
import java.util.Arrays;
public class ReverseTwoDimensionalArray {

    public static void main(String[] args){
//TODO cannot understand this solution

       int[][] arr2D = { {1,2,3}, {4,5,6}};
       int[][] result = new int[arr2D.length][];//{ { , , }, { , , }};

        for (int i = 0; i < arr2D.length; i++) {
            int[] temp = new int[arr2D[i].length]; // temporary array variable to hold the elements
            for (int j = 0; j < arr2D[i].length; j++) {
                temp[(temp.length - 1) - j] = arr2D[i][j]; // getting the last elements of each 1D array and assigning to the beginning indexes of temp array
            }
            result[(arr2D.length - 1) - i] = temp; // assign the 1D temp array to each index of the 2D array
        }

        System.out.println(Arrays.deepToString(result));








    }
}
/*
1. Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1},};
 */