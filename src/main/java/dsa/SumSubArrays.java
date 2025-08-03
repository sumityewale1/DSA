package dsa;

import java.util.HashMap;
import java.util.Map;

public class SumSubArrays {
    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); // base case: empty subarray sum

        int count = 0, currSum = 0;

        for (int num : nums) {
            currSum += num;

            if (map.containsKey(currSum - k)) {
                count += map.get(currSum - k);
            }

            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int count  = subarraySum(new int[] {1, 2, 3, -2, 5, -3, 1, 2, -1, 4, 2}, 5);
        System.out.println(count);
    }
}
