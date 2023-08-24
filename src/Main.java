import java.io.FileReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
//                  3,5,11,15,16
        int[] arr = {16,3,11,5,15};
        int target = 8;
        System.out.println(Arrays.toString(twoSum(arr, target)));
        System.out.println(Arrays.toString(twoSum2(arr, target)));
    }

    public static int[] twoSum2(int[] arr, int target){

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put( arr[i] , i );
        }
        Arrays.sort(arr);
        int left = 0; //5
        int right = arr.length -1; //16

        while (left < right){

            if (arr[left] + arr[right] == target){
                return new int[]{  map.get( arr[left] ) , map.get(arr[right]) };
            } else if ( arr[left] + arr[right] < target) {
                left++;
            } else {
                right--;
            }


        }
        return new int[]{};
    }






    public static int[] twoSum(int[] arr, int target){
        //  element    index
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int pair = target - arr[i];

            if (map.containsKey(pair)) return new int[]{arr[i] , pair  };
            else map.put( arr[i] , i );
        }
        return new int[]{};

    }


}













/*
 Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put( arr[i] , i );
        }

        for (int i = 0; i < arr.length; i++) {
            int pair = target - arr[i];
            if (map.containsKey(pair)) return new int[]{ pair , arr[i] };
            else  map.put( arr[i] , i );
        }
        return new int[]{};
 */