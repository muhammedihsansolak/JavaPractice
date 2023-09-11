package coreJavaPractice.groupStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HighAndLow {
    public static void main(String[] args) {
        String str = "1 2 3 4 5";
        String result = highAndLow(str);
    }
    public static String highAndLow(String str){

        List<String> list = new ArrayList<>(Arrays.asList(str) );
        List<Integer> numbers = new ArrayList<>();

        for (String each : list) {
            int eachNum = Integer.parseInt(each);
            numbers.add(eachNum);
        }
        int max = Collections.max(numbers), min = Collections.min(numbers);
        return max+" "+min;

    }
}
