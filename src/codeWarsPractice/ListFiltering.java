package codeWarsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFiltering {

    public static void main(String[] args) {
        System.out.println(filterList(Arrays.asList(1, 2, "a", "b")));
    }

    public static List<Object> filterList(final List<Object> list) {
        List<Object> objects = new ArrayList<>(list);
        objects.removeIf(p -> p instanceof String);
        return objects;
    }

}
/*
In this kata you will create a function that takes a list of non-negative integers and strings and returns a new list with the strings filtered out.
 */