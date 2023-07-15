package groupStudy;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        //swapping two numbers with temporary variable
        int x = 10, y = 20;
        int temp = x;
        x = y;
        y = temp;

        System.out.println(x + " - " + y);

        //swapping two numbers with arithmetic operators

        int a = 10, b = 20;

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println(a + " - "+b);


    }
}
