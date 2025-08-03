package dsa;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class firstnegativeineveryarray {

    public static ArrayList<Long> firstNegative(int[] inputArray, int windowSize) {
        int left = 0;
        Deque<Integer> positionOfNegativeNumbers = new LinkedList<>();
        ArrayList<Long> resultListForEachSubArray = new ArrayList<>();

        for (int right = 0; right < inputArray.length; right++) {

            if (inputArray[right] < 0) {
                positionOfNegativeNumbers.addLast(right);
            }
            while (!positionOfNegativeNumbers.isEmpty() && positionOfNegativeNumbers.peekFirst() < left) {
                positionOfNegativeNumbers.removeFirst();
            }
            if (right - left + 1 == windowSize) {
                // check a result
                if (!positionOfNegativeNumbers.isEmpty()) {
                    resultListForEachSubArray.add(Long.valueOf(inputArray[positionOfNegativeNumbers.peekFirst()]));
                } else {
                    resultListForEachSubArray.add(0L);
                }
                left++;
            }


        }
        return resultListForEachSubArray;
    }

    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -16, 30, 16, 28, 12};
        int k = 3;
        System.out.println(firstNegative(arr, k));
        // Expected Output: [-1, -1, -7, -16, -16, 0, 0]
    }

}
