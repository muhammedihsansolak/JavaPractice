package day25_Practice;

public class RemoveMe {
    public static void main(String[] args) {
        String str = "java methods";
        String result = coverString(str, "me");
        System.out.println(result);
    }

    public static String coverString(String main, String coverMe) {
        // your code here

       if (main.contains(coverMe)){
           main = main.replace(coverMe, "["+coverMe+"]");
       }else{
           main = main.replace(main, "["+main+"]");
       }
       return main;
    }
}
