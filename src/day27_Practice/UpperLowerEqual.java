package day27_Practice;

public class UpperLowerEqual {

    public static void main(String[] args) {


        String str = "JAVA java PYTHON python ^+%&";

        int upper = 0,
                lower = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)){
                upper++;
            } else if (Character.isLowerCase(ch)) {
                lower++;
            }
        }
        boolean result = upper == lower;
        System.out.println(result);




    }
}
/*
4. Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true
 */