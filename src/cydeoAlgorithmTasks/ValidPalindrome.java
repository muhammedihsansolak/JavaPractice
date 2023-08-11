package cydeoAlgorithmTasks;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "   A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome2(str));

        str = str.replaceAll( "[^A-Za-z0-9]" , "" );
        System.out.println(str);
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replace("i", "ı");
        String string = "";
        for (char each : s.toCharArray()) {
            if (Character.isLetter(each)) string += each;
        }
        String reversed = new StringBuilder(string).reverse().toString();
        return string.equalsIgnoreCase(reversed);
    }

    public static boolean isPalindrome2(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if (!Character.isLetterOrDigit(currFirst )) {
                start++;
            } else if(!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }

        public boolean isPalindrome3(String s) {
            String actual = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
            String rev = new StringBuffer(actual).reverse().toString();
            return actual.equals(rev);
        }
        /*
"[^A-Za-z0-9]": This is a regular expression pattern enclosed in square brackets. Let's break it down:

^ inside the square brackets is used as a negation operator. It means "not."
A-Za-z represents all letters from A to Z (uppercase) and a to z (lowercase), covering the entire alphabet.
0-9 represents all digits from 0 to 9.
So, [^A-Za-z0-9] essentially matches any character that is not an alphanumeric character (not a letter or a digit).
         */



}
/*
Write a function that accepts a string and determines whether it is a palindrome, ignoring nonalphanumeric characters and case and returns true if it is palindrome.
(A string is said to be palindrome if it reads the same backward as forward, after converting all
uppercase letters into lowercase letters and removing all non-alphanumeric characters).
Examples:
Input: Do geese see God? Output: True
Input: Was it a car or a cat I saw? Output: True
Input: A brown fox jumping over Output: False
Constraints:
• 1 <= s.length <= 2 * 105
• s consists only of printable ASCII characters.

You may try two pointer technique for second question to improve your time & space complexity.
Two Pointer Strategy / Technique
• The name, “two pointers”, explains the strategy clearly.
• It's the use of two different pointers (usually to keep track of array, ArrayList or String
indices) to solve a problem with the benefit of saving time and space.
• A pointer is a reference to an object.
• In many problems involving collections such as arrays or lists, we should analyze each
element of the collection compared to its other elements.
• We can process two elements per loop instead of just one. Common patterns in the twopointer approach entail:
▪ Two pointers, each starting from the beginning and the end until they both meet.
▪ One pointer moving at a slow pace, while the other pointer moves at twice the speed
 */