package groupStudy.appleTask;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {


        List<String> list = Arrays.asList("Java", "level", "Anna", "Wooden Spoon");

        list = list.stream()
                .filter(p -> new StringBuilder(p).reverse().toString().equalsIgnoreCase(p)).collect(Collectors.toList());
        System.out.println(list);


/*
Wirte a program that can return the palindrome Strings from a list:
		Ex:
			list = {"Java", "level", "Anna", "Wooden Spoon"};

		output:
			{"level", "Anna"}
 */
    }

}
