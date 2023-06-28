package day53_Practice.functionalInterface;

public class UseArrayFunction {

    public static void main(String[] args) {

        //2.1 & 2 Create a function that can return the maximum & minimum number from an array of Integers

        ArrayFunction<Integer, Integer> max = p -> {
            int maxValue = Integer.MIN_VALUE;
            for (Integer each : p) {
                if (each > maxValue) maxValue = each;
            }
            return maxValue;
        };
        ArrayFunction<Integer, Integer> min = p -> {
            int minValue = Integer.MAX_VALUE;
            for (Integer each : p) {
                if (each < minValue) minValue = each;
            }
            return minValue;
        };

        Integer[] arr = {1,2,3,4,5};

        System.out.println(  max.apply(arr)  );
        System.out.println(  min.apply(arr)  );

        System.out.println("-------------------");

        //1.3 & 4 Create a function that can return the longest & shortest String from an array of String

        ArrayFunction<String, String> longestString = p -> {
            String longest = "";
            for (String each : p) {
                if (each.length() > longest.length() ) longest = each;
            }
            return longest;
        };

        ArrayFunction<String, String> shortestString = p -> {
            String shortest = p[0];
            for (String each : p) {
                if (each.length() < shortest.length() ) shortest = each;
            }
            return shortest;
        };

        String[] names = {"Muhammed", "Hülya", "Ali Yahya", "Defne"};

        System.out.println(  longestString.apply(names)  );
        System.out.println(  shortestString.apply(names)  );

    }
}
