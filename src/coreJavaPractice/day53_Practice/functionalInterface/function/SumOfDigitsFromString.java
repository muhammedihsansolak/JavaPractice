package coreJavaPractice.day53_Practice.functionalInterface.function;

import java.util.function.Function;

public class SumOfDigitsFromString {

    public static void main(String[] args) {

        //4.1 Create a function that can return the sum of digits from a string

        Function<String,Integer> sumOfDigits = (p) -> {
            String str = "";
            for (char each : p.toCharArray()) {
                if (Character.isDigit(each)) str+=each;
            }


            int result = 0;
            for (String each : str.split("")) {
                result += Integer.parseInt(each);
            }
            return result;
        };
        String str = "Muhammed 99";

        System.out.println(sumOfDigits.apply(str));


    }
}
