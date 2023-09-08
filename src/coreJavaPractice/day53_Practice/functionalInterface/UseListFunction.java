package coreJavaPractice.day53_Practice.functionalInterface;

import java.util.*;

public class UseListFunction {

    public static void main(String[] args) {

        //1.1 Create a function that can return the maximum number from a list of Integer
        //1.2 Create a function that can return the minimum number from a list of Integer

        ListFunction<Integer, Integer> max = (p) -> {
            return Collections.max(p);
        };

        ListFunction<Integer, Integer> min = (p) -> {
            return Collections.min(p);
        };

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(max.apply(list) + " - " + min.apply(list));

        System.out.println("----------------------");
        //1.3 Create a function that can return the longest String from a List of String
        //1.4 Create a function that can return the shortest String from a List of String

        ListFunction<String, String> longestString;

        longestString = p -> {
            String result = "";
            for (String each : p) {
                if (each.length() > result.length()) result = each;
            }
            return result;
        };

        ListFunction<String, String> shortestString;

        shortestString = p -> {
            String result = p.get(0);
            for (String each : p) {
                if (each.length() < result.length()) result = each;
            }
            return result;
        };

        List<String> names = new ArrayList<>(Arrays.asList("Muhammed", "Hülya", "Ali Yahya", "Defne"));
        System.out.println(longestString.apply(names));
        System.out.println(shortestString.apply(names));

        System.out.println("----------------------");
        //1.5 Create a function that can convert List of integer to int array

        ListFunction<Integer, int[]> listToIntArr = p -> {
            int[] arr = new int[p.size()];
            int i = 0;
            for (Integer each : p) {
                arr[i++] = each;
            }
            return arr;
        };

        List<Integer> list2 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        int[] array = listToIntArr.apply(list2);
        System.out.println(Arrays.toString(array));

        System.out.println("----------------------");
        //1.6 Create a function that can convert List of double to double array

        ListFunction<Double, double[]> listToDoubleArr = p -> {
            double[] arr = new double[p.size()];
            int i = 0;
            for (Double each : p) {
                arr[i++] = each;
            }
            return arr;
        };

        List<Double> listDouble = new Stack<>();
        listDouble.add( (double) 1);
        listDouble.add( (double) 2);
        listDouble.add( (double) 3);
        listDouble.add( (double) 4);
        listDouble.add( (double) 5);

        double[] array2 = listToDoubleArr.apply(listDouble);
        System.out.println(Arrays.toString(array2));


    }
}
