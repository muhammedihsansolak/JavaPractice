package coreJavaPractice.day24_Practice;

public class Contains {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        boolean contains = isContainsElement(arr, 5);
        System.out.println(contains);
    }

    public static boolean isContainsElement(int[] arr, int element) {

        boolean contains = false;
        for (int each : arr) {
            if (each == element) {
                contains = true;
                break;
            }
        }
        return contains;
    }
}
/*
9. Create a method named contains that passes one integer array and one integer parameters, the method returns true if the given integer is contained in the given array, otherwise returns false

				Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;

					contains(arr, num) ===> false
 */