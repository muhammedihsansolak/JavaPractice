package coreJavaPractice.day53_Practice.functionalInterface.predicate;

import java.util.function.Predicate;

public class HasDuplicated {

    public static void main(String[] args) {

        //3.1 Create a function that can verify if a strong contains duplicated characters

        Predicate<String> hasDuplicated = (p) -> {
            String uniques = "";
            for (char each : p.toCharArray()) {
                if ( ! uniques.contains(each+"")) uniques+=each;
            }
            return uniques.equals(p);
        };

        String str = "Muhammed";
        System.out.println(  hasDuplicated.test(str)  );


        System.out.println("-------------------------------");
        /*
        3.2 Create a function that can verify if a password is a strong password. Characteristics of strong passwords are:
        	            1 Password must be at least have 8 characters long, and should not contain space
        		        2 PassWord should at least contain one upper case letter
        		        3 PassWord should at least contain one lower case letter
        		        4 Password should at least contain one special characters
        		        5 Password should at least contain a digit
         */
        Predicate<String> isStrongPassword = (p) -> {
            boolean result1 = false,
                    result2 = false,
                    result3 = false,
                    result4 = false,
                    result5 = false;

            if (p.length() > 8 && ( ! p.contains(" ")) ){
                result1 = true;
            }

            for (char each : p.toCharArray()) {
                if (Character.isUpperCase(each)) result2 = true;
            }

            for (char each : p.toCharArray()) {
                if (Character.isLowerCase(each)) result3 = true;
            }

            for (char each : p.toCharArray()) {
                if (!Character.isLetterOrDigit(each)) result4 = true;
            }

            for (char each : p.toCharArray()) {
                if (Character.isDigit(each)) result5 = true;
            }

            if (result1&&result2&&result3&&result4&&result5) {
                return true;
            }else {
                return false;
            }
        };

        String password = "Muhammed99.";
        System.out.println(isStrongPassword.test(password));

    }
}
