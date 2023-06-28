package day53_Practice.functionalInterface.biFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiFunction;

public class Tasks {

    public static void main(String[] args) {

        /*
        6.1 Create a function that can returns the common characters of two strings
				ex: str1 = "Python"
					str2 = "Wooden Spoon"

				output: on
         */

        BiFunction<String, String, String> common = (a,b) -> {
            String result = "";
            for (String eachA : a.split("")) {
                for (String eachB : b.split("")) {
                    if (eachA.equals(eachB)) result += eachA;
                }
            }
            return result;
        };

        String str1 = "Muhammed",
                str2 = "Hülya";
        System.out.println(  common.apply(str1, str2)  );

        //6.2 Create a function that can return the common elements of two integer arrays

        BiFunction<int[],int[],int[]> common2 = (a,b) -> {
            int count = 0;
            List<Integer> list = new ArrayList<>();
            for (int eachA : a) {
                for (int eachB : b) {
                    if (eachA == eachB) {
                        count++;
                        list.add(eachA);
                    }
                }
            }
            int[] result = new int[count];
            int i = 0;
            for (Integer each : list) {
                result[i++] = each;
            }
            return result;
        };

        int[] array1 = {1,2,3,4,5,6,7,8,9,10},
                array2 = {5,6,7};
        System.out.println(  Arrays.toString(  common2.apply(array1, array2)  ) );

        //6.3 Create a function that can return the common elements of two String arrays

        BiFunction<String[],String[],String[]> common3 = (a,b) -> {
            List<String> list = new LinkedList<>();
            for (String eachA : a) {
                for (String eachB : b) {
                    if (eachA.equals(eachB)) list.add(eachA);
                }
            }
            return list.toArray(new String[0]);
        };

        String[] array3 = {"A","B","C","D"},
                array4 = {"B","D"};

        System.out.println(  Arrays.toString(  common3.apply(array3, array4)  )  );

        //6.4 Create a function that can return the common elements of two Lists of Integers

        BiFunction< List<Integer>,List<Integer>,List<Integer> > common4 = (a,b) -> {
            List<Integer> result = new LinkedList<>();
            for (Integer eachA : a) {
                for (Integer eachB : b) {
                    if (eachA == eachB) result.add(eachA);
                }
            }
            return result;
        };
        //6.5 Create a function that can return the common elements of two Lists of Strings
        BiFunction< List<String>, List<String>, List<String> > common5 = (a,b) -> {
            List<String> list = new LinkedList<>();
            for (String eachA : a) {
                for (String eachB : b) {
                    if (eachA.equals(eachB)) list.add(eachA);
                }
            }
            return list;
        };


    }
}
