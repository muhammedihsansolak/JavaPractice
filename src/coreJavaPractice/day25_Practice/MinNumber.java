package coreJavaPractice.day25_Practice;

public class MinNumber {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,0,4};
        int result = min(arr);
        System.out.println(result);
    }
//finds the min element in a given array
    public static int min(int[] arr) {
        int result = arr[0];
        for (int each : arr) {
            if (each<result){
                result = each;
            }
        }
        return result;
    }

    public static double min(double[] arr) {
        double result = arr[0];
        for (double each : arr) {
            if (each<result){
                result = each;
            }
        }
        return result;
    }

    public static long min(long[] arr) {
        long result = arr[0];
        for (long each : arr) {
            if (each<result){
                result = each;
            }
        }
        return result;
    }

    public static short min(short[] arr) {
        short result = arr[0];
        for (short each : arr) {
            if (each<result){
                result = each;
            }
        }
        return result;
    }

    public static float min(float[] arr) {
        float result = arr[0];
        for (float each : arr) {
            if (each<result){
                result = each;
            }
        }
        return result;
    }

    public static byte min(byte[] arr) {
        byte result = arr[0];
        for (byte each : arr) {
            if (each<result){
                result = each;
            }
        }
        return result;
    }
    
    
}
