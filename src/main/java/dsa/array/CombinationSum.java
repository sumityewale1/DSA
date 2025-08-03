package dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    public static List<List<Integer>> combinationSum(int[] inputArray, int target) {
        List<List<Integer>> results = new ArrayList<>();
        int index = 0;
        Arrays.sort(inputArray);
        backTrack(inputArray, index, target, new ArrayList<>(), results);
        return results;
    }

    private static void backTrack(int[] inputArray, int index, int target, List<Integer> result, List<List<Integer>> results) {

        if (target == 0) {
            results.add(new ArrayList<>(result));

            return;
        }

        for (int i = index; i < inputArray.length; i++) {

            if (inputArray[i]<target) {
                result.add(inputArray[i]);
                backTrack(inputArray, i, target - inputArray[i], result, results);
                result.remove(result.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] inputArray = new int[]{2, 3, 6, 7};
       List<List<Integer>> rs = combinationSum(inputArray, 7);
        System.out.println(rs);
    }
}
