package leetCodePractice;

import java.util.HashMap;
import java.util.Map;

public class ExcelSheetColumnNumber {

    public static void main(String[] args) {
        System.out.println(titleToNumber("FXSHRXW"));
    }

    /**
     * every time we add its corresponding value then multiply with 26 since 26 is our base
     */

    public static int titleToNumber(String columnTitle) {
        //Adding corresponding values to map
        Map<Character,Integer> hashMap = new HashMap<>();
        char ch = 'A';
        for (int i = 1; i <= 26; i++) {
            hashMap.put( ch , ch-'A'+1  );
            ch++;
        }
        //calculating based on parameter. every time add each value then multiply with 26 since 26 is our base
        int count = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            count *=26;
            count += hashMap.get(columnTitle.charAt(i));
        }
        return count;
    }


        public int titleToNumber2(String s) {
            if (s == null) return -1;
            int sum = 0;
            for (char c : s.toUpperCase().toCharArray()) {
                sum *= 26;
                sum += c - 'A' + 1;
            }
            return sum;
        }




}
/*
Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...


Example 1:

Input: columnTitle = "A"
Output: 1
Example 2:

Input: columnTitle = "AB"
Output: 28
 */