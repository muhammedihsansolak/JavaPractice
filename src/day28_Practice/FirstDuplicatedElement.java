package day28_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstDuplicatedElement {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,2,3,4,4,5,6,7,7));

        int firstDup = 0;
        for (Integer each : list) {
            int count = 0;
            for (Integer each2 : list) {
                if (each == each2){
                    count++;
                }
            }
            if (count == 2){
                firstDup = each;
                break;
            }
        }
        System.out.println(firstDup);

    }
}
/*
7. Write a program that can return the first duplicated element from an arrayList of Integer
		Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output:
				2
 */