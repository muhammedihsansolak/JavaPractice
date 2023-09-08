package coreJavaPractice.day50_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class CountDuplicatedElements {

    public static void main(String[] args) {

        Integer[] arr = {1,1,2,2,3,3,4,5};

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(arr));

        HashSet<Integer> list2 = new HashSet<>(list);

        System.out.println(list.size() - list2.size());

    }
}
