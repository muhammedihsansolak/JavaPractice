package day25_Practice;

public class MaxNumber {
    public static void main(String[] args) {

        int[] arr = {10,30,50,20,80,40,60,99,66};
        int result = max(arr);
        System.out.println(result);

    }
    //finds the max element in an given array
    public static int max(int[] arr) {
        int result = arr[0];
        for (int each : arr) {
            if (each>result){
                result = each;
            }
        }
        return result;
    }
    public static double max(double[] arr) {
        double result = arr[0];
        for (double each : arr) {
            if (each>result){
                result = each;
            }
        }
        return result;
    }

    public static long max(long[] arr) {
        long result = arr[0];
        for (long each : arr) {
            if (each>result){
                result = each;
            }
        }
        return result;
    }

    public static short max(short[] arr) {
        short result = arr[0];
        for (short each : arr) {
            if (each>result){
                result = each;
            }
        }
        return result;
    }

    public static float max(float[] arr) {
        float result = arr[0];
        for (float each : arr) {
            if (each > result) {
                result = each;
            }
        }
        return result;
    }

    public static byte max(byte[] arr) {
        byte result = arr[0];
        for (byte each : arr) {
            if (each > result) {
                result = each;
            }
        }
        return result;
    }

    

    

}
/*
Task 2:
	1. create a method that can return the max number from an integer array

	2. create a method that can return the max number from double array

	3. create a method that can return the max number from long array

	4. create a method that can return the max number from short array

	5. create a method that can return the max number from float array

	6. create a method that can return the max number from byte array
 */