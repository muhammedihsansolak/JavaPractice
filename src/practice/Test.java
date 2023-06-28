package practice;

public class Test {

    public static void main(String[] args) {

        String str = null;


        try {
            System.out.println(str.charAt(0));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
