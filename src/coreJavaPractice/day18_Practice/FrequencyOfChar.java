package coreJavaPractice.day18_Practice;

public class FrequencyOfChar {
    public static void main(String[] args) {

        String str = "aaabbbccca  v";
        String count = countLetters(str);
        System.out.println(count);


    }

    public static String countLetters(String str) {
        String result = "";

            for (int i = 0; i <= str.length() - 1; i++) {
                int count = 0;
                for (int j = 0; j <= str.length() - 1; j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }
                if (!result.contains("" + str.charAt(i))) {
                    result += "" + count + str.charAt(i);
                }
            }

        return result;
    }


}
