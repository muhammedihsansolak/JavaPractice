package coreJavaPractice.day53_Practice.functionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Tasks {

    public static void main(String[] args) {
        // create a function that can return the maximum number from an int array
        Function< int[] , Integer > max;

        max = (a) -> {
            int maxValue = Integer.MIN_VALUE;
            for (int each : a) {
                if (each>maxValue) maxValue = each;
            }
            return maxValue;
        };

        int[] arr = {1,2,3};
        System.out.println(  max.apply(arr)  );

        //create a function that can swap the first and last elements of an array
        Function<String[],String[]> swap;

        swap = (a) -> {
            List<String> list = new ArrayList<>(Arrays.asList(a));
            Collections.swap(list, 0 , a.length -1);

            return list.toArray(new String[0]);
        };

        String[] names = {"Muhammed", "Ali Yahya","Defne","Hülya"};
        System.out.println(  Arrays.toString( swap.apply(names)  ) );

        // Create a function that can reverse an array and returns it

        Function< String[] , String[] > reverseArray = a -> {
            List<String> list = new ArrayList<>(Arrays.asList(a));
            Collections.reverse(list);
            return list.toArray(new String[0]);
        };

        String[] names2 = {"Muhammed", "Ali Yahya","Defne","Hülya"};
        System.out.println(  Arrays.toString(reverseArray.apply(names2))  );
    }
}
