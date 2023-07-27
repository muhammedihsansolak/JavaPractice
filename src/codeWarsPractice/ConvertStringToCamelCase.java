package codeWarsPractice;

public class ConvertStringToCamelCase {
    public static void main(String[] args) {
        String str = "The_Stealth_Warrior";
        System.out.println(toCamelCase(str));
    }

    static String toCamelCase(String s) {
        String [] arr = new String[0];
        String result = "";
        if (s.contains("-")){
           arr = s.split("-");
        }else {
            arr = s.split("_");
        }

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                result += arr[i];
                continue;
            }
            arr[i] = (arr[i].charAt(0) + "").toUpperCase() + arr[i].substring(1);
            result += arr[i];
        }
        return result;
    }


}

/*
Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case). The next words should be always capitalized.

Examples
"the-stealth-warrior" gets converted to "theStealthWarrior"

"The_Stealth_Warrior" gets converted to "TheStealthWarrior"

"The_Stealth-Warrior" gets converted to "TheStealthWarrior"
 */