package day50_Practice;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class FindMax {

    public static void main(String[] args) {

        Integer[] arr = {1,2,3,4,67,3,4,346876,3,4,35,2,34,52,4,43,5,43443,56};

        Set<Integer> set = new TreeSet<>();

        set.addAll(Arrays.asList(arr));

        arr = set.toArray(new Integer[0]);
        System.out.println(arr[arr.length-1]);





    }
}
