package codeWarsPractice;

import java.util.Arrays;

public class SumOfParts {

    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 6, 10};
        System.out.println(Arrays.toString(sumParts(arr)));
        System.out.println(Arrays.toString(sumParts2(arr)));
    }

    public static int[] sumParts(int[] ls) { //---> too slow
        int[] arr = new int[ls.length + 1];
        for (int j = 0; j < ls.length; j++) {
            int sum = Arrays.stream(ls).skip(j).reduce(0, Integer::sum);
            arr[j] = sum;
        }
        return arr;
    }

    public static int[] sumParts2(int[] ls) {
        int[] arr = new int[ls.length + 1];
        int sum = 0;
        for (int each : ls) {
            sum += each;
        }
        int i = 0;
        for (int j = 0; j < ls.length; j++) {
            arr[i] = sum;
            sum -= ls[i];
            i++;
        }
        return arr;
    }


}
/*
Let us consider this example (array written in general format):

ls = [0, 1, 3, 6, 10]

Its following parts:

ls = [0, 1, 3, 6, 10]
ls = [1, 3, 6, 10]
ls = [3, 6, 10]
ls = [6, 10]
ls = [10]
ls = []
The corresponding sums are (put together in a list): [20, 20, 19, 16, 10, 0]

The function parts_sums (or its variants in other languages) will take as parameter a list ls and return a list of the sums of its parts as defined above.
 */