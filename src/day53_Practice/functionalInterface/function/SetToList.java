package day53_Practice.functionalInterface.function;

import java.util.*;
import java.util.function.Function;

public class SetToList {

    public static void main(String[] args) {

        //4.2 Create a function that can convert a Set of Integers to List of Integers

        Function< Set<Integer>, List<Integer> > setToListInteger = (p) -> {
            return new ArrayList<>(p);
        };

        Set<Integer> set = new TreeSet<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> list = (ArrayList)setToListInteger.apply(set);
        System.out.println(list);

        //4.3 Create a function that can convert a Set of String to List of String
        Function< Set<String>, List<String> > setToListString = (p) -> {
            return new ArrayList<>(p);
        };
        Set<String> set2 = new HashSet<>(Arrays.asList("A","B"));
        System.out.println(setToListString.apply(set2));
    }
}
