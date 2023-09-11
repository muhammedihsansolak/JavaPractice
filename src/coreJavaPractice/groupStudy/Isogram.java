package coreJavaPractice.groupStudy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Isogram {
    public static void main(String[] args) {
        String str = "moose";
        boolean result = isIsogram(str);
        System.out.println(result);

        Map<String,String> map = new HashMap<>();



    }
    public static boolean isIsogram(String str){

        String[] arr = str.split("");

        long n = Arrays.stream(arr)
                .distinct()
                .count();

                return str.length() == n;

    }
}
