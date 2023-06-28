package day28_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeTwoArrayList {

    public static void main(String[] args) {

        String[] arr1 = {"A","B","C"};

        System.out.println(Arrays.toString(arr1));//[A, B, C]

        String[] arr2 = {"D","E","F","G"};

        System.out.println(Arrays.toString(arr2));//[D, E, F, G]

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(arr1));
        list.addAll(Arrays.asList(arr2));

        System.out.println(list);//[A, B, C, D, E, F, G]


    }
}
/*
4. write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}

 */