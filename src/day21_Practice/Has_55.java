package day21_Practice;

public class Has_55 {

    public static void main(String[] args) {

        int[] arr = {1, 5, 4, 1, 5};

        boolean is55 = false;
        for (int i = 0, j = 1; j < arr.length; i++, j++) {
            if (arr[i] == 5 & arr[j] == 5){
                is55 = true;
                break;
            }
        }
        System.out.println(is55);

    }
}
/*
### Given an `int []` `nums`, print `true` if the array has a `5` that is also next to another `5`. Both conditions need to be met otherwise print `false`

#### Note: The loop used in the given code is to dynamically create the int array. You don't need to fully understand this part yet,
 focus only on having access to an array and has some numbers.

Main topics: arrays, primitive datatypes, concatenation, index, operators. loops, if statement

Example:
```
Input:
  [1, 5, 5, 1, 1]

Output:
  true
```
Example:
```
Input:
  [1, 5, 4, 1, 5]

Output:
  false

-> The 5s are not next to each other
```
Example:
```
Input:
  [1, 4, 4, 1, 99]

Output:
  false

-> There is no 5 in this array
 */