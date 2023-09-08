package coreJavaPractice.day25_Practice;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "java";
        String result = uniqueChars(str);
        System.out.println(result);
    }

    public static String uniqueChars(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
           if ( ! result.contains(""+str.charAt(i))  ){
               result += str.charAt(i);
           }
        }
        return result;

    }
}
