package leetCodePractice;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static void main(String[] args) {
        System.out.println(generate(4));
    }

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> allrows = new ArrayList<List<Integer>>();
        ArrayList<Integer> row = new ArrayList<Integer>();
        for(int i=0;i<numRows;i++) {
            row.add(0, 1);

            for(int j=1;j<row.size()-1;j++)


                row.set(j, row.get(j)+row.get(j+1));


            allrows.add(new ArrayList<Integer>(row));
        }
        return allrows;
    }

    /*
    Given an integer numRows, return the first numRows of Pascal's triangle.
    In Pascal's triangle, each number is the sum of the two numbers directly above it.

    Input: numRows = 5
    Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
     */
}
