package leetCodePractice;

public class PowerOfTwo {
    public static void main(String[] args) {

        PowerOfTwo powerOfTwo = new PowerOfTwo();

        System.out.println(powerOfTwo.isPowerOfTwo(65536 ));

    }

    public boolean isPowerOfTwo(int n) {
        if (n == 0) return false;
        if (n == 1) return true;
        if (n % 2 != 0) return false;
        else return isPowerOfTwo(n/=2);
    }

    public boolean isPowerOfTwo2(int n) {
        if (n == 0) return false;
        if (n == 1) return true;
        if (n % 2 != 0) return false;
        for (int i = 0; i < 31; i++) {
            n /= 2;
            if (n == 1) return true;
            if (n % 2 != 0) return false;
        }
        return true;
    }

    public boolean isPowerOfTwo3(int n) {
        return n>0 && Integer.bitCount(n) == 1;
    }

}
/*
Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.
 */