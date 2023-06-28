package day53_Practice.functionalInterface.biPredicate;

import java.util.*;
import java.util.function.BiPredicate;

public class Tasks {

    public static void main(String[] args) {

        /*
        5.1 Create a function that can check if two array are equal and contains the same elemnts
				ex: arr1 = {3,2,1}
					arr2 = {2,1,3}

				output: true
         */

        BiPredicate<int[], int[]> isEqual = (a, b) -> {
            Arrays.sort(a);
            Arrays.sort(b);
            return Arrays.equals(a, b);
        };
        int[] arr1 = {1, 3, 2},
                arr2 = {2, 1, 3};

        System.out.println(isEqual.test(arr1, arr2));

        System.out.println("--------------");

        /*
        5.2 Create a function that can check if the first array contains all the elemnts of the second array:
				ex: arr1 = {1,2,3,4,5,6}
					arr2 = {7,8}

				output: false
         */

        BiPredicate<int[], int[]> contains = (a, b) -> {
            int count = 0;
            for (int each1 : a) {
                for (int each2 : b) {
                    if (each1 == each2) count++;
                }
            }
            return count == b.length;
        };

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8},
                array2 = {7, 8};
        System.out.println(contains.test(array1, array2));

        System.out.println("--------------");
        /*
        5.3 Create a function that can check if two List of Integers are equal and contains the same elemnts
				ex: list1 = {3,2,1}
					list2 = {2,1,3}

				output: true
         */

        BiPredicate<List<Integer>, List<Integer>> isEqualList;

        isEqualList = (a, b) -> {
            Collections.sort(a);
            Collections.sort(b);
            Integer[] arr3 = a.toArray(new Integer[0]);
            Integer[] arr4 = b.toArray(new Integer[0]);
            return Arrays.equals(arr3, arr4);
        };

        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 3, 2));
        List<Integer> integerList2 = new ArrayList<>(Arrays.asList(3, 1, 2));

        System.out.println(isEqualList.test(integerList, integerList2));

        System.out.println("--------------");

        /*
        5.4 Create a function that can check if the first List contains all the elemnts of the second List:
				ex: list1 = {1,2,3,4,5,6}
					list2 = {7,8}

				output: false
         */

        BiPredicate<List<Integer>, List<Integer>> listBiPredicate = (a, b) -> {
            int count = 0;
            for (Integer each1 : a) {
                for (Integer each2 : b) {
                    if (each1 == each2) count++;
                }
            }
            return count == b.size();
        };

        List<Integer> l1 = new Vector<>(Arrays.asList(1,2,3,4,5,6,7,8));
        List<Integer> l2 = new LinkedList<>(Arrays.asList(7,8));

        System.out.println( listBiPredicate.test(l1, l2) );


    }
}
