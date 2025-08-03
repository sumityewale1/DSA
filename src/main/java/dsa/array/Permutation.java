package dsa.array;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static List<List<Integer>> permute(int[] nums) {
        return permutation(nums, 0, new ArrayList<>(), new ArrayList<List<Integer>>());
    }

    private static List<List<Integer>> permutation(int[] nums, int index, ArrayList<Integer> output, ArrayList<List<Integer>> ouputs) {
        if (index == nums.length) {
            ouputs.add(new ArrayList<>(output));
            return ouputs;
        }
        output.add(nums[index]);
        permutation(nums, index + 1, output, ouputs);
        output.remove(output.size() - 1);
        permutation(nums, index + 1, output, ouputs);
        return ouputs;
    }

    public static void main(String[] args) {
        List<List<Integer>> output = permute(new int[]{1, 2, 3});
        System.out.println(output);
    }
}
