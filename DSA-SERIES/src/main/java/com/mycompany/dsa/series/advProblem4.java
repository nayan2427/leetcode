package com.mycompany.dsa.series;
import java.util.ArrayList;

public class advProblem4 {
    public static void findSubsets(int[] arr, int index,
            ArrayList<Integer> current,
            ArrayList<ArrayList<Integer>> result) {

        if (index == arr.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Include
        current.add(arr[index]);
        findSubsets(arr, index + 1, current, result);

        // Backtrack
        current.remove(current.size() - 1);

        // Exclude
        findSubsets(arr, index + 1, current, result);
    }

    public static void main(String[] args) {

        ArrayList<Integer> current = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        findSubsets(new int[] { 1, 2, 3 }, 0, current, result);

        System.out.println(result);
    }
}
