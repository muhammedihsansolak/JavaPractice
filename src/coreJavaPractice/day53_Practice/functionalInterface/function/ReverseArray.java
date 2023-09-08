package coreJavaPractice.day53_Practice.functionalInterface.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class ReverseArray {

    public static void main(String[] args) {

        //4.4 Create a function that can return the reversed version of an int array

        Function<int[],Integer[]> intArrReversed = (p) -> {
            List<Integer> list = new ArrayList<>();
            for (int each : p) {
                list.add(each);
            }
            Collections.reverse(list);
            return list.toArray(new Integer[0]);
        };


        //4.5 Create a function that can return the reversed version of a String array

        Function<String[],String[]> stringArrReversed = (p) -> {
            List<String> list = new ArrayList<>(Arrays.asList(p));
            Collections.reverse(list);
            return list.toArray(new String[0]);
        };

        String[] arr = {"A","B","C","D"};
        arr = stringArrReversed.apply(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("-------------------------");

        //4.6 Create a function that can return the sorted (decending) version of an int array
        //				Note: you can use the reverse function you created at 4.4

        Function<int[],Integer[]> sortArray = (p) -> {
            List<Integer> list = new ArrayList<>();
            for (int each : p) {
                list.add(each);
            }
            Collections.sort(list);
            Collections.reverse(list);
            return list.toArray(new Integer[0]);
        };

        int [] arr2 = {1,2,3,1,56,765,4};
        System.out.println(  Arrays.toString(sortArray.apply(arr2))  );


        //4.7 Create a function that can return the sorted (decending) version of a String array
        //				Note: you can use the reverse function you created at 4.5

        Function<String[], String[]> stringArrSort = (f) -> {
            List<String> list = new ArrayList<>(Arrays.asList(f));
            Collections.sort(list);
            Collections.reverse(list);
            f = list.toArray(new String[0]);
            return f;
        };

        String[] arr3 = {"A","B","C","D"};
        System.out.println(  Arrays.toString(stringArrSort.apply(arr3))  );
    }
}
