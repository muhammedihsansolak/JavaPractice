package day25_Practice;
//todo RE-DO THIS TASK
public class CountDuplicatedElements {
    public static void main(String[] args) {
        String[] arr = {"1", "1"};
        int result = getDup(arr);
        System.out.println(result);
    }

    public static int getDup(String[] arr) {
        int countEach = 0, totalCount = 0;
        String duplicates = "";

        for (String each : arr) {
            countEach = 0;
            for (String element : arr) {
                if (each.equals(element)) {
                    countEach++;
                }
            }
            if (countEach != 1 && !duplicates.contains(each)) {
                duplicates += each;
                totalCount += countEach;
            }
        }
        return totalCount ;
    }

}
/*
Finish the method called `getDup()` that will take a `String[]` argument `arr` and return an `int`. Find and return the number of duplicate elements. Any element is duplicate if it appears in the array more than once. The `getDup()` method is already called in the main method with an argument.

#### This is a `return` method with `String[]` parameter

Main topics: methods, Scanner, arrays, loops, String

Example:
```
	String [] arr = {"1","2","aa"',"1"};
	getDup(arr);

output:
	2
	("1" is duplicated and there are two "1"s so return is 2)
```
Example:
```
	String [] arr = {"1","2","aa"',"1", "aa"};
	getDup(arr);

output:
	4
	("1" is duplicated and there are two "1"s and two "aa"s so return is 4)
```
Example:
```
	String [] arr = {"1","g","aabb',"7","7","2","aa"',"7"};
	getDup(arr);

output:
	3
	("7" is duplicated three times and there is not other duplicate elements so return is 3)
 */




