package dsa.array;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsets {


    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        return getSubset(nums, 0, new ArrayList<Integer>(), list);
    }

    private static List<List<Integer>> getSubset(int[] input, int index, List<Integer> output, List<List<Integer>> outputs) {
        if (index == input.length) {
            outputs.add(new ArrayList<>(output));
            System.out.println(outputs);
            return outputs;
        }
        output.add(input[index]);
        getSubset(input, index + 1, output, outputs);
        output.remove(output.size() - 1);
        getSubset(input, index + 1, output, outputs);
        return outputs;
    }

    public static void printAllSubset(String inputString, int index, String output) {
        if (index == inputString.length()) {
            System.out.print(output + " / ");
            return;
        }

        printAllSubset(inputString, index + 1, output + inputString.charAt(index));
        if (index == 0 || inputString.charAt(index) != inputString.charAt(index - 1)) {
            printAllSubset(inputString, index + 1, output);
        }
    }

    public static void main(String[] args) {
        subsets(new int[]{1, 2, 3});
        printAllSubset("abbc", 0, "");
    }
}
