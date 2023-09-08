package coreJavaPractice.day24_Practice;

public class Reverse {

    public static void main(String[] args) {

        String name = "Muhammed";
        String result = reverse(name);
        System.out.println(result);

    }
    public static String reverse(String str){
        String result = "";
        for (int i = str.length() - 1; i >= 0 ; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
//create a method named reverse that passes one string parameter, the method can return the reversed string