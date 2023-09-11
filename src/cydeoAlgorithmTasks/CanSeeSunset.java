package cydeoAlgorithmTasks;

import java.util.*;

public class CanSeeSunset {

    public static void main(String[] args) {

        System.out.println(sunsetViews(new int[]{3, 5, 4, 4, 3, 1, 3, 2}, "EAST"));

    }


    public static List<Integer> sunsetViews(int[] buildings, String direction) {
        List<Integer> result = new ArrayList<>();
        int n = buildings.length;

        if (direction.equals("EAST")) {
            int maxHeight = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (buildings[i] > maxHeight) {
                    result.add(i);
                    maxHeight = buildings[i];
                }
            }
        } else if (direction.equals("WEST")) {
            int maxHeight = 0;
            for (int i = 0; i < n; i++) {
                if (buildings[i] > maxHeight) {
                    result.add(i);
                    maxHeight = buildings[i];
                }
            }
        }

        return result;
    }


}
/*
Given an array of buildings and a direction that all of the buildings face, return an array of the indices of the buildings that can
see the sunset. A building can see the sunset if it's strictly taller than all of the buildings that come after it in the direction
that it faces. The input array named buildings contains positive, non-zero integers representing the heights of the buildings. A
building at index i thus has a height denoted by buildings[i] . All of the buildings face the same direction, and this direction is
either east or west, denoted by the input string named direction , which will always be equal to either "EAST" or "WEST" . In
relation to the input array, you can interpret these directions as right for east and left for west. Important note: the indices in
the output array should be sorted in ascending order.
Sample Input buildings = [3, 5, 4, 4, 3, 1, 3, 2] direction = "EAST"
Sample Output [1, 3, 6, 7]
 */