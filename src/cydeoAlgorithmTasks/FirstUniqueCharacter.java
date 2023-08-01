package cydeoAlgorithmTasks;


public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String str = "success";
        System.out.println(firstUnique(str));
    }

    public static char firstUnique(String str){
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (str.indexOf(ch) == str.lastIndexOf(ch)){
                return ch;
            }
        }
        return ' ';
    }
}
