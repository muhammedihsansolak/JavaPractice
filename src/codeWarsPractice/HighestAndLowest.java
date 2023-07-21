package codeWarsPractice;

import java.util.*;
import java.util.stream.Collectors;

public class HighestAndLowest {

    public static String highAndLow(String numbers) {
        List<String> list = new ArrayList<>(Arrays.asList(numbers.split(" ")));
        List<Integer> nums = new ArrayList<>();
        for (String each : list) {
            int num = Integer.parseInt(each);
            nums.add(num);
        }
        int max = Collections.max(nums), min = Collections.min(nums);
        return max+" "+min;
    }

    public static String highAndLow2(String numbers) {
        int[] arr = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        return arr[arr.length-1]+" "+arr[0];
    }

}
/*
In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

Examples
highAndLow("1 2 3 4 5")  // return "5 1"
highAndLow("1 2 -3 4 5") // return "5 -3"
highAndLow("1 9 3 4 -5") // return "9 -5"
Notes
All numbers are valid Int32, no need to validate them.
There will always be at least one number in the input string.
Output string must be two numbers separated by a single space, and highest number is first.
 */