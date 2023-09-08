package coreJavaPractice.day53_Practice.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tasks {

    public static void main(String[] args) {

        //1. Write a program that can remove the duplicated elements of an array of String

        String[] arr = {"Muhammed", "Muhammed", "Hülya", "Hülya", "Ali Yahya", "Defne"};

        arr = Arrays.stream(arr).distinct().collect(Collectors.toList()).toArray(new String[0]);

        System.out.println(Arrays.toString(arr));
        //when converting stream to string array, toArray() method return object not string. So we can first collect it as a list then convert it to an array

        System.out.println("--------------------------");

        //2. Write a program that can remove the duplicated elements of a List of String

        List<String> list = new ArrayList<>(Arrays.asList("Muhammed", "Muhammed", "Hülya", "Hülya", "Ali Yahya", "Defne"));

        list = list.stream().distinct().collect(Collectors.toList());//we have to assign it back, since stream can not change data structure

        System.out.println(list);

        System.out.println("--------------------------");

        /*
        3. Write a program that can count how many "java" and "python" does the array has:
			ex: array = {"Java", "jAVa", "pythON"}

			output:
				countJava = 2
				countPython = 1
         */

        String[] array = {"Java", "jAVa", "pythON"};

        long countJava = 0,
                countPython = 0;

        countJava = Arrays.stream(array).filter(p -> p.equalsIgnoreCase("java")).count();
        countPython = Arrays.stream(array).filter(p -> p.equalsIgnoreCase("python")).count();

        System.out.println("countJava = " + countJava);
        System.out.println("countPython = " + countPython);

        System.out.println("--------------------------");

        /*
        4. Write a program that can count how many negative numbers does the array has
		ex: arr = {1,2,3,4,-4,5,-5}

		output:
			2
         */

        int[] arr2 = {1,2,3,4,-4,5,-5};

        System.out.println(  Arrays.stream(arr2).filter(p -> p < 0).count()  );

        System.out.println("--------------------------");

        /*
        5. Write a program that can count how many Positive numbers does the List has
		ex: List = {1,2,3,4,-4,5,-5}

		output:
			5
         */

        List<Integer> numbers = new LinkedList<>(Arrays.asList(1,2,3,4,-4,5,-5));

        System.out.println(  numbers.stream().filter(p -> p > 0).count()  );

        System.out.println("--------------------------");

        /*
        6. Wirte a program that can return all the negative numbers of the array as a new array
		ex:
			arr = {1,2,3,4,-4,5,-5}

		output:
			{-4, -5}
         */

        int[] nums = {1,2,3,4,-4,5,-5};

        nums = Arrays.stream(nums).filter(p -> p < 0).toArray();

        System.out.println(  Arrays.toString(nums)  );

        System.out.println("--------------------------");

        /*
        7. Write a program that can return all the positive numbers of List without the duplcaites
		ex:
			list =

		output:
			{1,2,3,4,5}
         */

        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(1,2,3,4,-4,5,-5,1,2,3,4));

        numbers2 = numbers2.stream().distinct().filter(p -> p > 0).collect(Collectors.toList());

        System.out.println(numbers2);

        System.out.println("--------------------------");

        /*
        8. Wirte a program that can return the palindrome Strings from a list:
		Ex:
			list = {"Java", "level", "Anna", "Wooden Spoon"};

		output:
			{"level", "Anna"}
         */

        List<String> strings = new LinkedList<>(Arrays.asList("Java", "level", "Anna", "Wooden Spoon"));

        strings =  strings.stream().filter(p -> new StringBuilder(p).reverse().toString().equalsIgnoreCase(p)).collect(Collectors.toList());

        System.out.println(strings);

        System.out.println("--------------------------");

        /*
        6. Write a program that can return the unique elements of an array as a new array:

		Ex: arr = {1,1,2,3,3,4,5,5,6};

		output:
			{2,4,6}

         */

        int[] numbers3 = {1,1,2,3,3,4,5,5,6};

        int[] result = Arrays.stream(numbers3)
                .distinct()
                .toArray();

        System.out.println(Arrays.toString(result));

        System.out.println("--------------------------");

        //**** Stream.iterate() ****

        Stream.iterate( 0,n -> n+2)
                .limit(5)
                .forEach(System.out::println);

        //Fibonacci Series

        int firstNum = 0, secondNum = 1;
        System.out.print(firstNum+" "+secondNum);
        for (int i = 0; i <= 20 ; i++) {
            int nextNum = firstNum+secondNum;
            System.out.print(" "+nextNum);
            firstNum = secondNum;
            secondNum = nextNum;
        }


    }
}
