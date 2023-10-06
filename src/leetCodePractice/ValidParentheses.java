package leetCodePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class ValidParentheses {

    public static void main(String[] args) {

        String str = "()[])";
        System.out.println(isValid(str));

    }


    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if(a == '(' || a == '[' || a == '{') stack.push(a);
            else if(stack.empty()) return false;
            else if(a == ')' && stack.pop() != '(') return false;
            else if(a == ']' && stack.pop() != '[') return false;
            else if(a == '}' && stack.pop() != '{') return false;
        }
        return stack.empty();
    }



    /*
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
     */
}
