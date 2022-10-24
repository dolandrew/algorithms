package algorithms.math;

import java.util.ArrayList;
import java.util.List;

class PascalsTriangle {

    /*
    Given an integer numRows, return the first numRows of Pascal's triangle.
     */

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rows = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        row.add(1);
        rows.add(row);
        if (numRows == 1) {
            return rows;
        }
        for (int i = 1; i < numRows; i++) {
            int j = 1;
            row = new ArrayList<>();
            row.add(1);
            while (j <= i) {
                List<Integer> prevRow = rows.get(i - 1);
                int first = prevRow.get(j-1);
                int second = j < i ? prevRow.get(j) : 0;
                row.add(first + second);
                j++;
            }
            rows.add(row);
        }
        return rows;

        // 1
        // 1 1
        // 1 2 1
        // 1 3 3 1
        // 1 4 6 4 1
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }


}