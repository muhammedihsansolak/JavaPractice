import java.io.FileReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        List list = new ArrayList<>();

        list.add(15);
        list.add("String");
        list.add(100L);

        list.forEach(p -> System.out.println(p));

        Set set = new HashSet<>(list);

        System.out.println(set);

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