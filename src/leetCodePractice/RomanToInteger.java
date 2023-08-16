package leetCodePractice;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        int result = 0;
        int prevValue = 0;
        for (char c : s.toCharArray()) {
            int currValue = 0;
            switch (c) {
                case 'I':
                    currValue = 1;
                    break;
                case 'V':
                    currValue = 5;
                    break;
                case 'X':
                    currValue = 10;
                    break;
                case 'L':
                    currValue = 50;
                    break;
                case 'C':
                    currValue = 100;
                    break;
                case 'D':
                    currValue = 500;
                    break;
                case 'M':
                    currValue = 1000;
                    break;
            }
            if (currValue > prevValue) {
                result += currValue - (2 * prevValue);
            } else {
                result += currValue;
            }
            prevValue = currValue;
        }
        return result;
    }

    public static int romanToInt2(String s) {
        int result = 0;
        int prevValue = 0;
        for (char c : s.toCharArray()) {
            int currValue = switch (c) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> 0;
            };
            if (currValue > prevValue) {
                result += currValue - (2 * prevValue);
            } else {
                result += currValue;
            }
            prevValue = currValue;
        }
        return result;
    }


}
