package day24_Practice;

public class IsPalindrome {

    public static void main(String[] args) {

        String str = "Level";
        isPalindrome(str);

    }
    public static void isPalindrome(String str){
        String reversed = "";
        for (int i = str.length() -1; i >= 0 ; i--) {
          reversed += str.charAt(i);
        }
        boolean isPalindrome = str.equalsIgnoreCase(reversed);
        System.out.println(isPalindrome);
    }




}
//4. By using the reverse method above to create another method named isPalindrome
// that passes a String parameter, the method returns true if the string is palindrome, otherwise returns false