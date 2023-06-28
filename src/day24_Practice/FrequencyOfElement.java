package day24_Practice;

public class FrequencyOfElement {

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 1, 2, 3, 4, 4, 5};
        int result = frequencyOfElement(arr, 4);//2
        System.out.println(result);
    }

    public static int frequencyOfElement(int[] arr, int element) {

        int count = 0;
        for (int each : arr) {
            if (each == element)
                count++;
        }
        return count;
    }
}
/*
5. create method that accepts one integer array and one integer number and returns the frequency of the number

                    Ex:
                        int[] array ={1,1,1,1,1,2,2};

                        frequency(array, 1) ==> 5

 */